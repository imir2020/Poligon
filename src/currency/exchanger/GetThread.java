package currency.exchanger;

import java.util.concurrent.Exchanger;

public class GetThread implements Runnable {
    Exchanger<String> exchanger;
    String message;
    String temp;//Для наглядности

    public GetThread(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        message = "hello C++";
    }

    @Override
    public void run() {
        try {
            temp = exchanger.exchange(message);
            System.out.println("Put thread received: " + temp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
