package com.gos.threads.basicthreads;

/*
We can do extends Thread class or implements Runnable interface
 */
public class SampleThread extends Thread{

    @Override
    public void run(){
        for(int i = 0; i <10; i++){
            System.out.println(Thread.currentThread() +" "+i);
        }
    }
}
