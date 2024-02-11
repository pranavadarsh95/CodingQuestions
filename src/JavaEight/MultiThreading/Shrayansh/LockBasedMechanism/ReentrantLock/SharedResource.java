package JavaEight.MultiThreading.Shrayansh.LockBasedMechanism.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;
    SharedResource(){
    }

    public void producer(ReentrantLock lock){
        try{
            lock.lock();
            System.out.println("Lock Acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e){
            // Handle Exception here
        } finally {
            lock.unlock();
            System.out.println("Lock release by: "+ Thread.currentThread().getName());
        }
    }
}
