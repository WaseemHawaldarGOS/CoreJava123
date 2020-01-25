package com.gos.java8stream;

import java.util.List;
import java.util.function.Predicate;

/*
https://beginnersbook.com/2017/11/java-8-stream-nonematch-example/
 */
public class noneMatchExample {

    public static void main(String[] args) {
        Predicate<Student> p1 = s -> s.stuName.startsWith("L");
        Predicate<Student> p2 = s -> s.stuAge < 28 && s.stuName.startsWith("P");
        List<Student> list = Student.getStudents();

        /* noneMatch() method returns true if none of the stream elements matches
         * the given predicate
         */
        /* This will return false because there is a element in the stream that
         * matches the condition specified in the predicate p1.
         * Condition: Student Name should start with letter "L"
         * Stream element matched: Lucy
         */
        boolean b1 = list.stream().noneMatch(p1);
        System.out.println("list.stream().noneMatch(p1): "+b1);

        /* This will return true because none of the elements
         * matches the condition specified in the predicate p2.
         * Condition: Student Name should start with letter "P" and age must be <28
         * Stream element matched: none
         */
        boolean b2 = list.stream().noneMatch(p2);
        System.out.println("list.stream().noneMatch(p2): "+b2);
    }
}
