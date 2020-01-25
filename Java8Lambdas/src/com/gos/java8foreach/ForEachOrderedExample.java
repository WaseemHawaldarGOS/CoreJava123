package com.gos.java8foreach;

import java.util.ArrayList;
import java.util.List;

/*
For sequential streams the order of elements is same as the order in the source,
so the output would be same whether you use forEach or forEachOrdered. However
when working with parallel streams, you would always want to use the forEachOrdered()
method when the order matters to you, as this method guarantees that the order of
elements would be same as the source. Lets take an example to understand the difference
between forEach() and forEachOrdered().
*/

/*
https://beginnersbook.com/2017/10/java-8-foreach/
 */
public class ForEachOrderedExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Maggie");
        names.add("Michonne");
        names.add("Rick");
        names.add("Merle");
        names.add("Governor");
        //forEach - the output would be in any order
        System.out.println("Print using forEach");
        names.stream()
                .filter(f->f.startsWith("M"))
                .parallel()
                .forEach(n->System.out.println(n));

        /* forEachOrdered - the output would always be in this order:
         * Maggie, Michonne, Merle
         */
        System.out.println("Print using forEachOrdered");
        names.stream()
                .filter(f->f.startsWith("M"))
                .parallel()
                .forEachOrdered(n->System.out.println(n));
    }
}
