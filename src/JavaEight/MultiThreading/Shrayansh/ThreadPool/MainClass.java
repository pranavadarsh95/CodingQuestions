package JavaEight.MultiThreading.Shrayansh.ThreadPool;

import java.util.concurrent.*;

public class MainClass {
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), new CustomThreadFactory(), new CustomRejectHandler());

        // case 1 [2 threads would be put inside Queue]
     /*   for(int i = 1 ; i<=4; i++){ // here I am submitting 4 tasks
            executor.submit(()->{
                try{
                    Thread.sleep(5000); // 5 sec sleep
                } catch (Exception e){
                    // handle Exception here
                }
                System.out.println("Task processed by: " + Thread.currentThread().getName());
            });
        }
        executor.shutdown(); // after every task completed we need to shut down
*/
        // case 2 [2 threads are running and 2 Threads are put inside Queue and still 2 threads are coming so, max threads 4 would be created in threadpool]
       /* for(int i = 1 ; i<=6; i++){ // here I am submitting 4 tasks submitting
            executor.submit(()->{
                try{
                    Thread.sleep(5000); // 5 sec sleep
                } catch (Exception e){
                    // handle Exception here
                }
                System.out.println("Task processed by: " + Thread.currentThread().getName());
            });
        }
        executor.shutdown(); // after every task completed we need to shut down
*/
        // case 3 [2 Threads are running, 2 Threads are put inside Queue and 3 more threads are coming so, max threads 4 can be created but, still 1 thread is left so that thread would be rejected]
        for(int i = 1 ; i<=7 ; i++){ // here I am submitting 4 tasks submitting
            executor.submit(()->{
                try{
                    Thread.sleep(5000); // 5 sec sleep
                } catch (Exception e){
                    // handle Exception here
                }
                System.out.println("Task processed by: " + Thread.currentThread().getName());
            });
        }
        executor.shutdown(); // after every task completed we need to shut down


    }
}


class CustomThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
//        th.setName("Custom Thread");
        return th;
    }
}

class CustomRejectHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task Rejected: " + r.toString());
    }
}