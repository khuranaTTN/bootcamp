package java8session.Q7;

interface MyInterface1{
    public static int num = 100;
    public default void display() {
        System.out.println("display method of MyInterface1");
    }
}

public class OverrideDefault implements MyInterface1 {

    public void display() {
        System.out.println("display method of MyInterface1 overwritten.");
    }
    public static void main(String args[]) {
        OverrideDefault obj = new OverrideDefault();
        obj.display();
    }
}

