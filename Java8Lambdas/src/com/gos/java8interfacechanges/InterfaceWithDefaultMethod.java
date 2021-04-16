package com.gos.java8interfacechanges;

/*
https://beginnersbook.com/2017/10/java-8-interface-changes-default-method-and-static-method/
 */
public interface InterfaceWithDefaultMethod {

    /* This is a default method so we need not
     * to implement this method in the implementation
     * classes
     */
    default void newMethod(){
        System.out.println("Newly added default method");
    }
    /* Already existing public and abstract method
     * We must need to implement this method in
     * implementation classes.
     */
    void existingMethod(String str);
}
