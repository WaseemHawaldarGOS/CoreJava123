package com.gos.oops.inheritence;

public class TestInheritence {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(100, 3);
        System.out.println("Bicyle details are \n"+bicycle.toString());

        MountainBicycle mountainBicycle = new MountainBicycle(200,5,25);
        System.out.println("\n\nMountain bike details are \n"+mountainBicycle.toString());
    }
}
