package java8session.Q1;

interface greater{
    void test(int a, int b);
}
public class GreaterThan {
    public static void main(String[] args) {

        greater res=(a,b)->
        {
            if(a>b)
                System.out.println("true");
            else
                System.out.println("false");
        };
        res.test(12,15);
    }
}
