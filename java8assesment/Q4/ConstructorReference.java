package java8session.Q4;

interface detail{

    Employee get(String name, String city, Integer age);
}

class Employee{
    String name;
    String city;
    Integer age;

    public Employee(String name, String city, Integer age) {
        this.name=name;
        this.city=city;
        this.age=age;
    }

    public String toString() {
        return "name: "+name+" city: "+city+" age: "+age;
    }

}
public class ConstructorReference{

    public static void main(String[] args) {

        detail emp= Employee::new;
        System.out.println(emp.get("Chirag", "Delhi", 21));
    }
}

