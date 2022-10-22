package threads.pattern_consumerII;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private Object lock = new Object();

    public void produce() {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while (queue.size() == LIMIT) {
                    try {
                        //=================
                        lock.wait();
                        //=================
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }

    public void consume() {
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0) {
                    try {

                        lock.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size is " + queue.size());
                lock.notify();

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
