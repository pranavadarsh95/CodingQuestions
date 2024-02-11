package JavaEight.MultiThreading.Shrayansh.LockFreeMechanism;

public class WhyNeedLockFreeMech {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // case 1 [Normal case]
      /*  for (int i = 0 ; i < 400; i++){
            resource.increment();
        }
        System.out.println("Counter value as "+resource.getCounter());
*/
        // case 2 [Thread case - Unhandled]
    /*    Thread th1 = new Thread(() -> {
            for (int i = 0 ; i < 10; i++){
                resource.increment();
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i = 0 ; i < 10; i++){
                resource.increment();
            }
        });

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (Exception e){

        }

        System.out.println("F3 Counter value as "+resource.getCounter());*/


        // case 3 [Thread case - handled]
        /*
        It can handled using two cases
          - using lock like Synchronized
          - using lock free operation like AtomicInteger (We are dealing with int)
          if we had been dealing with float then AtomicFloat etc. accordingly
         */

        Thread th1 = new Thread(() -> {
            for (int i = 0 ; i < 10; i++){
                resource.incrementHandled();
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i = 0 ; i < 10; i++){
                resource.incrementHandled();
            }
        });

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (Exception e){

        }

        System.out.println("F3 Counter value as "+resource.counterHandled);
    }
}
