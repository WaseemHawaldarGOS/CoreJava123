package com.gos.behavioral.statepattern;

/**
 * https://www.baeldung.com/java-state-design-pattern
 */
public class TestStatePattern {

    public static void main(String[] args) {


        Package pkg = new Package();
        System.out.println("Beginning with new package. Current status is");
        pkg.printStatus();

        System.out.println("******************************************************\n");

        pkg.nextState();
        System.out.println("Moved from Ordered to Delivered state. Current status is");
        pkg.printStatus();

        System.out.println("******************************************************\n");

        pkg.nextState();
        System.out.println("Moved from Delivered to Received state. Current status is");
        pkg.printStatus();

        System.out.println("******************************************************\n");

        System.out.println("Cannot move from Received state so stay in Received state only. Current status is");
        System.out.println("On next call prints below");
        pkg.nextState();
        System.out.println("On printstatus call prints below");
        pkg.printStatus();
    }
}
