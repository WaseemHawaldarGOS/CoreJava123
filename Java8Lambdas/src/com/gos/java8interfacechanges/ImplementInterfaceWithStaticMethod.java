package com.gos.java8interfacechanges;

/*
https://beginnersbook.com/2017/10/java-8-interface-changes-default-method-and-static-method/
 */
public class ImplementInterfaceWithStaticMethod implements InterfaceWithStaticMethod{

    // implementing abstract method
    public void existingMethod(String str){
        System.out.println("String is: "+str);
    }
    public static void main(String[] args) {
        InterfaceWithStaticMethod obj = new ImplementInterfaceWithStaticMethod();

        //calling the static method of interface
        InterfaceWithStaticMethod.staticMethodOfInterface();
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn");

    }
}
