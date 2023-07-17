package com.gos.behavioral.observerpattern;

/**
 * https://www.javabrahman.com/design-patterns/observer-design-pattern-in-java/
 */

import java.util.Observable;

public class Publisher extends Observable {
    public void changeStateTo(String newStateName){
        this.setChanged();
        this.notifyObservers(newStateName);
    }
}
