package com.gos.java8stringjoiner;

import java.util.StringJoiner;

/*
In java 8, a new class StringJoiner is introduced in the java.util package.
Using this class we can join more than one strings with the specified delimiter,
we can also provide prefix and suffix to the final string while joining multiple strings.
In this tutorial we will see several examples of StringJoiner class and at the end of
this guide, we will see the methods of StringJoiner class.
 */

/*
https://beginnersbook.com/2017/10/java-8-stringjoiner/
 */
public class MergingStringJoiners {

    public static void main(String[] args) {
        /* Passing comma(,) as delimiter and opening bracket
         * "(" as prefix and closing bracket ")" as suffix
         */
        StringJoiner mystring = new StringJoiner(",", "(", ")");

        mystring.add("Negan");
        mystring.add("Rick");
        mystring.add("Maggie");
        mystring.add("Daryl");

        System.out.println("First String: "+mystring);

        /* Passing hyphen(-) as delimiter and string "pre"
         * as prefix and string "suff" as suffix
         */
        StringJoiner myanotherstring = new StringJoiner("-", "pre", "suff");

        myanotherstring.add("Sansa");
        myanotherstring.add("Imp");
        myanotherstring.add("Jon");
        myanotherstring.add("Ned");

        System.out.println("Second String: "+myanotherstring);

        /* Merging both the strings
         * The important point to note here is that the output string will be
         * having the prefix and suffix of the first string (the string
         * which is calling the merge method of StringJoiner)
         */
        StringJoiner mergedString = mystring.merge(myanotherstring);
        System.out.println(mergedString);
    }
}
