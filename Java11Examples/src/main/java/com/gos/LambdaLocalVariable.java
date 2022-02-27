package com.gos;

import lombok.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LambdaLocalVariable {

    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        /*
        Test with this to create NPE
        List<String> sampleList = Arrays.asList("Java", "Kotlin", null);
         */

        String resultString = sampleList.stream()
                .map((@NonNull var x) -> x.toUpperCase())
                .collect(Collectors.joining(","));
        assertEquals("JAVA,KOTLIN", resultString);
    }
}
