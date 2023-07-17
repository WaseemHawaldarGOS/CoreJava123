package com.gos.behavioral.statepattern;

/**
 * https://www.baeldung.com/java-state-design-pattern
 */
public interface PackageState {

    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
