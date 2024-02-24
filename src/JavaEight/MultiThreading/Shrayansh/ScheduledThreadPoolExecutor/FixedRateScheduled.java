package JavaEight.MultiThreading.Shrayansh.ScheduledThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FixedRateScheduled {

    public static void main(String[] args) {
        ScheduledExecutorService poolObj = Executors.newScheduledThreadPool(5);

        Future<?> futureObj = poolObj.scheduleAtFixedRate(() -> {
            System.out.println("hello");
        }, 3, 5, TimeUnit.SECONDS); /* first thread will start after 3-second delay and after every 5 second
        new thread will start continuously*/

        try{
            Thread.sleep(10000); // after 10 sec thread creation would be stopped
            futureObj.cancel(true);
        } catch (Exception e){

        }


        try{
            System.out.println(futureObj.get());
        } catch (Exception e){

        }
    }
}
