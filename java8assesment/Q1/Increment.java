package java8session.Q1;

interface increment{
    void test(int a);
}

public class Increment {

    public static void main(String[] args) {

        increment res=(a)->
        {
            a=a+1;
            System.out.println(a);
        };
        res.test(12);
    }
}
