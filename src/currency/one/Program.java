package currency.one;

public class Program {
    public static void main(String[] args) {
//        System.out.println("Main started");
//        new JThread("JThread").start();
//        System.out.println("Main is finished");
//
//        System.out.println("Many threads started");
//        for (int i = 1; i < 6; i++) {
//            new JThread("JThread " + i).start();
//
//            System.out.println("Main thread finished");
//        }

        JThread one = new JThread("JThread");
        one.start();

       try {
            one.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished");
    }
}
