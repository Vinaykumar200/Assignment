package org.demo.client;



import org.demo.tools.Calculator;



public class MathsTester {
    
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        System.out.println(calc.add(24, 2));
        System.out.println(calc.multiply(26, 20));
        System.out.println(calc.subtract(21, 9));
        
    }



}