package com.gos.behavioral.observerpattern;

/**
 * https://www.javabrahman.com/design-patterns/observer-design-pattern-in-java/
 */

public class Client {
    public static void main(String args[]){
        Publisher publisher=new Publisher();
        publisher.addObserver(new Subscriber1());
        publisher.addObserver(new Subscriber2());
        publisher.changeStateTo("assigned");
    }
}
