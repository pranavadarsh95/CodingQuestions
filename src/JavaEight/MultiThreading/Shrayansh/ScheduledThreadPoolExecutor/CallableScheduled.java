package JavaEight.MultiThreading.Shrayansh.ScheduledThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CallableScheduled {
    public static void main(String[] args) {
        ScheduledExecutorService poolObj = Executors.newScheduledThreadPool(5);

        Future<String> futureObject = poolObj.schedule(() -> {
            return "hello";
        }, 5, TimeUnit.SECONDS);

        try {
            System.out.println(futureObject.get());
        } catch (Exception e){

        }
    }
}
