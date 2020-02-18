package javaassesment.Q11;

public class q11 {
    //Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks
    public static void main(String[] args) {
        SBI s1 = new SBI();
        s1.setDetails(7,"SBI","Noida");
        ICICI ic1 = new ICICI();
        ic1.setDetails(8,"ICICI","Delhi");
        BOI b1 = new BOI();
        b1.setDetails(9,"BOI","Greater Nodia");
        b1.getDetails();
        s1.getDetails();
        ic1.getDetails();
    }
}

