package com.gos.behavioral.statepattern;

/**
 * https://www.baeldung.com/java-state-design-pattern
 */
public class Package {

    private PackageState state = new OrderedState();

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }


    // getter, setter

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }
}