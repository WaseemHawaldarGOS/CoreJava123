package com.gos.lambdas.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


/*
https://www.javabrahman.com/java-8/java-8-java-util-function-predicate-tutorial-with-examples/
 */

/*
Predicate is a new functional interface defined in java.util.function package which can be used in all the
contexts where an object needs to be evaluated for a given test condition and a boolean value needs
to be returned based on whether the condition was successfully met or not.

java.util.function.Predicate source code

package java.util.function;
import java.util.Objects;
@FunctionalInterface
public interface Predicate<T> {
 boolean test(T t);
//rest of the code goes here
}



Default Method Name	Explanation
and()	It does logical AND of the predicate on which it is called with another predicate.
Example: predicate1.and(predicate2)
or()	It does logical OR of the predicate on which it is called with another predicate.
Example: predicate1.or(predicate2)
negate()	It does boolean negation of the predicate on which it is invoked.
Example: predicate1.negate()

 */
public class PredicateExample {
	
	
	public static void main(String args[]) {
		Predicate<Integer> positive = ((i) -> i > 0);
		Predicate<Integer> negative = ((i) -> i < 0);

		Predicate<Integer> predicateAndOperation = positive.and(negative);
		Predicate<Integer> predicateOrOperation = positive.or(negative);
		Predicate<Integer> predicateNotOperation = positive.negate();

		List<Integer> integerList = Arrays.asList(-20, -10, 0, 10, 20);

		/*
		Calling with positive predicate
		 */
		List<Integer> positivePredicatefilteredList = filterList(integerList, positive);
		System.out.println("Result with positive predicate");
		positivePredicatefilteredList.forEach(System.out::println);
		System.out.println("********************************************************************\n");


		/*
		Calling with negative predicate
		 */
		List<Integer> negativePredicatefilteredList = filterList(integerList, negative);
		System.out.println("Result with negative predicate");
		negativePredicatefilteredList.forEach(System.out::println);
		System.out.println("********************************************************************\n");


		/*
		Calling with predicateAndOperation
		 */
		List<Integer> predicateAndOperationfilteredList = filterList(integerList, predicateAndOperation);
		System.out.println("Result with predicateAndOperation");
		predicateAndOperationfilteredList.forEach(System.out::println);
		System.out.println("********************************************************************\n");

     	/*
		Calling with predicateOrOperation
		 */
		List<Integer> predicateOrOperationfilteredList = filterList(integerList, predicateOrOperation);
		System.out.println("Result with predicateOrOperation");
		predicateOrOperationfilteredList.forEach(System.out::println);
		System.out.println("********************************************************************\n");


		/*
		Calling with predicateNotOperation
		 */
		List<Integer> predicateNotOperationfilteredList = filterList(integerList, predicateNotOperation);
		System.out.println("Result with predicateNotOperation");
		predicateNotOperationfilteredList.forEach(System.out::println);
		System.out.println("********************************************************************\n");
	}

	public static List<Integer> filterList(List<Integer> listOfIntegers, Predicate<Integer> predicate) {
		List<Integer> filteredList = new ArrayList<Integer>();
		for (Integer integer : listOfIntegers) {
			if (predicate.test(integer)) {
				filteredList.add(integer);
			}
		}
		return filteredList;
	}


}