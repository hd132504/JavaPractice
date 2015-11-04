package org.dimigo.thread;

public class Runner2 implements Runnable{
	String name;

	public Runner2() {
		super();
	}

	public Runner2(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run(){
		System.out.println(name + " 출발");
		for(int i = 0; i < 10; i++){
			System.out.println(name + " " + (10 - i) * 10 + " 미터");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name + " 골인");
	}
}
