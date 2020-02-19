package Q7;
//WAP to convert seconds into days, hours, minutes and seconds.

public class Q7 {
    public static void main(String[] args) {
        int input = 500000;
        int ndays;
        int nhours;
        int nminutes;
        int nseconds;

        ndays = input/86400;
        nhours = (input%86400)/3600;
        nminutes = ((input%86400)%3600)/60;
        nseconds = ((input%86400)%3600)%60;

        System.out.println("Number of days: " + ndays);
        System.out.println("Number of hours: " + nhours);
        System.out.println("Number of minutes: " + nminutes);
        System.out.println("Number of seconds: " + nseconds);
    }
}
