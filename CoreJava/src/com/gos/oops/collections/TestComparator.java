package com.gos.oops.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TestComparator {

    public static void main(String[] args) {
        // Create a tree set
        TreeSet ts = new TreeSet(new MyComparator());
// Add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
// Get an iterator
        Iterator i = ts.iterator();
// Display elements
        while(i.hasNext()) {
            Object element = i.next();
            System.out.print(element + " ");
        }
        System.out.println();


}
}
