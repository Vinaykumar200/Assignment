package com.demo.assignmentt2;

public class Triangle extends Figure{

	public Triangle(int dimension1, int dimension2) {
		super(dimension1, dimension2);
	}
	
	public double area() {
		return(dimension1*dimension2)/2;
	}
}
