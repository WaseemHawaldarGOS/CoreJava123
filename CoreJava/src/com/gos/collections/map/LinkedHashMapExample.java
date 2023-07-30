package com.gos.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap strictly maintains insertion order as compared to HashMap which maintains some other order.
 */
public class LinkedHashMapExample {

    public static void main(String args[]) {

// Create a hash map
        Map<String, Double> hm = new LinkedHashMap<>();

// Put elements to the map
        hm.put("John Doe", 3434.12);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Todd Hall", 99.22);
        hm.put("Ralph Smith", -19.08);

        for(Map.Entry<String, Double> map : hm.entrySet()){
            System.out.print(map.getKey() + ": ");
            System.out.println(map.getValue());
        }
        System.out.println();

// Deposit 1000 into John Doe's account
        double balance = (double)hm.get("John Doe");
        hm.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance: " +
                hm.get("John Doe"));
    }

}
