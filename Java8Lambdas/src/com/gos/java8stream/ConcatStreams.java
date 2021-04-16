package com.gos.java8stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/*
https://beginnersbook.com/2017/10/java-8-stream-tutorial/
 */
public class ConcatStreams {

    public static void main(String[] args) {
        //list 1
        List<String> alphabets = Arrays.asList("A","B","C");
        //list 2
        List<String> names = Arrays.asList("Sansa","Jon","Arya");

        //creating two streams from the two lists and concatenating them into one
        Stream<String> opstream = Stream.concat(alphabets.stream(), names.stream());

        //displaying the elements of the concatenated stream
        opstream.forEach(str->System.out.print(str+" "));
    }


}
