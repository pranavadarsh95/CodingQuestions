package JavaEight.MultiThreading.Shrayansh.LockBasedMechanism.StampedLock.OptimisticLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {

    /*
    In Optimistic lock there is no unlock, we just need to validate the stamp value (Basically checking state/ has anyone write in mean time or not??)
     */

    int a = 10;
    StampedLock lock = new StampedLock();

    public void producer(){
        long stamp = lock.tryOptimisticRead();
        try{
            System.out.println("Taken optimistic read"+" "+System.currentTimeMillis());
             a = 11;
             Thread.sleep(6000);
             if(lock.validate(stamp)){
                 System.out.println("Updated a value successfully"+" "+System.currentTimeMillis());
             } else{
                 System.out.println("rollback of work"+" "+System.currentTimeMillis());
                 a = 10; // rollback;
             }
        }  catch (Exception e){
            // Handle Exception here
        }
    }

    public void consumer(){
        long stamp = lock.writeLock();
        System.out.println("Write lock acquired by : "+ Thread.currentThread().getName()+" "+System.currentTimeMillis());
        try{
            System.out.println("Performing work");
            a = 9;
        } finally {
            lock.unlockWrite(stamp);
            System.out.println("Write lock released by : " + Thread.currentThread().getName()+" "+System.currentTimeMillis());
        }
    }
}
