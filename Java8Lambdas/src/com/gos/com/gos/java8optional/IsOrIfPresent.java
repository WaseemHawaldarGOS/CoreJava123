package com.gos.com.gos.java8optional;

import java.util.Optional;

/*
https://beginnersbook.com/2017/10/java-8-optional-class/
 */

/*
In Java 8, we have a newly introduced Optional class in java.util package. This class is introduced to avoid NullPointerException
that we frequently encounters if we do not perform null checks in our code. Using this class we can easily check whether a variable
has null value or not and by doing this we can avoid the NullPointerException. In this guide, we will see how to work with Optional
class and the usage of various methods of this class.

Before we see the example of Optional class, lets see what happens when we don’t use Optional class and do not perform null check.
 */


public class IsOrIfPresent {

    public static void main(String[] args) {
        //Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");
        //Optional.empty() creates an empty Optional object
        Optional<String> nothing = Optional.empty();
        /* isPresent() method: Checks whether the given Optional
         * Object is empty or not.
         */
        if (GOT.isPresent()) {
            System.out.println("Watching Game of Thrones");
        }
        else {
            System.out.println("I am getting Bored");
        }
        /* ifPresent() method: It executes only if the given Optional
         * object is non-empty.
         */
        //This will print as the GOT is non-empty
        GOT.ifPresent(s -> System.out.println("Watching GOT is fun!"));
        //This will not print as the nothing is empty
        nothing.ifPresent(s -> System.out.println("I prefer getting bored"));
    }

}
