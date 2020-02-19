package Q4;
//WAP to create singleton class.

       class Q4{

        // static variable single_instance of type Q4
        private static Q4 single_instance = null;

        // variable of type String
        public String s;

        // private constructor restricted to this class itself
        private Q4()
        {
            s = "Hello I am Chirag part of amc";
        }

        // static method to create instance of Q4 class
        public static Q4 getInstance()
        {
            if (single_instance == null)
                single_instance = new Q4();

            return single_instance;
        }
    }

    // Driver Class
    class Main
    {
        public static void main(String args[])
        {
            // instantiating Q4 class with variable x
            Q4 x = Q4.getInstance();

            // instantiating Q4 class with variable y
            Q4 y = Q4.getInstance();

            // instantiating Q4 class with variable z
            Q4 z = Q4.getInstance();

            // changing variable of instance x
            x.s = (x.s).toUpperCase();

            System.out.println("String from x is " + x.s);
            System.out.println("String from y is " + y.s);
            System.out.println("String from z is " + z.s);
            System.out.println("\n");

            // changing variable of instance z
            z.s = (z.s).toLowerCase();

            System.out.println("String from x is " + x.s);
            System.out.println("String from y is " + y.s);
            System.out.println("String from z is " + z.s);
        }
    }

