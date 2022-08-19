package com.demo.assignment1;

public class Parrot extends Bird{

	public Parrot(String feature1, String feature2) {
		super(feature1,feature2);
	}
	
	public String getBehavior() {
		return ( feature1 +" "+ feature2);           
	}
}
