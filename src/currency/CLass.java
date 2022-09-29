package currency;

public class CLass {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setName("First stream");
        System.out.println(thread.getName());
        System.out.println(thread.isAlive());
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
}
