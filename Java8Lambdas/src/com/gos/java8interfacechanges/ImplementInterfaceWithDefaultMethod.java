package com.gos.java8interfacechanges;

/*
https://beginnersbook.com/2017/10/java-8-interface-changes-default-method-and-static-method/
 */
public class ImplementInterfaceWithDefaultMethod implements InterfaceWithDefaultMethod{

    // implementing abstract method
    public void existingMethod(String str){
        System.out.println("String is: "+str);
    }
    public static void main(String[] args) {
        ImplementInterfaceWithDefaultMethod obj = new ImplementInterfaceWithDefaultMethod();

        //calling the default method of interface
        obj.newMethod();
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn");

    }
}
