package com.gos.collections.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * We can add heterogeneous data to hashSet and linkedHashSet,
 * but not to TreeSet because it needs keys to be of same type to compare the data using comparator.
 */
public class TreeSetExample {

    public static void main(String args[]) {
// Create a tree set
        Set ts = new TreeSet();
// Add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        /*
        Adding heterogeneous data will result in
        thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
         */
        ts.add(1);
        ts.add(2);
        System.out.println(ts);
    }

}
