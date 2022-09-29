package currency.one;

public class JThread extends Thread {


    public JThread(String name) {
        super(name);
    }

    public void run(){
        System.out.printf("%s started... /n", Thread.currentThread().getName());// TODO: 19.09.2022 узнать побольше про printf

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s finish... /n", Thread.currentThread().getName());
    }


}
