package org.dimigo.inheritance;

public class iPhone extends SmartPhone{
	public iPhone(){
		//empty
	}

	public iPhone(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}
	
	public void pay(){
		System.out.println("애플 페이로 결제합니다.");
	}
	
	public void useAirDrop(){
		System.out.println("AirDrop 기능을 사용합니다.");
	}
}
