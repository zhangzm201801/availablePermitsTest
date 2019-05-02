package myservice;

import java.util.concurrent.Semaphore;

public class MyService1 {

	private Semaphore semaphore = new Semaphore(10);

	public void testMethod() {
		try {
			semaphore.acquire();
			System.out.println("availablePermits:" + semaphore.availablePermits());
			System.out.println("availablePermits:" + semaphore.availablePermits());
			System.out.println("availablePermits:" + semaphore.availablePermits());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}

}
