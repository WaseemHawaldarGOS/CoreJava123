
package com.gos.lambdas.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.json.JSONException;
import org.json.JSONObject;



/*
https://www.javabrahman.com/java-8
 */

public class Test {

	public static void main(String[] args) {
		
		try {
			System.out.println("Inside main. Thread name is " + Thread.currentThread());
			Test test = new Test();



			/*
			 * Below block of code is for invoking 3 threads in parallel which would return string message each
			 * i.e. Async manner and measuring the amount of time taken
			 */


			/*System.out.println("Before calling executingTasksInParallel");
			long startTime = System.currentTimeMillis();
			test.executingTasksInParallel();
			System.out.println("Total time taken is "+(System.currentTimeMillis() - startTime)/1000 + " seconds ");*/


			/*
			 * Below block of code is for invoking 3 threads which would return JSON object each in parallel
			 * i.e. Async manner and measuring the amount of time taken
			 */

			System.out.println("Before calling executingTasksInParallel");
			long startTime = System.currentTimeMillis();
			test.executingJSONTasksInParallel();
			System.out.println("Total time taken is "+(System.currentTimeMillis() - startTime)/1000 + " seconds ");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void executingTasksInParallel() {
		
		try {
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
			  System.out.println("inside Thread1. Thread name is  "+Thread.currentThread());
			  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			  
			return "Hello";  
		  });
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			  System.out.println("inside Thread2. Thread name is  "+Thread.currentThread());
			  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			  
			return "Beautiful";  
		  });
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
			  System.out.println("inside Thread3. Thread name is  "+Thread.currentThread());
			  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			  
			return "World";  
		  });
		 
		System.out.println("future1 is complete. output is "+future1.get());
		System.out.println("future2 is complete. output is "+future2.get());
		System.out.println("future3 is complete. output is "+future3.get());
		
		

			/*
			 * Below block can be used when we're not interested in output. i.e. only  invoke and wait for completion.
			 */

		CompletableFuture<Void> combinedFuture 
		  = CompletableFuture.allOf(future1, future2, future3);

		 
		System.out.println("Output from all the futures is " +combinedFuture.get());
		System.out.println("All the futures execution is done");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void executingJSONTasksInParallel() {
		
		try {
		CompletableFuture<JSONObject> future1 = CompletableFuture.supplyAsync(() -> {
			JSONObject future1JSON = new JSONObject();
			try {
				future1JSON.put("future1key", "future1Value");			
				System.out.println("inside Thread1. Thread name is  "+Thread.currentThread());			 
				Thread.sleep(5000);
			}catch (JSONException e1) {
				e1.printStackTrace();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			  
			return future1JSON;  
		  });
		
		
		
		CompletableFuture<JSONObject> future2 = CompletableFuture.supplyAsync(() -> {
			JSONObject future2JSON = new JSONObject();
			try {
				future2JSON.put("future2key", "future2Value");			
				System.out.println("inside Thread2. Thread name is  "+Thread.currentThread());			 
				Thread.sleep(5000);
			}catch (JSONException e1) {
				e1.printStackTrace();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}			  
			return future2JSON;  
		  });
		
		
		CompletableFuture<JSONObject> future3 = CompletableFuture.supplyAsync(() -> {
			JSONObject future3JSON = new JSONObject();
			try {
				future3JSON.put("future3key", "future3Value");			
				System.out.println("inside Thread3. Thread name is  "+Thread.currentThread());			 
				Thread.sleep(5000);
			}catch (JSONException e1) {
				e1.printStackTrace();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}			  
			return future3JSON;  
		  });
		 
		System.out.println("future1 is complete. output is "+future1.get());//.get because input is supplier
		System.out.println("future2 is complete. output is "+future2.get());
		System.out.println("future3 is complete. output is "+future3.get());
		
		


			/*Below block can be used when we're not interested in output. i.e. only  invoke and wait for completion.
			 */

		CompletableFuture<Void> combinedFuture
		  = CompletableFuture.allOf(future1, future2, future3);

		 
		System.out.println("Output from all the futures is " +combinedFuture.get());
		System.out.println("All the futures execution is done");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}



