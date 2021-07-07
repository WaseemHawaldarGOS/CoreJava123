package com.gos.oops.staticpolymorphism;

public class TestStaticPolymorphism {


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("return value is "+calc.division(6,3));

        System.out.println("\n**********************************************************\n\n");

        ScientificCalculator scienCalc = new ScientificCalculator();//reference and object type is same so it is called static polymorphism
        System.out.println("return value is "+scienCalc.division(6,3));



    }
}
