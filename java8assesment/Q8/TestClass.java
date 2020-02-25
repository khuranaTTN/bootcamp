package java8session.Q8;


interface TestInterface1
{
    // default method 1
    default void show()
    {
        System.out.println("Default TestInterface1");
    }
}

interface TestInterface2
{
    // Default method 2
    default void show()
    {
        System.out.println("Default TestInterface2");
    }
}


class TestClass implements TestInterface1, TestInterface2
{
    // Overriding default show method
    public void show()
    {

        TestInterface1.super.show();


        TestInterface2.super.show();
    }

    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.show();
    }
}
