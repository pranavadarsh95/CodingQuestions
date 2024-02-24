package JavaEight.MultiThreading.Shrayansh.ShutDownAwaitTerminationShutDownNow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomShutDown {
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
        System.out.println("Main thread is completed");
    }
}
