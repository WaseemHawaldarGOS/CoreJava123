package com.gos.java8stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
https://beginnersbook.com/2017/10/java-8-filter-a-map-by-keys-and-values/
 */
public class FilterMapWithKeysAndValues {

    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "ABC");
        hmap.put(2, "XCB");
        hmap.put(3, "ABB");
        hmap.put(4, "ZIO");

        Map<Integer, String> result = hmap.entrySet()
                .stream()
                .filter(p -> p.getKey().intValue() <= 2) //filter by key
                .filter(map -> map.getValue().startsWith("A")) //filter by value
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("Result: " + result);
    }
}
