package JavaEight.MultiThreading.Shrayansh.LockBasedMechanism.ReadWriteLock;

import java.util.concurrent.locks.Lock;

public class SharedResource {
    Boolean isAvailable = false;

    SharedResource() {
    }

    public void producer(Lock applyLock) {
        try {
            applyLock.lock();
            System.out.println("Lock "+ applyLock +" acquired by: " + Thread.currentThread().getName());
            Thread.sleep(10000);
        } catch (Exception e) {
            // Handle Exception here
        } finally {
            applyLock.unlock();
            System.out.println("Lock "+ applyLock +" released by: " + Thread.currentThread().getName());
        }
    }


    public void consumer(Lock applyLock) {
        try {
            System.out.println("Read Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000);
        } catch (Exception e) {
            // Handle Exception here
        } finally {
            applyLock.unlock();
            System.out.println("Read Lock released by: " + Thread.currentThread().getName());
        }
    }
}
