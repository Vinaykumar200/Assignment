package com.demo.assignmentt2;

public abstract class Figure {

	protected int dimension1;
	protected int dimension2;
	
	//concrete code
	public Figure(int dimension1, int dimension2) {
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
	}
	
	//abstract code
	public abstract double area();
}
