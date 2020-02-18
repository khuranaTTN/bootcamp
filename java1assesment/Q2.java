package javaassesment;

public class Q2 {
    //Write a program to find the number of occurrences of the duplicate words in a string and print them ?
    public static void main(String[] args) {
        String string = "I scream, you scream, we all scream for ice cream";
        int Duplicate;

        string = string.toLowerCase();



        String words[] = string.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for(int i = 0; i<words.length;i++)

        {
            Duplicate = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    Duplicate++;

                    words[j] = "0";
                }
            }


            if (Duplicate > 1 && words[i] != "0")
                System.out.println(words[i]);
        }


    }

}