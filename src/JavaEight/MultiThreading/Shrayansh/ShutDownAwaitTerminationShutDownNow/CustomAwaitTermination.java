package JavaEight.MultiThreading.Shrayansh.ShutDownAwaitTerminationShutDownNow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CustomAwaitTermination {
    public static void main(String[] args) {
        ExecutorService poolObj = Executors.newFixedThreadPool(5);

        poolObj.submit(() -> {
            try{
                Thread.sleep(5000);
            } catch (Exception e){

            }
            System.out.println("task completed");
        });

        poolObj.shutdown();

        try {
            /* here main thread will wait for 2 seconds and after that check that ExecutorService has terminated or not? */
            boolean isTerminated = poolObj.awaitTermination(2, TimeUnit.SECONDS);
            System.out.println("Is Terminated " + isTerminated);
        } catch (Exception e){

        }

        System.out.println("Main thread is completed");
    }
}
