package Q2;
//Write a program to create a thread using Thread class and Runnable interface each.
class Runner implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<50;i++){
            System.out.println("Itertation: "+ i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnerInterfaceDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner());
        Thread t2 = new Thread(new Runner());

        t1.start();
        t2.start();
    }
}
