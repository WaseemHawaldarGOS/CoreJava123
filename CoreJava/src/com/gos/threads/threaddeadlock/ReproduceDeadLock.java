package com.gos.threads.threaddeadlock;

/*
This program has race condition or deadlock.
 */
public class ReproduceDeadLock {

    public static void main(String[] args) {

        final String printer = "Printer";
        final String scanner = "Scanner";

        Runnable run1 = () ->{
            synchronized (printer){
                System.out.println(Thread.currentThread().getName() + " locked "+printer);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (scanner){
                    System.out.println(Thread.currentThread().getName() + " locked "+scanner);
                }
            }
        };

        Runnable run2 = () ->{
            synchronized (scanner){
                System.out.println(Thread.currentThread().getName() + " locked "+scanner);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (printer){
                    System.out.println(Thread.currentThread().getName() + " locked "+printer);
                }
            }
        };

        Thread thread1 = new Thread(run1);
        thread1.setName("Desktop");

        Thread thread2 = new Thread(run2);
        thread2.setName("Laptop");

        thread1.start();
        thread2.start();

    }
}
