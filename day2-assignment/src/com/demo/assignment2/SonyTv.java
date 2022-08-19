package com.demo.assignment2;

public class SonyTv implements UniversalRemote {

	@Override
	public void switchOn() {
		System.out.println("sonytv turnedon");
	}

	@Override
	public void switchOff() {
		System.out.println("sonytv turnedoff");
	}

	@Override
	public void setChannel(int ch) {
		System.out.println(ch);
	}
	

}
