package Q3;

public class SynchronizationMethod {

    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public static void main(String[] args) {
        SynchronizationMethod SyncObj =new SynchronizationMethod();
        SyncObj.doWork();
    }

    private void doWork() {


        Thread t1 =new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10000;i++){
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10000;i++){
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Count: "+count);
    }
}
