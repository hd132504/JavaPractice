package org.dimigo.thread;

public class Race{
	public static void main(String[] args) {
		System.out.println("main thread start");
		Thread t1 = new Runner("피카츄");
		Thread t2 = new Runner("꼬부기");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
	}

}
