package currency.exchanger;

import java.util.concurrent.Exchanger;

public class PutThread implements Runnable {
    Exchanger<String> exchanger;
    String message;

    public PutThread(Exchanger<String> ex) {
        this.exchanger = ex;
        message = "Hello Java";
    }

    @Override
    public void run() {
        try {
            message = exchanger.exchange(message + " 1");
            System.out.println("Put thread received: " + message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
