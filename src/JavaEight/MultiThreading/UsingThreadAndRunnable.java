package JavaEight.MultiThreading;


class UsingThreadConcreateClass extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class UsingThreadAndRunnable {
    public static void main(String[] args) {
        UsingThreadConcreateClass uc = new UsingThreadConcreateClass();
        uc.start();
    }
}

