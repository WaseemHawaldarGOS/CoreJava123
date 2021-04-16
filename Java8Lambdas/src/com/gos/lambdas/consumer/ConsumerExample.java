package com.gos.lambdas.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/*
https://www.javabrahman.com/java-8/java-8-java-util-function-consumer-tutorial-with-examples/
 */

/*
Consumer<T> is an in-built functional interface introduced in Java 8 in the java.util.function package.
Consumer can be used in all contexts where an object needs to be consumed,i.e. taken as input, and some operation is to
be performed on the object without returning any result. Common example of such an operation is printing where an object
is taken as input to the printing function and the value of the object is printed( we will expand upon the printing
example in more detail below when understanding how to use Consumer interface).


Refer package com.gos.java8interfacechanges to understand why there is default method in interface

java.util.function.Consumer source code
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
}

accept() method is the primary abstract method of the Consumer functional interface. Its function descriptor being T -> ().
I.e. accept() method takes as input the type T and returns no value. I will explain usage of accept() with detailed example in the next section.

andThen() is a default method in Consumer interface. Method andThen(), when applied on a Consumer interface, takes as input another
instance of Consumer
 interface and returns as a result a new consumer interface which represents aggregation of both of the operations defined in
 the two Consumer interfaces. I will explain the usage of andThen() with a detailed example in coming sections.
 */


public class ConsumerExample {
	
	
	public static void main(String args[]) {
		
		/*
		 * Primary accept method invocation
		 */
		Consumer<Integer> consumer = (i) -> System.out.print(" " + i);
		List<Integer> integerList = Arrays.asList(new Integer(1), new Integer(10), new Integer(200), new Integer(101),
				new Integer(-10), new Integer(0));
		System.out.println("Invoking from Primary accept method invocation ");
		printList(integerList, consumer);
		
		
		/*
		 * usage of andThenMethod
		 */
		Consumer<Integer> consumer2 = (i) -> System.out.print(" " + i);
		List<Integer> integerList2 = Arrays.asList(new Integer(1), new Integer(10), new Integer(200), new Integer(101),
				new Integer(-10), new Integer(0));
		Consumer<Integer> consumer3 = consumer2.andThen(i -> System.out.println(" and then " + i));
		System.out.println("\n\nInvoking from usage of andThenMethod ");
		printList(integerList2, consumer3);
		
	}

	public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer) {
		for (Integer integer : listOfIntegers) {
			consumer.accept(integer);
	}
	}
}