package com.gos.java8stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
https://beginnersbook.com/2017/10/java-8-stream-filter/
 */
public class FilterAndCollect {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        List<String> longnames = names.stream()
                .filter(str -> str.length() > 6 && str.length() < 8) //Multiple conditions
                .collect(Collectors.toList());

        longnames.forEach(System.out::println);

    }
}
