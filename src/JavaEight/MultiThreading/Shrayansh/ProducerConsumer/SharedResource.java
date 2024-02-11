package JavaEight.MultiThreading.Shrayansh.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws Exception {
        // If buffer is full, wait for consumer to consume Item
        while(sharedBuffer.size() == bufferSize){
            System.out.println("Buffer is full, Producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced: "+item);
        // Notify the consumer that there are items to consume now
        notify();
    }

    public synchronized int consume() throws Exception{
        // Buffer is empty, wait for the producer to produce items
        while(sharedBuffer.isEmpty()){
            System.out.println("Buffer is Empty, consumer is waiting for producer");
            wait();
        }

        int item = sharedBuffer.poll();
        System.out.println("Consumed: "+ item);
        // Notify the producer that there is space in the buffer now
        notify();
        return item;
    }
}
