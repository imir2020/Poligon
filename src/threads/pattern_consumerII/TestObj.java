package threads.pattern_consumerII;

import javax.management.Query;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TestObj {


    public static void main(String[] args) {

        ProducerConsumer producerConsumer = new ProducerConsumer();
        Thread thread1 = new Thread(() -> producerConsumer.produce());
        Thread thread2 = new Thread(() -> producerConsumer.consume());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
