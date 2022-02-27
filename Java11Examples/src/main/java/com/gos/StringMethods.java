package com.gos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringMethods {


    public static void main(String[] args) {
        isBankLineStrip();
        repeat();
        stripAndTrim();
        isBlankCheck();
    }

    /**
     * The lines() instance method returns a Stream of lines extracted from the string, separated by line terminators:
     */
    public static void isBankLineStrip(){
        String multilineString = "Baeldung helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
        assertEquals(lines, Arrays.asList("Baeldung helps", "developers", "explore Java."));
    }

    /**
     * It returns a string whose value is the concatenation of the string repeated n times, where n is passed as a parameter:
     */
    public static void repeat() {
        String output = "La ".repeat(2) + "Land";
        assertEquals(output,"La La Land");
    }

    /**
     * strip*() determines whether the character is whitespace or not based on Character.isWhitespace(). In other words, it is aware of Unicode whitespace characters.
     *
     * This is different from trim(), which defines space as any character that is less than or equal to the Unicode space character (U+0020).
     */

    public static void stripAndTrim(){
        assertEquals("\n\t  hello   \u2005".strip(),"hello");
        assertEquals("\n\t  hello   \u2005".trim(),"hello   \u2005");
    }

    /**
    The isBlank() instance method returns true if the string is empty or contains only whitespace. Otherwise, it returns false:
     */
    public static void isBlankCheck(){
        assertTrue("\n\t\u2005  ".isBlank());
    }


}
