package javaassesment;
//Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)


    enum Level{
        HOUSE1(1000000),HOUSE2(1500000), HOUSE3(2000000), HOUSE4(3000000);
        private int lvl;
        Level(int x){
            lvl = x;
        }
        int getPrice(){
            return lvl;
        }

    }

    public class Q9 {

        public static void main(String[] args){
            System.out.println("Default value of house1 is "+Level.HOUSE1.getPrice());
            System.out.println("Default value of house2 is "+Level.HOUSE2.getPrice());
            System.out.println("Default value of house3 is "+Level.HOUSE3.getPrice());
            System.out.println("Default value of house4 is "+Level.HOUSE4.getPrice());
        }
    }


