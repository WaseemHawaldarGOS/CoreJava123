package com.gos.java8collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
https://beginnersbook.com/2017/10/java-8-stream-collectors-class-with-examples/
 */
public class CollectingAsSet {

    public static void main(String[] args) {
        List<Student> studentlist = Student.getStudents();
        System.out.println("input list is \n"+studentlist.toString());
        //Fetching student data as a Set
        Set<Student> students = studentlist.stream()
                .filter(n-> n.stuId>22)
                .collect(Collectors.toSet());
        System.out.println("output list : \n"+students.toString());
    }
}
