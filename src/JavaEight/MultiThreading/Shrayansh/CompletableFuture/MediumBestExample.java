package JavaEight.MultiThreading.Shrayansh.CompletableFuture;

import java.util.concurrent.CompletableFuture;


//Best Article to understand all at once :- https://medium.com/@joshikeyur/apply-compose-and-combine-futures-71b76b3a1aae
/*
Three of most important methods when dealing with CompletableFutures are thenApply, theyCompose and thenCombine.
Before we understand what each method does let’s think in terms of layman what we need if I am doing something in async mode.

First scenario is “I am doing one thing but someone else can do other thing we both can work independently.
Once both of us are done with our work only then we can combine our outcome and get the final outcome
e.g. in a kitchen one guy is making Pizza Dough and his helper is chopping vegetables or grating Cheese.
Both of them are working independently but final outcome i.e Pizza can be made only once both of them are done with their work.
In another scenario “I need to wait for another person to finish his work. Once he is done only then I can do my work”
 e.g. server need to wait for final outcome i.e. Pizza before (s)he can serve it to diner.

thenCombine: This method is used when both processes (CompletableFuture) can work independently and once both are done their
results can be combined to get the final result.

thenCompose: This method is used when one CompletableFuture is waiting for another CompletableFuture to provide its result.
Once it is available result will be processed asynchronously.

thenApply: This method is more or less same and thenCompose only difference.
it will return the result instead of another CompletableFuture in its Lambda.

So if we consider following code.
 */


public class MediumBestExample {
    public static void main(String[] args) {
        System.out.println("Starting Completable Future Example..");
        CompletableFuture<String> basePrep = CompletableFuture.supplyAsync(() -> {
            System.out.println("Preparing Base");
            return "Base Ready";
        });
        CompletableFuture<String> topPrep = CompletableFuture.supplyAsync(() -> {
            System.out.println("Preparing Top");
            return "Toppings Ready";
        });
        CompletableFuture<String> foodPrep = basePrep.thenCombine(topPrep, (baseResponse, topResponse) -> {
            System.out.println("Top and Base are::" + baseResponse + ":" + topResponse);
            return "Pizza Ready";
        });
        CompletableFuture<String> foodServe = foodPrep.thenCompose(food -> {
            System.out.println("Serving Food");
            return CompletableFuture.supplyAsync(() -> food+" Food Served");
        });
        CompletableFuture<String> order = foodServe.thenApply(orderComplete -> orderComplete+" Order Completed..");
        try {
            System.out.println(order.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
