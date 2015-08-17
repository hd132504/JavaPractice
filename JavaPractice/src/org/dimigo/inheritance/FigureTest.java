package org.dimigo.inheritance;

public class FigureTest {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		System.out.println("원의 넓이 : " + String.format("%.1f",c.calcArea()));
		
		Triangle t = new Triangle(10,10,5,8);
		System.out.println("삼각형 넓이 : " + t.calcArea());
		
		Rectangle r = new Rectangle(20,20,5,8);
		System.out.println("사각형 넓이 : " + r.calcArea());
		
		System.out.println();
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
		c.moveFigure(5, 5);
		t.moveFigure(5, 5);
		r.moveFigure(5, 5);
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
	}

}