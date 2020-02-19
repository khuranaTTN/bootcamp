package Q1;
//Create Java classes having suitable attributes for Library management system.Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
public class Q1 {
    public static void main(String[] args) {
        student s1 = new student("Chirag", 6, 7, "info tech");
        s1.issueBook(8, "intro to java");
        s1.getDetails();
        s1.issueBook(9, "Intro to C++");
        s1.getDetails();
    }
}
