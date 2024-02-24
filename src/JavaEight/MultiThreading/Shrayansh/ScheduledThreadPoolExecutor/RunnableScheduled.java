package JavaEight.MultiThreading.Shrayansh.ScheduledThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RunnableScheduled {
    public static void main(String[] args) {
        ScheduledExecutorService poolObj = Executors.newScheduledThreadPool(5);

        poolObj.schedule(() -> {
            System.out.println("hello");
        }, 5, TimeUnit.SECONDS);
    }
}
