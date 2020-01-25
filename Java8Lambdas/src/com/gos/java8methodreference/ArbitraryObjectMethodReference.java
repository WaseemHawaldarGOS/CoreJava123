package com.gos.java8methodreference;

/*
https://beginnersbook.com/2017/10/method-references-in-java-8/
 */

/*
In the previous tutorial we learned lambda expressions in Java 8. Here we will discuss another new feature of java 8, method reference.
Method reference is a shorthand notation of a lambda expression to call a method. For example:
If your lambda expression is like this:

str -> System.out.println(str)
then you can replace it with a method reference like this:

System.out::println
The :: operator is used in method reference to separate the class or object from the method name(we will learn this with the help of examples).

Four types of method references
1. Method reference to an instance method of an object – object::instanceMethod
2. Method reference to a static method of a class – Class::staticMethod
3. Method reference to an instance method of an arbitrary object of a particular type – Class::instanceMethod
4. Method reference to a constructor – Class::new
 */

import java.util.Arrays;

public class ArbitraryObjectMethodReference {


    public static void main(String[] args) {
        String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
        /* Method reference to an instance method of an arbitrary
         * object of a particular type
         */
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for(String str: stringArray){
            System.out.println(str);
        }
    }


}
