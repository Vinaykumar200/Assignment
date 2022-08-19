package com.demo.assignment2;

public class RemoteMain {

	public static void main(String[] args) {
	  UniversalRemote r= new SonyTv();
	  r.switchOn();
	  r.setChannel(8);
	  r.switchOff();

	}

}
