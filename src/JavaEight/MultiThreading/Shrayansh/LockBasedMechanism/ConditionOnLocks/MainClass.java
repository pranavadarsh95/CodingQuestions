package JavaEight.MultiThreading.Shrayansh.LockBasedMechanism.ConditionOnLocks;

public class MainClass {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread th1 = new Thread(() -> {
            for(int i = 0 ; i <2; i++){
                resource.producer();
            }
        });
        th1.setName("Thread 1");

        Thread th2 = new Thread(() -> {
            for(int i = 0 ; i <2; i++){
                resource.consumer();
            }
        });

        th2.setName("Thread 2");

        th1.start();
        th2.start();
    }
}
