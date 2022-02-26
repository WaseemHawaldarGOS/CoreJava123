package stringmethods;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsBlankLinesStrip {

    public static void main(String[] args) {
        String multilineString = "Baeldung helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
        assertEquals(lines, Arrays.asList("Baeldung helps", "developers", "explore Java."));
    }




}
