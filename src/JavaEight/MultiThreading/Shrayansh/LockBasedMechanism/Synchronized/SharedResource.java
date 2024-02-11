package JavaEight.MultiThreading.Shrayansh.LockBasedMechanism.Synchronized;

public class SharedResource {
    boolean isAvailable = false;

    public synchronized void produce(){
        System.out.println("Lock Acquired "+ Thread.currentThread().getName());
        isAvailable = true;
        try{
            Thread.sleep(8000); // 8 sec
        } catch(Exception e){
            // handle some exception here
        }
        System.out.println("Lock Released "+ Thread.currentThread().getName());
    }
}
