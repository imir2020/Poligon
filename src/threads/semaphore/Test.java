package threads.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//        Semaphore semaphore = new Semaphore(3);
//
//        semaphore.acquire();//Разрешает потоку использовать ресурс
//        semaphore.acquire();//Разрешает потоку использовать ресурс
//        semaphore.acquire();//Разрешает потоку использовать ресурс
//
//        System.out.println("All permits have been acquired");
//        semaphore.acquire();
//        System.out.println("Can't reach here...");
//        semaphore.release();//Освобождает ресурс от потока
//
//        System.out.println(semaphore.availablePermits());

        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Connection connection = Connection.getConnection();

        for (int i = 0; i < 200; i++) {
            executorService.submit(() -> {
                try {
                    connection.work();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}
