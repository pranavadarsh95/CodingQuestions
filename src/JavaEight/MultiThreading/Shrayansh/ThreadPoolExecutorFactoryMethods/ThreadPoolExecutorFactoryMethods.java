package JavaEight.MultiThreading.Shrayansh.ThreadPoolExecutorFactoryMethods;

import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class ThreadPoolExecutorFactoryMethods {

    public static void main(String[] args) {

        // Method 1
//        ForkJoinPool pool = ForkJoinPool.commonPool();
        // Method 2
        ForkJoinPool pool = (ForkJoinPool) Executors.newWorkStealingPool(); // it will create threads based on number of avaliable processors
        // if we provide number then it will create that much only with min and max with that number threads only

        Future<Integer> futureObj = pool.submit(new MyCustomTaskClass(0, 100));
        try{
            System.out.println(futureObj.get());
        } catch (Exception e){
            // Handle Exception here
        }
    }
}

class MyCustomTaskClass extends RecursiveTask<Integer> {
    int start;
    int end;
    public MyCustomTaskClass(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        if(end - start <= 4){
            int totalSum = 0;
            for(int i = start; i <= end; i++){
                totalSum += i;
            }
            return totalSum;
        } else{
            // split the task
            int mid = (start + end) / 2;
            MyCustomTaskClass leftTask = new MyCustomTaskClass(start, mid);
            MyCustomTaskClass rightTask = new MyCustomTaskClass(mid+1, end);

            /*
            Fork basically starting compute the subTask1 by i.e thread1 and subTask2 would be placed in thread1 work-stealing queue
            based on the condition given in If block, as here we are only processing max four number means subtasks would be divided
            into further smaller subtasks till it reaches to 4
             */
            // Fork the subtasks for parallel execution
            leftTask.fork();
            rightTask.fork();

            // Combine the results of subtasks
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();

            // Combine the results
            return leftResult + rightResult;
        }
    }
}


