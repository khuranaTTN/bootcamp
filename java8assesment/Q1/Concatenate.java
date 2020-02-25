package java8session.Q1;

interface concatenating{
    void test(String  a, String b);
}

public class Concatenate {
    public static void main(String[] args) {

        concatenating res=(a,b)->
        {
            System.out.println(a+b);;
        };
        res.test("Company ","TTN");
    }
}

