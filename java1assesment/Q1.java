package javaassesment;

public class Q1 {
    //Write a program to replace a substring inside a string with other string ?
    public static void main(String[] args) {
        String S1 = "Hello";
        String S2 = "World";
        System.out.println(S1.replace("e", S2.substring( 1, 3)));


    }
}
