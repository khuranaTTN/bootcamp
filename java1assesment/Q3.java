package javaassesment;

public class Q3 {
    //Write a program to find the number of occurrences of a character in a string without using loop?
    public static void main(String[] args) {
        String string = "Chirag Khurana";
                String ch = "a";
        System.out.println(string.length() - string.replace(ch, "").length());
    }
}
