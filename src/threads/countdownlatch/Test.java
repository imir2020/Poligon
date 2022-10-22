package threads.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.submit(new Processor(i,countDownLatch));
        }
        executorService.shutdown();
        for (int i = 0; i <3 ; i++) {
            Thread.sleep(1000);
            countDownLatch.countDown();
        }
    }
}
