package com.gos.java8doublecolon;


/*
https://www.java67.com/2018/06/what-is-double-colon-operator-in-java-8.html
 */

/*
The double colon (::) operator is known as the method reference in Java 8. Method references are expressions
which have the same treatment as a lambda expression, but instead of providing a lambda body,
they refer to an existing method by name.
*/

/*
To demo usage of double colon we are going to use supplier functional interface
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Java8DoubleColonExamples {


    public static String getStaticString(){
        return "Printing from static string method.";
    }

    public String getNonStaticString(){
        return "Printing from non static string method.";
    }


    public static void main(String[] args) {

        Supplier<String> staticMethodsupplier = Java8DoubleColonExamples::getStaticString;
        System.out.println(staticMethodsupplier.get());

        Java8DoubleColonExamples java8DoubleColonExamples = new Java8DoubleColonExamples();
        Supplier<String> nonStaticMethodsupplier = java8DoubleColonExamples::getNonStaticString;
        System.out.println(nonStaticMethodsupplier.get());

        /*
        new String value into supplier
         */
        Supplier<String> newString = String::new;
        System.out.println("New String value is "+newString.get());

        /*
        new ArrayList value into supplier
         */
        Supplier<List> newArrayList = ArrayList::new;
        System.out.println("New newArrayList value is "+newArrayList.get());

    }


}
