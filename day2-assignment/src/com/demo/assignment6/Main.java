package com.demo.assignment6;



public class Main {



   public static void main(String[] args) {
        
        
        Child child = new Child();
        
    
        
        if(child instanceof Child)
        {
            System.out.println("child is Instance of Child");
        }
        else {
            System.out.println("child Not an instance of Child");
        }
        
        if(child instanceof Parent)
        {
            System.out.println("child is Instance of Parent");
        }
        else {
            System.out.println("child Not an instance of Parent");
        }
        
        if(child instanceof Object)
        {
            System.out.println("child is Instance of Object");
        }
        else {
            System.out.println("child Not an instance of Object");
        }



   }



}