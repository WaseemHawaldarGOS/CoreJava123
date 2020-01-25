package com.gos.com.gos.java8collectors;

import java.util.ArrayList;
import java.util.List;

/*
https://beginnersbook.com/2017/10/java-8-stream-collectors-class-with-examples/
 */
public class Student {

    int stuId;
    int stuAge;
    String stuName;

    public Student(int stuId, int stuAge, String stuName) {
        this.stuId = stuId;
        this.stuAge = stuAge;
        this.stuName = stuName;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }



    public static List<Student> getStudents(){
        List<Student> list = new ArrayList<>();
        list.add(new Student(11, 28, "Lucy"));
        list.add(new Student(28, 27, "Kiku"));
        list.add(new Student(32, 30, "Dani"));
        list.add(new Student(49, 27, "Steve"));
        return list;
    }
}
