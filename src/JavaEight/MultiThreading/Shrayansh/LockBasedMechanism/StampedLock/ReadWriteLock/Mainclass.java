package JavaEight.MultiThreading.Shrayansh.LockBasedMechanism.StampedLock.ReadWriteLock;

public class Mainclass {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(() -> {
            resource.producer();
        });
        thread1.setName("Thread1");

        Thread thread2 = new Thread(() -> {
            resource.producer();
        });
        thread2.setName("Thread2");

        Thread thread3 = new Thread(() -> {
            resource.consumer();
        });
        thread3.setName("Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
