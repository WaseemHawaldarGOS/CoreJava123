package com.gos.collections.set;

import java.util.TreeSet;

public class TestTreeSetComparator {

    public static void main(String[] args) {
        // Create a tree set
        TreeSet ts = new TreeSet(new TreeSetComparator());
// Add elements to the tree set
        ts.add("CA");
        ts.add("AA");
        ts.add("AB");
        ts.add("AD");
        ts.add("CB");
        ts.add("DD");
        ts.add(1);

        for(Object element : ts){
            System.out.print(element + " ");
        }
}
}
