package com.design.patterns.creational.abstructfactory;

import com.design.patterns.creational.factory.FactoryPattern;

import java.util.logging.Logger;

/**
 * @author sumit
 * Creational Design Pattern
 * Factory design pattern is used when we have a super class with multiple sub-classes
 * and based on input, we need to return one of the sub-class.
 */
public class AbstractFactoryPattern {
    private static final Logger log = Logger.getLogger(AbstractFactoryPattern.class.getName());

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
        log.info("AbstractFactory PC Config::" + pc);
        log.info("AbstractFactory Server Config::" + server);
    }
}
