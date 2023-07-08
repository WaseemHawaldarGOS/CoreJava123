package com.gos.java8collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
https://beginnersbook.com/2017/10/java-8-stream-collectors-class-with-examples/
 */
public class AverageIntUsage {

    public static void main(String[] args) {
        List<Student> studentlist = Student.getStudents();
        System.out.println("input list : "+studentlist);
        //Getting the average Age = sum of all ages/ no. of students
        Double avgAge = studentlist.stream()
                .collect(Collectors.averagingInt(s->s.stuAge));
        System.out.println("Average Age of Students is: "+avgAge);
    }
}
