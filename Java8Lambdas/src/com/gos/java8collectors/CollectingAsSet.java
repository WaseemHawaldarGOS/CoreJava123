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
        List<Student> studentlist = new ArrayList<Student>();
        //Adding Students
        studentlist.add(new Student(11, 22,"Jon"));
        studentlist.add(new Student(22,18,"Steve"));
        studentlist.add(new Student(33,22,"Lucy"));
        studentlist.add(new Student(44,23,"Sansa"));
        studentlist.add(new Student(55,18,"Maggie"));
        //Fetching student data as a Set
        Set<Student> students = studentlist.stream()
                .filter(n-> n.stuId>22)
                .collect(Collectors.toSet());
        //Iterating Set
        for(Student stu : students) {
            System.out.println(stu.stuId+" "+stu.stuName+" "+stu.stuAge);
        }
    }
}
