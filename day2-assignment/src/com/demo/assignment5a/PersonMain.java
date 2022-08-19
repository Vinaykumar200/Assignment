package com.demo.assignment5a;

import com.demo.assignment5.Person;

public class PersonMain {

	public static void main(String[] args) {

		Person p = new Person("Ram", 1, "Prabhu Nagar");
		System.out.println(p.getName());
		System.out.println(p.getId());
		System.out.println(p.getAddress());
		// System.out.println(p.address);// --cannot be accessed since it is Protected
		// parameter and is not inherited
		// System.out.println(p.id); // --cannot be accessed since it is default
		// parameter in different package
		// System.out.println(p.name); // -- cannot be accessed since it is private

	}

}