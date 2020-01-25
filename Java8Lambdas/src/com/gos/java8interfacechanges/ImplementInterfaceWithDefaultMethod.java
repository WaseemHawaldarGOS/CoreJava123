package com.gos.java8interfacechanges;

/*
https://beginnersbook.com/2017/10/java-8-interface-changes-default-method-and-static-method/
 */

/*
Prior to java 8, interface in java can only have abstract methods. All the methods of interfaces are public & abstract by default.
Java 8 allows the interfaces to have default and static methods. The reason we have default methods in interfaces is to allow
the developers to add new methods to the interfaces without affecting the classes that implements these interfaces.

Why default method?
For example, if several classes such as A, B, C and D implements an interface XYZInterface then if we add a new method to the XYZInterface,
we have to change the code in all the classes(A, B, C and D) that implements this interface. In this example we have only four classes
that implements the interface which we want to change but imagine if there are hundreds of classes implementing an interface then it
would be almost impossible to change the code in all those classes. This is why in java 8, we have a new concept “default methods”.
These methods can be added to any existing interface and we do not need to implement these methods in the implementation classes mandatorily,
thus we can add these default methods to existing interfaces without breaking the code.

We can say that concept of default method is introduced in java 8 to add the new methods in the existing interfaces in such a way so
that they are backward compatible. Backward compatibility is adding new features without breaking the old code.

Static methods in interfaces are similar to the default methods except that we cannot override these methods in the classes that
implements these interfaces.
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
