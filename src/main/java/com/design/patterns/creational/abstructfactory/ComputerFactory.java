package com.design.patterns.creational.abstructfactory;
/**
 * @author sumit
 *
 */
public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
