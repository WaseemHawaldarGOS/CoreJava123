package com.gos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PredicateMethod {

    /**
     * A static not method has been added to the Predicate interface. We can use it to negate an existing predicate, much like the negate method:
     *
     * While not(isBlank) reads more naturally than isBlank.negate(), the big advantage is that we can also use not with method references, like not(String:isBlank).
     */
    public static void main(String[] args) {
        List<String> expectedList = Arrays.asList("Java","Kotlin");
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
        List withoutBlanks = sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        assertEquals(withoutBlanks,expectedList);
    }
}
