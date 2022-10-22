package threads.volotilE;

public class MyThread extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        this.running = false;
    }
}
