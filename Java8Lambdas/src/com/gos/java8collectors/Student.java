package com.gos.java8collectors;

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
        List<Student> studentlist = new ArrayList<>();
        studentlist.add(new Student(11,22,"Jon"));
        studentlist.add(new Student(22,18,"Steve"));
        studentlist.add(new Student(33,22,"Lucy"));
        studentlist.add(new Student(44,23,"Sansa"));
        studentlist.add(new Student(55,18,"Maggie"));
        return studentlist;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuAge=" + stuAge +
                ", stuName='" + stuName + '\'' +
                '}';
    }
}
