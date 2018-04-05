package com.avishek.org;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class JavaThreadExecutors {
	
	int abhi = 0;
	synchronized void incrementAbhi() {
		abhi = abhi +1;
	}	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Avishek's thread first:::" +threadName);
		};
		task.run();
		Thread t1 = new Thread(task);
		t1.start();
		System.out.println("Finished thread execution first>>>>>>");
		
		//ExecutorService and Executors, required for thread pools
		ExecutorService exec = Executors.newSingleThreadExecutor();
		exec.submit(() -> {
			String threadName2 = Thread.currentThread().getName();
			System.out.println("Avishek second thread:::::" +threadName2);
		});
		
		Thread thread = new Thread();
		System.out.println("Finishing Avishek second thread>>>>>>>.");
		
		ScheduledExecutorService schExecutor = Executors.newScheduledThreadPool(1);
		Runnable task2 = () -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				System.out.printf("The time to execute as scheduled>>>>>",+System.nanoTime());
			} catch (InterruptedException e) {
				System.err.println("Inside catch statement?>>>");
				
			}
			System.out.println("After schedule run;;;;;;" +schExecutor.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS));
			
			//Using synchronized keyword
			// Replace traditional for loops with Intsream
			ExecutorService executorService = Executors.newFixedThreadPool(2);
			//IntStream.range(0, 1000).forEach(i->executorService.submit(this::incremenAbhi));
			//stop(executorService);
		};
	}

}
