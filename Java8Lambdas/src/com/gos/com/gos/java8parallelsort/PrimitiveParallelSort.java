package com.gos.com.gos.java8parallelsort;

import java.util.Arrays;

/*
https://beginnersbook.com/2017/10/java-8-arrays-parallel-sort-with-example/
 */

/*
Java 8 introduced a new method parallelSort() in the Arrays class of java.util package. This method is introduced to support
the parallel sorting of array elements.
Algorithm of parallel sorting:
1. The given array is divided into the sub arrays and the sub arrays are further divided into the their sub arrays, this happens
until the sub array reaches a minimum granularity.
2. The sub arrays are sorted individually by multiple threads. The parallel sort uses Fork/Join Framework for sorting sub arrays parallely.
3. The sorted sub arrays are merged.

Advantage of Parallel Sort Over Simple Sort:
The parallelSort() method uses the concept of multithreading which makes it much faster compared to the normal sort when there are lot of elements.
 */


public class PrimitiveParallelSort {

    public static void main(String[] args) {
        int numbers[] = {22, 89, 1, 32, 19, 5};
        //Parallel Sort method for sorting int array
        Arrays.parallelSort(numbers);
        //converting the array to stream and displaying using forEach
        Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
    }
}
