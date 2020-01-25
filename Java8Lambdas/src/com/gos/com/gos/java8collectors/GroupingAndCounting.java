package com.gos.com.gos.java8collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
https://beginnersbook.com/2017/10/java-8-stream-collectors-class-with-examples/
 */

/*
https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html#counting--
https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html#identity--
 */
public class GroupingAndCounting {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Jon", "Ajeet", "Steve",
                        "Ajeet", "Jon", "Ajeet");

        Map<String, Long> map =
                names.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(map);

    }
}
