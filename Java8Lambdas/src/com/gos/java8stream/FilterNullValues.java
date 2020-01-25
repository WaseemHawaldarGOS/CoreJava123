package com.gos.java8stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
https://beginnersbook.com/2017/10/java-8-filter-null-values-from-a-stream/
 */
public class FilterNullValues {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, null, 4, null, 5);
        List<Integer> result = list.stream()
                .map(num -> num) //here you will be having a different logic
                .filter(n -> n!=null)
                .collect(Collectors.toList());
        result.forEach(System.out::println);

    }
}
