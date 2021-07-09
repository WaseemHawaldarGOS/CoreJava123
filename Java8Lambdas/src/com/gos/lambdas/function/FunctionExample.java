package com.gos.lambdas.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


/*
https://www.javabrahman.com/java-8
 */

/*
https://www.javabrahman.com/java-8/java-8-java-util-function-function-tutorial-with-examples/
 */

/**
 * what compose do?
 *
 *  In simple terms the order of functions is interchanged as compared to andThen, eg. function1.compose(function2)
 *  first function2 will be called an then function1.
 */

public class FunctionExample {
	public static void main(String args[]) {
		
		
		/**
		 * Invocation of primary apply method
		 */
		/*Function<Employee, String> funcEmpToString = (Employee e) ->  e.getName();
		
		List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45), new Employee("Harry Major", 25),
				new Employee("Ethan Hardy", 65), new Employee("Nancy Smith", 15),
				new Employee("Deborah Sprightly", 29));
		List<String> empNameList = convertEmpListToNamesList(employeeList, funcEmpToString);
		empNameList.forEach(System.out::println);*/
		
		
		
		/**
		 * Invocation of andThen method
		 */
		/*Function<Employee, String> funcEmpToString = (Employee e) -> {
			return e.getName();
		};
		
		Function<String, String> funcEmpToString2 = (String e) -> {
			return e.toString() + " returned by funcEmpToString2";
		};
		
		List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45), new Employee("Harry Major", 25),
				new Employee("Ethan Hardy", 65), new Employee("Nancy Smith", 15),
				new Employee("Deborah Sprightly", 29));
		List<String> empNameList = convertEmpListToNamesList(employeeList, funcEmpToString.andThen(funcEmpToString2));
		empNameList.forEach(System.out::println);*/
		
		
		/**
		 * Invocation of compose method
		 */
		Function<Employee, String> funcEmpToString = (Employee e) -> {
			return e.getName();
		};
		
		Function<Employee, Employee> funcEmpToString2 = (Employee e) -> {
			String firstName = e.getName().substring(0, e.getName().indexOf(" "));
			e.setName(firstName);
			return e;
		};
		
		List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45), new Employee("Harry Major", 25),
				new Employee("Ethan Hardy", 65), new Employee("Nancy Smith", 15),
				new Employee("Deborah Sprightly", 29));
		List<String> empNameList = convertEmpListToNamesList(employeeList, funcEmpToString.compose(funcEmpToString2));
		empNameList.forEach(System.out::println);
		
		/**
		 * Invocation of identity method. Not much clarity on this.
		 */
		

		   // Function<Employee, String> funcEmpToString= (Employee e)-> {return e.getName();};
/*		    List<Employee> employeeList=
		     Arrays.asList(new Employee("Tom Jones", 45), 
		      new Employee("Harry Major", 25),
		      new Employee("Ethan Hardy", 65),
		      new Employee("Nancy Smith", 15),
		      new Employee("Deborah Sprightly", 29),
		      new Employee("Deborah Sprightly", 29));
		    List<Employee> empNameListInitials=applyIdentityToEmpList(employeeList, Function.identity());
		    empNameListInitials.forEach(System.out::println);*/
		 }
	
	
	
	  public static List<Employee> applyIdentityToEmpList(List<Employee> employeeList, Function<Employee, Employee> funcEmpToEmp){
	   List<Employee> empNameList=new ArrayList<Employee>(); 
	   for(Employee emp:employeeList){
	     empNameList.add(funcEmpToEmp.apply(emp));
	   }
	   return empNameList;		
	}
	

	public static List<String> convertEmpListToNamesList(List<Employee> employeeList,
			Function<Employee, String> funcEmpToString) {
		List<String> empNameList = new ArrayList<String>();
		for (Employee emp : employeeList) {
			empNameList.add(funcEmpToString.apply(emp));
		}
		return empNameList;
	}
}