package javaassesment.Q11;

public class ICICI extends bank {
    public void setDetails(int roi , String name , String add){
        this.rateOfInterest = roi;
        this.bankName = name;
        this.bankAddress = add;
    }

    public void getDetails(){
        System.out.println("Rate of interest = " + this.rateOfInterest);
        System.out.println("Bank Name = "+ this.bankName);
        System.out.println("Bank Address = "+ this.bankAddress);
    }
}

