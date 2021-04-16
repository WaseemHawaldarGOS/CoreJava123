package com.gos.java8stream;


import java.util.stream.Stream;

/*
https://beginnersbook.com/2017/10/java-8-stream-tutorial/
 */
public class DisplaySelectedIntegers {


    /*
    Refer below link for iterate behavior
    https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#iterate-T-java.util.function.UnaryOperator-
     */

    public static void main(String[] args){
        Stream.iterate(1, count->count+1)
                .filter(number->number%3==0)
                .limit(6)
                .forEach(System.out::println);
    }
}
