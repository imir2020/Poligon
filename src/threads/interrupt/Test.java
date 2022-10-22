package threads.interrupt;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            Random random = new Random();
            for (int i = 0; i <1000_000_000; i++) {
                if (Thread.currentThread().isInterrupted()){
                    System.out.println("Thread was interrupted");
                    break;
                }
                Math.sin(random.nextDouble());
            }
        });

        System.out.println("Starting thread");
        thread.start();
        try {
            Thread.sleep(1000);
            thread.interrupt();

            thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


       // thread.stop();
        System.out.println("Thread has finished");
    }
}
