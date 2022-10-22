package threads.reentrantlock;

public class Test {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread1 = new Thread(() -> task.firstThread());
        Thread thread2 = new Thread(task::secondThread);

        thread2.start();
        thread1.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        task.showCounter();
    }
}
