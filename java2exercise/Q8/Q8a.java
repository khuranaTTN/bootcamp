package Q8;
import java.util.Scanner;
public class Q8a {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String word = s1.nextLine();
        while(!word.equals("done")){
            if(word.charAt(0) == word.charAt(word.length()-1)){
                System.out.println("first charecter = last charecter");
            }
            else{
                System.out.println("first charecter is not equal to last charecter");
            }
            word = s1.nextLine();
        }
    }
}

