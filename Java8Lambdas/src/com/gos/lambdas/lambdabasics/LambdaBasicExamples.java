package com.gos.lambdas.lambdabasics;

/*
https://beginnersbook.com/2017/10/java-lambda-expressions-tutorial-with-examples/
 */


/*
Lambda expression is a new feature which is introduced in Java 8. A lambda expression is an anonymous function.
A function that doesn’t have a name and doesn’t belong to any class. The concept of lambda expression was first
introduced in LISP programming language.


To create a lambda expression, we specify input parameters (if there are any) on the left side of the lambda operator ->,
and place the expression or block of statements on the right side of lambda operator. For example, the lambda expression
(x, y) -> x + y specifies that lambda expression takes two arguments x and y and returns the sum of these.
 */

import java.util.ArrayList;
import java.util.List;

public class LambdaBasicExamples {


    public static void main(String args[]) {

     /*
    Java Lambda Expression with no parameter
     */
        System.out.println("Java Lambda Expression with no parameter");
        MyFunctionalInterface1 msg = () -> {
            return "Hello";
        };
        System.out.println(msg.sayHello());
        System.out.println("***********************************************************************");


       /*
        Java Lambda Expression with single parameter
        */
        System.out.println("Java Lambda Expression with single parameter");
        MyFunctionalInterface2 f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));
        System.out.println("***********************************************************************");


        /*
         Java Lambda Expression with Multiple Parameters
         */
        System.out.println("Java Lambda Expression with Multiple Parameters");
        MyFunctionalInterface3 s = (str1, str2) -> str1 + str2;
        System.out.println("Result: "+s.sconcat("Hello ", "World"));
        System.out.println("***********************************************************************");


        /*
        Iterating collections using foreach loop
         */
        System.out.println("Iterating collections using foreach loop");
        List<String> list=new ArrayList<String>();
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");
        list.forEach(
                // lambda expression
                (names)->System.out.println(names)
        );
        System.out.println("***********************************************************************");

    }



}
