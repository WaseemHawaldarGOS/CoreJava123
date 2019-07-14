package com.gos.oops.threads;

public class TestThread {

    public static void main(String[] args) {
        SampleThread sampleThread = new SampleThread();
        Thread myThread = new Thread(sampleThread, "Thread1");
        Thread myThread2 = new Thread(sampleThread, "Thread2");
        Thread myThread3 = new Thread(sampleThread, "Thread3");

        myThread.start();

        if(!myThread.isAlive()){
            myThread2.start();
        }

        if(!myThread2.isAlive()){
            myThread3.start();
        }



    }

}
