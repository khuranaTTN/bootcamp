package javaassesment;

public class Q7 {
    //Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
    static{
        System.out.println("Static block called");
        System.out.println("Chirag");
        System.out.println("Khurana");
        System.out.println(21);
    }


    static String fname = "Chirag";
    static  String lname = "Khurana";
    static int age = 21 ;


    public static void main(String[] args) {

        System.out.println(Q7.fname);
        System.out.println(Q7.lname);
        System.out.println(Q7.age);
        myfun();
    }

    static void myfun(){
        System.out.println("static function");
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(age);
    }
}

