package org.dimigo.thread;

public class Runner extends Thread{
	String name;

	public Runner() {
		super();
	}

	public Runner(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run(){
		System.out.println(name + " 출발");
		for(int i = 0; i < 10; i++){
			System.out.println(name + " " + (10 - i) * 10 + " 미터");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name + " 골인");
	}
}
