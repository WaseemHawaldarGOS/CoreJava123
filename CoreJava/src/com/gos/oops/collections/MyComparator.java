package com.gos.oops.collections;

import java.util.Comparator;

public class MyComparator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        String aStr, bStr;
        aStr = (String) o1;
        bStr = (String) o2;
// reverse the comparison
        //return bStr.compareTo(aStr);//to sort in descending order
        return aStr.compareTo(bStr);//to sort in ascending order
    }
// no need to override equals



    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
