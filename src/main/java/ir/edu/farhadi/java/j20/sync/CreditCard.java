package ir.edu.farhadi.java.j20.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CreditCard {
    private Double balance;
    Lock lock = new ReentrantLock();

    public CreditCard(double balance) {
        this.balance = balance;
    }


    public  void changeBySyncImplementation() {
//            taask1()
//            taask2()
//            taask3()
//            taask4()
        for (int i = 0; i < 3; i++) {
            balance = balance + 1;
            try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
            balance = balance - 1;
        }
    }

    public  void changeByLocking() {
//        taask1()
//            taask2()
//            taask3()
//            taask4()
        lock.lock();
        try {
            for (int i = 0; i < 3; i++) {
                balance = balance + 1;
                Thread.sleep(100);
                balance = balance - 1;
            }
            } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        }


    public  void changeBySync2Implementation() {
        synchronized (balance){
            for (int i = 0; i < 3; i++) {
                balance = balance + 1;
                try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
                balance = balance - 1;
            }
        }

    }

    public double getBalance() {
        return balance;
    }
}
