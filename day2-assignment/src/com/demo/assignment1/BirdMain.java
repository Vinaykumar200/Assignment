package com.demo.assignment1;

public class BirdMain {

	public static void main(String[] args) {
		Parrot p=new Parrot("they are green","they have red beaks");
		Eagle e=new Eagle("they are carnivors", "they are huge and fly high");
		Duck d=new Duck("they are amphivors", "they cannot fly");
		
		System.out.println(p.getBehavior());
		System.out.println(e.getBehavior());
		System.out.println(d.getBehavior());
	}

}
