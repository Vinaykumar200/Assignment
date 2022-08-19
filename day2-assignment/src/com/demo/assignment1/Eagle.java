package com.demo.assignment1;

public class Eagle extends Bird {
	public Eagle(String feature1, String feature2) {
		super(feature1,feature2);
	}
	
	public String getBehavior() {
		return ( feature1 +" "+ feature2);           
	}
}
