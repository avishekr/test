package com.avishek.org;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.StampedLock;

public class StampedLockTest {

	public static void main(String[] args) {
		ExecutorService execServ = Executors.newFixedThreadPool(2);
		Map<String,String> m1 = new HashMap<>();
		StampedLock slock = new StampedLock();
		execServ.submit(() -> {
			long stamp = slock.writeLock();
			try{
				//TimeUnit.MILLISECONDS.sleep(1);
				m1.put("abhi", "jaya");
			}finally {
				slock.unlockWrite(stamp);
			}
		});
		Runnable readTask = () -> {
			long stamp = slock.readLock();
			try {
				System.out.println(m1.get("jaya"));
				//TimeUnit.SECONDS.sleep(2);
			}finally{
				slock.unlockRead(stamp);
			}
		};
		execServ.submit(readTask);
		execServ.submit(readTask);
	}

}
