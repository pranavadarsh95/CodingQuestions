package JavaEight.MultiThreading.Shrayansh.LockBasedMechanism.ReadWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Mainclass {
    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();
        Lock readLock = lock.readLock();
        Lock writeLock = lock.writeLock();

        SharedResource resource1 = new SharedResource();
        SharedResource resource2 = new SharedResource();
        SharedResource resource3 = new SharedResource();

        Thread thread1 = new Thread(() -> {
            System.out.println("Going to apply read lock for Thread1");
            resource1.producer(readLock);
        });
        thread1.setName("Thread1");

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Going to apply write lock for Thread2");
            resource2.producer(writeLock);
        });
        thread2.setName("Thread2");

        Thread thread3 = new Thread(() -> {
            System.out.println("Going to apply read lock for Thread3");
            resource3.producer(readLock);
        });
        thread3.setName("Thread3");

        Thread thread4 = new Thread(() -> {
            System.out.println("Going to apply read lock for Thread4");
            resource1.producer(readLock);
        });
        thread4.setName("Thread4");

        Thread thread5 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Going to apply write lock for Thread5");
            resource2.producer(writeLock);
        });
        thread5.setName("Thread5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
