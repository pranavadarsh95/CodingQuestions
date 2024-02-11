package JavaEight.MultiThreading.Shrayansh.LockBasedMechanism.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Mainclass {

    /*
    In below example we can see same lock has been used for two different Shared Resource Objects
    Reentrant lock is custom lock which doesn't depend upon object
     */
    public static void main(String[] args) {
        SharedResource resource1 = new SharedResource();
        SharedResource resource2 = new SharedResource();

        ReentrantLock lock = new ReentrantLock();

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1 is going for producer");
            resource1.producer(lock);
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread2 is going for producer");
            resource2.producer(lock);
        });

        thread1.start();
        thread2.start();
    }
}
