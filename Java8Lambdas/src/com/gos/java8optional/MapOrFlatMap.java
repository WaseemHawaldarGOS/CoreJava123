package com.gos.java8optional;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
https://beginnersbook.com/2017/10/java-8-optional-class/
 */
public class MapOrFlatMap {

    public static void main(String[] args) {
        //Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");
        //Optional.empty() creates an empty Optional object
        Optional<String> nothing = Optional.empty();
        System.out.println(GOT.map(String::toLowerCase));
        System.out.println(nothing.map(String::toLowerCase));


        Optional<Optional<String>> anotherOptional = Optional.of(Optional.of("BreakingBad"));
        System.out.println("Value of Optional object is "+anotherOptional);
        System.out.println("Optional.map: "
                +anotherOptional.map(str -> str.map(String::toUpperCase)));
        //Optional<Optional<String>>    -> flatMap -> Optional<String>
        System.out.println("Optional.flatMap: "
                +anotherOptional.flatMap(str -> str.map(String::toUpperCase))
        );

        /*
        Map and flatmap practice with string of lines
         */

        List<String> listOfLines = Arrays.asList( "this is line 1", "this is line 2", "this is line 3");
        List<List<String>> listOfListOfLines = Arrays.asList( Arrays.asList("this is line 1"), Arrays.asList("this is line 2"), Arrays.asList("this is line 3"));

        System.out.println("Map output");
        //map is converting individual elements to upper case
        listOfLines.stream().map(String:: toUpperCase).forEach(System.out::println);


        System.out.println("FlatMap output");
        //flatmap is converting list of list of string to single list of string
        List<String> flatMapOutput = listOfListOfLines.stream().flatMap(Collection::stream).collect(Collectors.toList());
        flatMapOutput.forEach(System.out::println);

    }


}

