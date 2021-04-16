package com.gos.java8stream;

import java.util.List;
import java.util.function.Predicate;


/*
https://beginnersbook.com/2017/11/java-8-stream-anymatch-example/
 */
public class AnyMatchExample {

    public static void main(String[] args) {
        Predicate<Student> p1 = s -> s.stuName.startsWith("S");
        Predicate<Student> p2 = s -> s.stuAge < 28 && s.stuName.startsWith("Z");
        List<Student> list = Student.getStudents();

        /* anyMatch() method checks whether any Stream element matches
         * the specified predicate
         */
        boolean b3 = list.stream().anyMatch(p1);
        System.out.println(b3);
        boolean b4 = list.stream().anyMatch(p2);
        System.out.println(b4);
    }
}
