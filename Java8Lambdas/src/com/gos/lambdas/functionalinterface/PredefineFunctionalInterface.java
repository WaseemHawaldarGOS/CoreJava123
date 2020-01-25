package com.gos.lambdas.functionalinterface;

import java.util.function.IntBinaryOperator;


/*
https://beginnersbook.com/2017/10/java-functional-interfaces/
 */

/*
IntBinaryOperator is one such predefined functional interface.
Complete list of predefined functional interfaces can be found here
- https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
*/

public class PredefineFunctionalInterface {

    public static void main(String args[]) {
        // lambda expression
        IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.applyAsInt(12, 100));

    }
}
