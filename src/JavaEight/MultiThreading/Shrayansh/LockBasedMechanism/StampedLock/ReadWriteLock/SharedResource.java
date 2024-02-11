package JavaEight.MultiThreading.Shrayansh.LockBasedMechanism.StampedLock.ReadWriteLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;
    StampedLock lock = new StampedLock();

    public void producer(){
        long stamp = lock.readLock();
        try{
            System.out.println("Read Lock acquired by: " + Thread.currentThread().getName() + " "+ lock +" "+ stamp);
            isAvailable = true;
            Thread.sleep(6000);
        } catch (Exception e){
        }
        finally {
            lock.unlockRead(stamp);
            System.out.println("Read Lock release by: "+ Thread.currentThread().getName() + " "+ System.currentTimeMillis());
        }
    }

    public void consumer(){
        long stamp = lock.writeLock();
        try{
            System.out.println("Read Lock acquired by: " + Thread.currentThread().getName() + " "+ lock +" "+ stamp);
            isAvailable = true;
        } catch (Exception e){
        }
        finally {
            lock.unlockWrite(stamp);
            System.out.println("Write Lock release by: "+ Thread.currentThread().getName() + " "+ System.currentTimeMillis());
        }
    }
}
