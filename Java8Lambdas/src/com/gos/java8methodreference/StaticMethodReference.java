package com.gos.java8methodreference;

/*
https://beginnersbook.com/2017/10/method-references-in-java-8/
 */

import java.util.function.BiFunction;

class Multiplication{
    public static int multiply(int a, int b){
        return a*b;
    }
}

public class StaticMethodReference {

    /*
    Read about BiFunction here
    https://docs.oracle.com/javase/8/docs/api/java/util/function/BiFunction.html

    Represents a function that accepts two arguments and produces a result.
    This is a functional interface whose functional method is apply(Object, Object).

    Interface BiFunction<T,U,R>
    Type Parameters:
    T - the type of the first argument to the function
    U - the type of the second argument to the function
    R - the type of the result of the function

    This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
    */
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
        int pr = product.apply(11, 5);
        System.out.println("Product of given number is: "+pr);
    }


}
