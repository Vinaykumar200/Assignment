package com.demo.assignment2;

public class BPLTv implements UniversalRemote{

	@Override
	public void switchOn() {
		System.out.println("BPLtv turnedon");	
	}

	@Override
	public void switchOff() {
		System.out.println("BPLtv turnedoff");	
	}

	@Override
	public void setChannel(int ch) {
		System.out.println(ch);	
	}

}
