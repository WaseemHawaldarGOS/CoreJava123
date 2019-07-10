package com.gos.oops.staticpolymorphism;

public class TestStaticPolymorphism {


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("return value is "+calc.division(6,3));

        System.out.println("\n**********************************************************\n\n");

        Calculator scienCalc = new ScientificCalculator();
        System.out.println("return value is "+scienCalc.division(6,3));



    }
}
