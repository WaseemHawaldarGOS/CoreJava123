/**
 * 
 */
package com.gos.structural.decoratorpattern;

/**
 * @author WHWL
 *
 */
public abstract class Beverage {
	
	protected String description = "Some unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract int Cost();

}
