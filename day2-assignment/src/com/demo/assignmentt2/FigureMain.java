package com.demo.assignmentt2;

public class FigureMain {

	public static void main(String[] args) {

		Triangle t = new Triangle(4, 3);
		System.out.println(t.area());
		
		Rectangle r = new Rectangle(5, 2);
		System.out.println(r.area());
		
		Figure ref = t;
		System.out.println(ref.area());
		ref = r;
		System.out.println(ref.area());

	}

}
