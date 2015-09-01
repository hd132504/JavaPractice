package org.dimigo.abstractclass;

public class SmartPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone a = new Galaxy("갤럭시 S6","삼성",650000);
		SmartPhone b = new iPhone("iPhone 6","애플",700000);
		
		System.out.println(a.toString());
		a.turnOn();
		a.pay();
		a.useSpecialFunction();
		a.turnOff();
		
		System.out.println();
		
		System.out.println(b.toString());
		b.turnOn();
		b.pay();
		b.useSpecialFunction();
		b.turnOff();
	}

}
