//SupplierFunctionExample.java
package com.gos.lambdas.supplier;

import java.util.Date;
import java.util.function.Supplier;

/*
https://www.javabrahman.com/java-8/java-8-java-util-function-supplier-tutorial-with-examples/
 */

/*
Supplier<T> is an in-built functional interface introduced in Java 8 in the java.util.function package.
Supplier can be used in all contexts where there is no input but an output is expected.


java.util.function.Supplier source code
@FunctionalInterface
public interface Supplier<T> {
    /**
     * Gets a result.
     * @return a result
     */
    /*T get();
			}


 */
public class SupplierExample {

	public static void main(String args[]) {
		// Supplier instance with lambda expression
		Supplier<String> helloStrSupplier = () -> new String("Hello");
		String helloStr = helloStrSupplier.get();
		System.out.println("String in helloStr is->" + helloStr + "<-");

		// Supplier instance using method reference to default constructor
		Supplier<String> emptyStrSupplier = String::new;
		String emptyStr = emptyStrSupplier.get();
		System.out.println("String in emptyStr is->" + emptyStr + "<-");

		// Supplier instance using method reference to a static method
		Supplier<Date> dateSupplier = SupplierExample::getSystemDate;
		Date systemDate = dateSupplier.get();
		System.out.println("systemDate->" + systemDate);
	}

	public static Date getSystemDate() {
		return new Date();
	}
}