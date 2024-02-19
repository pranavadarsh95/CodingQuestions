package JavaEight.MultiThreading.Shrayansh.CompletableFuture;

import java.util.concurrent.*;

/*
Even if Async operations are being performed order would be maintained.
 */
public class CompletableFutureThenCompose {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 5, 10,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        try {/**/
            CompletableFuture<String> compFutureObj = CompletableFuture.supplyAsync(() -> {
                try {
                    System.out.println("ThreadName of SupplyAsync: " + Thread.currentThread().getName());
                    Thread.sleep(5000);
                } catch (Exception e) {

                }
                return "Hello";
            }, poolExecutor);

          CompletableFuture<String> finalOutput =  compFutureObj
                    .thenCompose((String val) -> {
                System.out.println("ThreadName of thenApplyAsync: " + Thread.currentThread().getName());
                return CompletableFuture.supplyAsync(() -> val+" "+"Pranav Adarsh");
            })
                    .thenCompose(val-> {return CompletableFuture.supplyAsync(() -> val+" How");})
                    .thenCompose(val -> {return CompletableFuture.supplyAsync(() -> val+" "+" Are");})
                    .thenCompose(val -> {return CompletableFuture.supplyAsync(() -> val+" "+" You");});

            System.out.println("checking task completion status "+compFutureObj.isDone()+" "+" Thread Name as "+Thread.currentThread().getName());
            String output = finalOutput.get();
            System.out.println("Output of completion future is as "+ output+" "+" Thread Name as "+Thread.currentThread().getName());
        } catch (Exception e){

        }

    }
}
