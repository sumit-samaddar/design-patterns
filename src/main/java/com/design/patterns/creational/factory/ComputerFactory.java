package com.design.patterns.creational.factory;

import java.util.logging.Logger;

/**
 * @author sumit
 * Creational Design Pattern
 * Factory design pattern is used when we have a super class with multiple sub-classes
 * and based on input, we need to return one of the sub-class.
 */
public class ComputerFactory {
    private static final Logger log = Logger.getLogger(ComputerFactory.class.getName());

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            log.info("Get PC object based on User Input!");
            return new PC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            log.info("Get SERVER object based on User Input!");
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
}
