package threads.deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    Account account1 = new Account();
    Account account2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void takeLocks(Lock lock1, Lock lock2)  {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;
        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if(firstLockTaken && secondLockTaken){
                    return;
                }
                if (firstLockTaken){
                    lock1.unlock();
                }
                if (secondLockTaken){
                    lock2.unlock();
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Random randomSupplier() {
        return new Random();
    }

    public void firstThread() {
        for (int i = 0; i < 10000; i++) {
            takeLocks(lock1,lock2);
            try {
                Account.transfer(account2, account1, randomSupplier().nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }

        }
    }

    public void secondThread() {
        for (int i = 0; i < 10000; i++) {
            takeLocks(lock2,lock1);
            try {
                Account.transfer(account1, account2, randomSupplier().nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished() {
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance " + (account1.getBalance() + account2.getBalance()));
    }
}
