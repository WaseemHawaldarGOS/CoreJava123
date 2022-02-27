package com.gos;

import java.util.Arrays;
import java.util.List;

public class CollectionMethods {

    /**
     * The java.util.Collection interface contains a new default toArray method which takes an IntFunction argument.
     *
     * This makes it easier to create an array of the right type from a collection:
     *
     * The toArray() method allocates a new in-memory array with a length equal to the size of the collection.
     * Internally, it invokes the Arrays.copyOf on the underlying array backing the collection. Therefore, the returned array has no references to it and is safe to use:
     *
     */

    public static void main(String[] args) {
        String[] expectedStringArray = {"Java", "Kotlin"};
        List sampleList = Arrays.asList(expectedStringArray);
        String[] sampleArray = (String[]) sampleList.toArray(String[]::new);
        if(sampleArray.equals(expectedStringArray)){
            System.out.println("They are same");
        }else{
            System.out.println("They are not same");//expected output
        }
    }
}
