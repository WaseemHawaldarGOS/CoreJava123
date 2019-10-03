package com.gos.threads.basicthreads;

public class TestThread {

    public static void main(String[] args) {
        SampleThread sampleThread = new SampleThread();
        Thread myThread = new Thread(sampleThread, "Thread1");
        Thread myThread2 = new Thread(sampleThread, "Thread2");
        Thread myThread3 = new Thread(sampleThread, "Thread3");

        /*
        Thread1 will be executed first bcz it has got high priority.
        All other threads have got default priority of 5.
        This does not work bcz we get different results each time we run.
         */
        myThread.setPriority(6);

        myThread.start();
        myThread2.start();
        myThread3.start();
    }
}
