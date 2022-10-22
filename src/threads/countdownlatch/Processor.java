package threads.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Processor implements Runnable {
    private CountDownLatch countDownLatch;
    private int id;

    public Processor(int id,CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread with id " + id + " proceed.");
    }
}
