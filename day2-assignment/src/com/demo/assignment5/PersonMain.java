package com.demo.assignment5;

public class PersonMain {



   public static void main(String[] args) {
        
        Person p = new Person("Vinay",1,"Vidya Nagar");
        System.out.println(p.getName());
        System.out.println(p.getId());
        System.out.println(p.getAddress());
        System.out.println(p.id);
        System.out.println(p.address);
       // System.out.println(p.name); // -- cannot be accessed since it is private 

   }



}