package threads.semaphore;

import java.util.concurrent.Semaphore;

//Singleton
public class Connection {
    private static Connection connection = new Connection();
    private int connectionCount;
    private Semaphore semaphore = new Semaphore(10);

    private Connection() {
    }

    public static Connection getConnection() {
        return connection;
    }


    private void doWork() throws InterruptedException {
        synchronized (this) {
            connectionCount++;
            System.out.println(connectionCount);
        }
        Thread.sleep(5000);
        synchronized (this) {
            connectionCount--;
        }
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }
}
