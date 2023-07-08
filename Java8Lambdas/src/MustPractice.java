import com.gos.java8collectors.Student;

import java.util.*;
import java.util.stream.Collectors;

public class MustPractice {

    public static void main(String[] args) {

        /**
         * 1. Given a list of students object, print only list of names using java streams
         */
        List<Student> studentlist = Student.getStudents();

        //Write answer below this


        System.out.println("*********************************************************************************");


        /**
         * 2. Given a list of names, do grouping with key as name and value as count of names
         */
        List<String> humanNames =
                Arrays.asList("Jon", "Ajeet", "Steve",
                        "Ajeet", "Jon", "Ajeet");

        //Write answer below this


        System.out.println("*********************************************************************************");


        /**
         * 3. Given a list of names, print only those names which starts with M and using forEachOrdered
         */
        List<String> names = new ArrayList<String>();
        names.add("Maggie");
        names.add("Michonne");
        names.add("Rick");
        names.add("Merle");
        names.add("Governor");

        //Write answer below this


        System.out.println("*********************************************************************************");


        /**
         * 4. Given a map of animals, print only that entry whose key is 4 using forEach
         */
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Monkey");
        hmap.put(2, "Dog");
        hmap.put(3, "Cat");
        hmap.put(4, "Lion");
        hmap.put(5, "Tiger");
        hmap.put(6, "Bear");

        //Write answer below this


        System.out.println("*********************************************************************************");


        /**
         * 5.
         */
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Monkey");
        hmap.put(2, "Dog");
        hmap.put(3, "Cat");
        hmap.put(4, "Lion");
        hmap.put(5, "Tiger");
        hmap.put(6, "Bear");

        //Write answer below this


        System.out.println("*********************************************************************************");




    }

}
