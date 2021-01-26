package com.gos.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


/*
LinkedHashSet strictly maintains insertion order
 */
public class LinkedHashSetExample {

    public static void main(String args[]) {
        boolean status = false;
        // create a hash set
        LinkedHashSet hs = new LinkedHashSet<>();
// add elements to the hash set

        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");

        status = hs.add("F");
        if (status == false) {
            System.out.println("Addition of F failed");
        } else {
            System.out.println("Addition of F succeeded");
        }

        //try adding duplicates
        status = hs.add("F");
        if (status == false) {
            System.out.println("Addition of F failed");
        } else {
            System.out.println("Addition of F succeeded");
        }


        System.out.println(hs.toString());

        System.out.println("Trying to add heterogenous data");
        status = hs.add(100);//this line of code fails
        if(!status)
            System.out.println("Additional of heterogenous data succeeded");
        else
            System.out.println("Additional of heterogenous data failed");


    }
}
