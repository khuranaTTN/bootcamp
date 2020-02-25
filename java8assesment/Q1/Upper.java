package java8session.Q1;


interface toUpper{
    void test(String  a);
}

public class Upper{
    public static void main(String[] args) {

        toUpper res=(a)->
        {
            System.out.println(a.toUpperCase());
        };
        res.test("company ");
    }
}

