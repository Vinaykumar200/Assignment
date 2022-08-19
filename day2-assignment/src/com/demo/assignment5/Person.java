package com.demo.assignment5;



public class Person {
    
    private String name;
    int id;
    protected String address;
    
    public Person(String name,int id,String address)
    {
        
        this.name = name;
        this.id = id;
        this.address = address;
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getAddress()
    {
        return address;
    }
    

}