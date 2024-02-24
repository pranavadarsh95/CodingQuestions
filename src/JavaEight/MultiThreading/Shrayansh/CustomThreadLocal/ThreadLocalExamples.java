package JavaEight.MultiThreading.Shrayansh.CustomThreadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalExamples {

    public static void main(String[] args) {

        // ThreadLocalExample
//        fun1();

        // ThreadLocalExample with multiple tasks and fewer threads available, without cleanup to reuse threads
//        fun2();

        // ThreadLocalExample with multiple tasks and fewer threads available, with cleanup to reuse threads
        fun3();

    }

    private static void fun1() {
        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();

        // It will set value in current thread i.e main thread
        threadLocalObj.set(Thread.currentThread().getName());

        Thread thread1 = new Thread(() -> {
            threadLocalObj.set(Thread.currentThread().getName());
            System.out.println("Task 1 is assigned");
            System.out.println(threadLocalObj.get());
        });

        thread1.start();

        try{
            Thread.sleep(2000);
        } catch (Exception e){
            // Catch exception here
        }
        System.out.println(threadLocalObj.get());
    }

    private static void fun2() {
        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();

        ExecutorService poolObj = Executors.newFixedThreadPool(5);

        poolObj.submit(() -> {
            threadLocalObj.set("Hello Pranav "+ Thread.currentThread().getName());
        });

        for(int i=1; i<15; i++){
            int finalI = i;
            poolObj.submit(() -> {
                System.out.println("Task number "+ finalI + " Thread local value "+ threadLocalObj.get()+" "+"Thread name "+ Thread.currentThread().getName());
            });
        }
    }

    private static void fun3() {
        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();

        ExecutorService poolObj = Executors.newFixedThreadPool(5);

        poolObj.submit(() -> {
            threadLocalObj.set("Hello Pranav "+ Thread.currentThread().getName());
            System.out.println("Task number "+ 0 + " Thread local value "+ threadLocalObj.get()+" "+"Thread name "+ Thread.currentThread().getName());
            threadLocalObj.remove();
        });

        for(int i=1; i<15; i++){
            int finalI = i;
            poolObj.submit(() -> {
                System.out.println("Task number "+ finalI + " Thread local value "+ threadLocalObj.get()+" "+"Thread name "+ Thread.currentThread().getName());
            });
        }
    }
}
