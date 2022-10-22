package threads.pattern_consumerI;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue(10);

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void produce() throws InterruptedException {
        Random r = new Random();
        while (true) {
            queue.put(r.nextInt(100));
        }
    }

    private static void consumer() throws InterruptedException {
        Random f = new Random();
        while (true) {
            Thread.sleep(100);
            if(f.nextInt(10) == 5) {
                System.out.println(queue.take());
                System.out.println("Queue size is " + queue.size());
            }
        }
    }
}
