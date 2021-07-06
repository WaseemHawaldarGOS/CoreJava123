package com.gos.java8stringjoiner;

import java.util.StringJoiner;

/*
https://beginnersbook.com/2017/10/java-8-stringjoiner/
 */
public class UsingDelimiter {

    public static void main(String[] args) {
        // Passing Hyphen(-) as delimiter
        StringJoiner mystring = new StringJoiner("-");

        // Joining multiple strings by using add() method
        mystring.add("Logan");
        mystring.add("Magneto");
        mystring.add("Rogue");
        mystring.add("Storm");

        // Displaying the output String
        System.out.println(mystring);
    }
}
