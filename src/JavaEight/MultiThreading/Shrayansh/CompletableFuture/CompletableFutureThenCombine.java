package JavaEight.MultiThreading.Shrayansh.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureThenCombine {

    public static void main(String[] args) {
        CompletableFuture<Integer> asyncTask1 = CompletableFuture.supplyAsync(() -> {
            return 10;
        });
        CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(() -> {
            return "k";
        });

        CompletableFuture<String> completableFuture = asyncTask1.thenCombine(asyncTask2, (Integer val1, String val2) -> val1+val2); // T U R(Return type)
       try {
           System.out.println(completableFuture.get());
       } catch(Exception e){
           // handle Exception here
       }
    }
}
