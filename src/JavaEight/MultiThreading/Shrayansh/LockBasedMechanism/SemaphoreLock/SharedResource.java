package JavaEight.MultiThreading.Shrayansh.LockBasedMechanism.SemaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedResource {
    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);

    public void producer(){
        try{
            lock.acquire();
            System.out.println("lock acquired by : "+ Thread.currentThread().getName()+" "+System.currentTimeMillis());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e){

        } finally {
            lock.release();
            System.out.println("lock released by : "+ Thread.currentThread().getName()+" "+System.currentTimeMillis());
        }
    }
}
