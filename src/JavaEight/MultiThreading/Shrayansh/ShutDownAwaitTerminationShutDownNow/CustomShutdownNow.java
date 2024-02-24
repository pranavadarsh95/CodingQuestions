package JavaEight.MultiThreading.Shrayansh.ShutDownAwaitTerminationShutDownNow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomShutdownNow {
    public static void main(String[] args) {
        ExecutorService poolObj = Executors.newFixedThreadPool(5);

        poolObj.submit(() -> {
            try{
                Thread.sleep(15000);
            } catch (Exception e){

            }
            System.out.println("task completed");
        });

        poolObj.shutdownNow(); // due to this whether task has completed or not all threads would be killed
        System.out.println("Main thread is completed");
    }
}
