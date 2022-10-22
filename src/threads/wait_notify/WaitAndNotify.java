package threads.wait_notify;

import java.util.Scanner;

public class WaitAndNotify {
private Object lock = new Object();
    public void produce()  {
        synchronized (lock) {
            System.out.println("Producer thread started///");
            try {
                lock.wait();//Поток заснул, -  монитор отдаётся другому потоку
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Producer thread resumed");
        }
    }

    public void consume() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        synchronized (lock){
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            lock.notify(); // поток передает монитор объекта this, потоку, в котором был вызван метод wait
            notifyAll();
        }
    }
}
