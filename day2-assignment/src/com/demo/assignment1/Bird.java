package com.demo.assignment1;

public abstract class Bird {
	protected String feature1;
	protected String feature2;

	public Bird(String feature1, String feature2) {
		this.feature1 = feature1;
		this.feature2 = feature2;
	}

	public abstract String getBehavior();
}
