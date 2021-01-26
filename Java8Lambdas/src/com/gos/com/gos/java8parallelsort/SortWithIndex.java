package com.gos.com.gos.java8parallelsort;

import java.util.Arrays;

/*
https://beginnersbook.com/2017/10/java-8-arrays-parallel-sort-with-example/
 */
public class SortWithIndex {

    public static void main(String[] args) {
        int numbers[] = {22, 89, 1, 32, 19, 5};
        /* Specifying the start and end index. The start index is
         * 1 here and the end index is 5. which means the the elements
         * starting from index 1 till index 5 would be sorted.
         */
        Arrays.parallelSort(numbers, 1, 4);
        //converting the array to stream and displaying using forEach
        Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
    }
}
