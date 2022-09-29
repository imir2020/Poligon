package currency.three;

public class MThread implements Runnable {
    private boolean isActive;


    public MThread() {
        isActive = true;
    }

    void disable() {
        isActive = false;
    }

    @Override
    public void run() {
        int count = 1;
        while (isActive) {
            System.out.println("CountOfLoop + " + count++);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Start");
        MThread r = new MThread();
        new Thread(r, "One").start();

        try {
            Thread.sleep(1500);
            r.disable();
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish");
    }
}
