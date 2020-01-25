package com.gos.java8foreach;

import java.util.ArrayList;
import java.util.List;

/*
https://beginnersbook.com/2017/10/java-8-foreach/
 */
public class IterateAStream {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Maggie");
        names.add("Michonne");
        names.add("Rick");
        names.add("Merle");
        names.add("Governor");
        names.stream() //creating stream
                .filter(f->f.startsWith("M")) //filtering names that starts with M
                .forEach(System.out::println); //displaying the stream using forEach
    }
}
