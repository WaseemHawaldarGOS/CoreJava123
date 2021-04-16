package com.gos.com.gos.java8optional;

import java.util.Optional;

/*
https://beginnersbook.com/2017/10/java-8-optional-class/
 */
public class OrElseGet {

    public static void main(String[] args) {
        //Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");
        //Optional.empty() creates an empty Optional object
        Optional<String> nothing = Optional.empty();

        //orElse() method
        System.out.println(GOT.orElse("Default Value"));
        System.out.println(nothing.orElse("Default Value"));

        //orElseGet() method
        System.out.println(GOT.orElseGet(() -> "Default Value"));
        System.out.println(nothing.orElseGet(() -> "Default Value"));

    }

}
