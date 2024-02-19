package JavaEight.MultiThreading.Shrayansh.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureThenAccept {
    public static void main(String[] args) {
        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread Name which runs 'Supply Async': "+ Thread.currentThread().getName());
            return "Pranav Adarsh";
        }).thenAccept((String var)-> System.out.println("All Stages completed"));
    }
}

// Then Accept input parameter but returning nothing , thenAccept is usually consider as last element of the chain