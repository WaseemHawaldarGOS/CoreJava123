package com.gos.executors.threadpoolCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolExecutorService {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder finalRstBuilder = new StringBuilder();
        Callable<String> callable = null;
        Future<String> responseFuture = null;

        /*
        newFixedThreadPool:
        Creates a thread pool that reuses a fixed number of threads operating off a shared unbounded queue. At any point, at most nThreads threads will be active processing tasks.
         */
        //ExecutorService executor = Executors.newFixedThreadPool(1);// takes - 10 seconds
        //ExecutorService executor = Executors.newFixedThreadPool(2);// takes - 6 seconds
        //ExecutorService executor = Executors.newFixedThreadPool(3);//takes - 4 seconds
        //ExecutorService executor = Executors.newFixedThreadPool(4);//takes - 4 seconds
        //ExecutorService executor = Executors.newFixedThreadPool(5);//takes - 2 seconds


        /*
        newCachedThreadPool:
        Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available.
        These pools will typically improve the performance of programs that execute many short-lived asynchronous tasks.
         */
        ExecutorService executor = Executors.newCachedThreadPool();//takes 5 seconds


        List<Future<String>> resultantList = new ArrayList<Future<String>>();

        List<String> filesTobeRead = new ArrayList<String>();
        filesTobeRead.add("D:\\java_training_workspace\\SampleFiles\\test1.txt");
        filesTobeRead.add("D:\\java_training_workspace\\SampleFiles\\test2.txt");
        filesTobeRead.add("D:\\java_training_workspace\\SampleFiles\\test3.txt");
        filesTobeRead.add("D:\\java_training_workspace\\SampleFiles\\test4.txt");
        filesTobeRead.add("D:\\java_training_workspace\\SampleFiles\\test5.txt");


        for(String fileName: filesTobeRead){
            callable = new FileReaderCallableTask(fileName);
            responseFuture = executor.submit(callable);
            resultantList.add(responseFuture);
        }

        for(Future<String> futureString : resultantList){
            try {
                finalRstBuilder.append(futureString.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final output after the complete pool execution is "+finalRstBuilder.toString());

        executor.shutdown();

        System.out.println("Total time taken is "+(System.currentTimeMillis() - startTime)/1000 + " seconds");

    }
}
