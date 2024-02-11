package JavaEight.MultiThreading.Shrayansh.LockBasedMechanism.Synchronized;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        System.out.println("Main Thread Started");

        Thread th1 = new Thread(()->{ // Assume this is run method, which got called after start() method
            System.out.println("Thread1 calling produce method");
            resource.produce();
        });
        th1.setName("Thread 1");

        Thread th2 = new Thread(()->{
            try{
                Thread.sleep(2000);
            } catch (Exception e){

            }
            System.out.println("Thread2 calling produce method");
            resource.produce();
        });
        th2.setName("Thread 2");

        th1.start();
        th2.start();

        try{
            Thread.sleep(3000);
        } catch (Exception e){

        }
        System.out.println("Thread1 is suspended");
        th1.suspend();

        try{
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        th1.resume();

        System.out.println("Main thread is finishing its work");
    }
}
