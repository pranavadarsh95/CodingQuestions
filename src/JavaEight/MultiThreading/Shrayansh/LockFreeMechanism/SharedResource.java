package JavaEight.MultiThreading.Shrayansh.LockFreeMechanism;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {

    int counter = 0;
    AtomicInteger counterHandled = new AtomicInteger(0);

    public void increment(){
        counter++;
        try {
            Thread.sleep(1000);
        } catch (Exception e){

        }
        /*
        This is not atomic operation
        Increment of counter happens as
        1) Load counter value
        2) Increment counter value
        3) Assign back counter value

        counter = counter + 1;

        Above one will work fine if there is only one thread but in case of multiple threads it won't
         */
    }


    public void incrementHandled(){
        counterHandled.incrementAndGet(); // to increment by value 1
        //  counterHandled.addAndGet(10); // to increment by value any specific Number
        try {
            Thread.sleep(1000);
        } catch (Exception e){

        }
    }

    public int getCounter() {
        return counter;
    }

    public int getCounterHandled(){
        return counterHandled.get();
    }
}
