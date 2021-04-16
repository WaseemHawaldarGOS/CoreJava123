package com.gos.com.gos.java8optional;

import java.util.Optional;

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
                +anotherOptional.flatMap(str -> str.map(String::toUpperCase)));
    }


}
