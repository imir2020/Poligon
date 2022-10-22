package threads.callable_future;

import java.util.Random;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        executorService.submit(new Runnable() {//тонкий момент  - почему здесь возможен return
//            @Override
//            public void run() {//тонкий момент  - почему здесь возможен return
//                System.out.println("Starting");
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Finished");
//            }
//        });
       Future<Integer> future =  executorService.submit(() -> {//new Callable<Integer>
                System.out.println("Starting");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished");

            Random random = new Random();
            int randValue = random.nextInt(10);
           if (randValue < 5){
               throw new Exception("Something bad happened");
           }
            return random.nextInt(10);

        });

       executorService.shutdown();

        try {
            int result = future.get();//get() ждёт окончания выполнения потока
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }

    public static int calculate() {
        return 5 + 3;
    }
}
