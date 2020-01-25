package com.gos.com.gos.java8stringjoiner;

import java.util.StringJoiner;

/*
https://beginnersbook.com/2017/10/java-8-stringjoiner/
 */
public class UsingPrefixAndSuffix {

    public static void main(String[] args) {
        /* Passing comma(,) as delimiter and opening bracket
         * "(" as prefix and closing bracket ")" as suffix
         */
        StringJoiner mystring = new StringJoiner(",", "(", ")");

        // Joining multiple strings by using add() method
        mystring.add("Negan");
        mystring.add("Rick");
        mystring.add("Maggie");
        mystring.add("Daryl");

        // Displaying the output String
        System.out.println(mystring);
    }
}
