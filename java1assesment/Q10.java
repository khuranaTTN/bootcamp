package javaassesment;
//Write a single program for following operation using overloading


public class Q10 {
    // A) Adding 2 integer number
    int sum(int a, int b) {
        return (a + b);
    }

    // B) Adding 2 double
    double sum(double a, double b) {
        return (a + b);
    }

    // C) multiplying 2 float
    float multiply(float a, float b) {
        return (a * b);
    }

    // D) multiply 2 int
    int multiply(int a, int b) {
        return (a * b);
    }

    //E) concat 2 strings
    String concat(String a, String b) {
        return (a + b);
    }

    //F) concat 3 strings
    String concat(String a, String b, String c) {
        return (a + b + c);
    }

    public static void main(String[] args) {
        Q10 q = new Q10();
        System.out.println(q.sum(4, 5));
        System.out.println(q.sum(4.4, 7.9));
        System.out.println(q.multiply(9, 8));
        System.out.println(q.multiply(9.9f, 8.8f));
        System.out.println(q.concat("Chirag ", "Khurana"));
        System.out.println(q.concat("Chirag ", "Khurana ", "Hello!"));
    }
}