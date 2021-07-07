package com.gos.java8collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
https://beginnersbook.com/2017/10/java-8-stream-collectors-class-with-examples/
 */
public class CollectingAsList {

    public static void main(String[] args) {
        List<Student> studentlist = new ArrayList<Student>();
        //Adding Students
        studentlist.add(new Student(11,22,"Jon"));
        studentlist.add(new Student(22, 18,"Steve"));
        studentlist.add(new Student(33,22, "Lucy"));
        studentlist.add(new Student(44,23, "Sansa"));
        studentlist.add(new Student(55,18, "Maggie"));
        //Fetching student names as List
        List<String> names = studentlist.stream()
                .map(n->n.stuName)
                .collect(Collectors.toList());
        System.out.println(names);
    }

}