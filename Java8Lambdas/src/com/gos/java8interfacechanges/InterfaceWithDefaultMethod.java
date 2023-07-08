package com.gos.java8interfacechanges;

/*
https://beginnersbook.com/2017/10/java-8-interface-changes-default-method-and-static-method/
 */
public interface InterfaceWithDefaultMethod {

    /* This is a default method so we need not to implement this method in the implementation classes
     */
    default void defaultMethodOfInterface(){
        System.out.println("Newly added default method");
    }
    void existingMethod(String str);
}
