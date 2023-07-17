package com.gos.behavioral.observerpattern;

/**
 * https://www.javabrahman.com/design-patterns/observer-design-pattern-in-java/
 */

import java.util.Observable;
import java.util.Observer;
public class Subscriber2 implements Observer{
    String currentPublisherState;
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("New state received by Subscriber 2:"+arg.toString());
        this.currentPublisherState=(String)arg;
    }
}
