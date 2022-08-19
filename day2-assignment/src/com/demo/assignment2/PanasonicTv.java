package com.demo.assignment2;

public class PanasonicTv implements UniversalRemote {

	@Override
	public void switchOn() {
		System.out.println("panasonictv turnedon");	
	}

	@Override
	public void switchOff() {
		System.out.println("panasonictv turnedoff");	
	}

	@Override
	public void setChannel(int ch) {
		System.out.println(ch);
	}

}
