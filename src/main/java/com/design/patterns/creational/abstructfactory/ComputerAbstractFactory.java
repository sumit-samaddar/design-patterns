package com.design.patterns.creational.abstructfactory;

/**
 * @author sumit
 * Creational Design Pattern
 * Factory design pattern is used when we have a super class with multiple sub-classes
 * and based on input, we need to return one of the sub-class.
 */
public interface ComputerAbstractFactory {

    Computer createComputer();

}
