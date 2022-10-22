package threads.wait_notify;

public class TestObj {
    public static void main(String[] args) {

        WaitAndNotify waitAndNotify = new WaitAndNotify();
        Thread thread1 = new Thread(waitAndNotify::produce);
        Thread thread2 = new Thread(()->waitAndNotify.consume());

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
