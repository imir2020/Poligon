package currency.seven;

import java.util.concurrent.Semaphore;


public class CountThread implements Runnable {
    CommonResource commonResource;
    Semaphore semaphore;
    String name;

    public CountThread(CommonResource commonResource, Semaphore semaphore, String name) {
        this.commonResource = commonResource;
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " ожидает разрешение");
        commonResource.x = 1;
        for (int i = 0; i <5 ; i++) {
            System.out.println(this.name + " :" + commonResource.x + " " + i);
            commonResource.x++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " освобождает разрешение");
        semaphore.release();
    }
}
