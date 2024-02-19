package JavaEight.MultiThreading.Shrayansh.CompletableFuture;

import java.util.concurrent.*;

/*
  if we pass executor then supplyAsync() takes two parameter [supplier, executor]  otherwise it uses fork-join thread pool to pick any thread
 Note:- if not passing then supplyAsync() takes one parameter [supplier]

  Same in thenApplyAsync() if we don't pass executor then it uses fork-join thread pool to pick any thread

  Alternate of thenApplyAsync() is => thenApply() which uses same thread on which supplyAsync() has executed because thenApply() don't takes
  executor parameter

 */

public class CompletableFutureThenApply {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 5, 10,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        try {
            CompletableFuture<String> compFutureObj = CompletableFuture.supplyAsync(() -> {
                try {
                    System.out.println("ThreadName of SupplyAsync: " + Thread.currentThread().getName());
                    Thread.sleep(5000);
                } catch (Exception e) {

                }
                return "Hello";
            }, poolExecutor).thenApply((String val) -> {
                System.out.println("ThreadName of thenApplyAsync: " + Thread.currentThread().getName());
                return val+" "+"Pranav Adarsh";
            });
            System.out.println("checking task completion status "+compFutureObj.isDone()+" "+" Thread Name as "+Thread.currentThread().getName());
            String output = compFutureObj.get();
            System.out.println("Output of completion future is as "+ output+" "+" Thread Name as "+Thread.currentThread().getName());
        } catch (Exception e){

        }

    }
}
