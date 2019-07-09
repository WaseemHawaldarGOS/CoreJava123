package com.gos.oops.dynamicpolymorphism;

public class TestDynamicPolymorphism {

    public static void main(String[] args) {

        IOSPhone iPhone5s = new IPhone5s();
        System.out.println("-------------------buying iPhone5s ");
        iPhone5s.buyIPhone();

        IOSPhone iPhone6s = new IPhone6s();
        System.out.println("\n\n-------------------buying iPhone6s ");
        iPhone6s.buyIPhone();

        IOSPhone iPhone7Plus = new IPhone7Plus();
        System.out.println("\n\n-------------------buying iPhone7Plus ");
        iPhone7Plus.buyIPhone();
    }
}
