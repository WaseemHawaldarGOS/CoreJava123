package com.gos.java8foreach;

import java.util.ArrayList;
import java.util.List;

/*
https://beginnersbook.com/2017/10/java-8-foreach/
 */
public class IterateAList {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Mango");
        //lambda expression in forEach Method
        fruits.forEach(str->System.out.println(str));
    }
}
