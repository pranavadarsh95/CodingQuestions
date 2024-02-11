package JavaEight.MultiThreading.Shrayansh.LockBasedMechanism.ConditionOnLocks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    boolean isAvailable = false;

    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public void producer(){
        try {
            lock.lock();
            System.out.println("Produce lock acquired by: " + Thread.currentThread().getName()+" "+System.currentTimeMillis());
            if(isAvailable){
                // Already Available, thread has to wait for it to consume
                System.out.println("Produce Thread is waiting: "+ Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = true;
            condition.signal();
        } catch(Exception e){

        }
        finally {
            lock.unlock();
            System.out.println("Produce Lock release by: "+ Thread.currentThread().getName());
        }
    }

    public void consumer(){
        try {
            Thread.sleep(1000);
            lock.lock();
            System.out.println("Consume Lock acquired by: " + Thread.currentThread().getName());

            if (!isAvailable) {
                // already not available, Thread has to wait for it to produced
                System.out.println("Consumer thread is waiting: "+ Thread.currentThread().getName()+" "+System.currentTimeMillis());
                condition.await();
            }
            isAvailable = false;
            condition.signal();
        }catch(Exception e){

        }
        finally{
            lock.unlock();
            System.out.println("consume Lock release by: "+ Thread.currentThread().getName());
        }
    }
}
