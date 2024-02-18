package JavaEight.MultiThreading.Shrayansh.FutureAndCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureAndCallable {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 3, 5,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        // Use case 1
        Future<?> futureObject1 = poolExecutor.submit(() -> {
            System.out.println("Task1 with Runnable");
        });
        try{
            Object object = futureObject1.get();
            System.out.println("case 1 check condition as "+object==null);
        } catch(Exception e){

        }
       // Use case 2
        List<Integer> output = new ArrayList<>();
        Future<List<Integer>> futureObject2 = poolExecutor.submit(() -> {
            output.add(100);
            System.out.println("Task2 with Runnable and return object");
        }, output);

        try{
            List<Integer> outputFromFutureObject2 = futureObject2.get();
            System.out.println("case 2 part 1 output as "+outputFromFutureObject2.get(0));
        } catch (Exception e){

        }

        // Use case 2 - part 2 using custom class
        List<Integer> myOutput = new ArrayList<>();
        Future<List<Integer>> futureCustomOutput = poolExecutor.submit(new MyRunnable(myOutput), myOutput);

        try{
            // way 1 to receive output
            futureCustomOutput.get();
            System.out.println("Value obtained from case 2 part 2 way 1 as "+myOutput.get(0));
            // way 2 to receive output
            List<Integer> result = futureCustomOutput.get();
            System.out.println(result.get(0));
        } catch (Exception e){

        }


      // Use case 3
      Future<List<Integer>> futureObject3 = poolExecutor.submit(() -> {
          System.out.println("Task3 with Callable");
          List<Integer> listObj = new ArrayList<>();
          listObj.add(200);
          return listObj;
      });

        try {
            List<Integer> outputFromFutureObject3 = futureObject3.get();
            System.out.println("case 3 output "+outputFromFutureObject3.get(0));
        } catch (Exception e){

        }
    }
}
