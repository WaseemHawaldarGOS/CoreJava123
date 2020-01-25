package com.gos.java8stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
https://beginnersbook.com/2017/10/java-8-stream-filter/
 */
public class FilterAndMap {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squares = num.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);

    }
}
