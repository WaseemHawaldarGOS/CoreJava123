import com.gos.java8collectors.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MustPractice {

    public static void main(String[] args) {

        /**
         * 1. Given a list of students object, print only list of names using java streams
         */
        List<Student> studentlist = Student.getStudents();

        //Write answer below this
        //System.out.println(studentlist.stream().map(s -> s.getStuName()).collect(Collectors.toList()).toString());

        System.out.println("*********************************************************************************");


        /**
         * 2. Given a list of names, do grouping with key as name and value as count of names
         */
        List<String> humanNames =
                Arrays.asList("Jon", "Ajeet", "Steve",
                        "Ajeet", "Jon", "Ajeet");

        //Write answer below this
        humanNames.stream().collect(
                Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )
        );


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
        //names.stream().filter(n -> n.startsWith("M")).forEachOrdered(System.out::println);


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
        //hmap.entrySet().stream().filter(a -> a.getKey() == 4).forEach(a -> System.out.println(a.getKey() +", "+a.getValue()));
        System.out.println("*********************************************************************************");


        /**
         * 5. Given below stringArray. perform below 2 steps
         * Step1 : sort the array using method reference
         * Step2: print the sorted array using streams and method reference
         */
        String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};

        //Write answer below this
        //Arrays.stream(stringArray).sorted(String::compareToIgnoreCase).forEach(System.out::println);


        System.out.println("*********************************************************************************");



        /**
         * 6. Given list and nested list below
         * Step1 : convert listOfLines contents into upper case using map and print using forEach
         * Step2: convert listOfListOfLines into a single list and print using forEach
         */
        List<String> listOfLines = Arrays.asList( "this is line 1", "this is line 2", "this is line 3");
        List<List<String>> listOfListOfLines = Arrays.asList( Arrays.asList("this is line 1"), Arrays.asList("this is line 2"), Arrays.asList("this is line 3"));

        //Write answer below this
        //System.out.println("Step1 output");
        //listOfLines.stream().map(a -> a.toUpperCase()).forEach(System.out::println);

        //System.out.println("Step2 output");
        //listOfListOfLines.stream().flatMap(Collection::stream).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("*********************************************************************************");

        /**
         * 7. Generate a sequence of numbers starting with 1.
         * Print only those divisible by 3.
         * Limit is 6 numbers.
         */
        //Write answer below this
        //Stream.iterate(1, count -> count + 1).filter(n -> n%3==0).limit(6).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("*********************************************************************************");




    }

}
