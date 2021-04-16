package com.gos.java8methodreference;

/*
https://beginnersbook.com/2017/10/method-references-in-java-8/
 */

public class InstanceMethodReference {


    public void myMethod(){
        System.out.println("Instance Method");
    }
    public static void main(String[] args) {
        InstanceMethodReference obj = new InstanceMethodReference();
        // Method reference using the object of the class
        MyInterface ref = obj::myMethod;
        // Calling the method of functional interface
        ref.display();
    }



}
