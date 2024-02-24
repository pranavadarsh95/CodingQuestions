package JavaEight.MultiThreading.Shrayansh.ScheduledThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FixedDelayScheduled {
    public static void main(String[] args) {
        ScheduledExecutorService poolObj = Executors.newScheduledThreadPool(5);

        Future<?> futureObj = poolObj.scheduleWithFixedDelay(() -> {
            System.out.println("hello");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, 3, 5, TimeUnit.SECONDS); /* first thread will start after waiting for 3-second then wait for 6 seconds and 5-second delay
        a new thread will start continuously*/

        try{
            Thread.sleep(50000); // after 50 sec thread creation would be stopped
            futureObj.cancel(true);
        } catch (Exception e){

        }


        try{
            System.out.println(futureObj.get());
        } catch (Exception e){

        }
    }
}
