package currency.fore;

public class Prog {
    public static void main(String[] args) {
        System.out.println("Start");
        JThread t = new JThread("JThread");
        t.start();

        try {
            Thread.sleep(150);
            t.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish");
    }
}
