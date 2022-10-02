package currency.seven;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public class Pro {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);// 1 разрешение
        CommonResource commonResource = new CommonResource();

        new Thread(new CountThread(commonResource,semaphore, "CountThread 1")).start();
        new Thread(new CountThread(commonResource,semaphore, "CountThread 2")).start();
        new Thread(new CountThread(commonResource,semaphore, "CountThread 3")).start();

    }
}
