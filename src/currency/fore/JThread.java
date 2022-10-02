package currency.fore;

public class JThread  extends Thread{

    public JThread(String name) {
        super(name);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName());
        int count = 1;
        while (!isInterrupted()){
            System.out.println("Loop " + count++);
        }
    }

}
