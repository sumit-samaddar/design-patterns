package com.design.patterns.creational.abstructfactory;

import java.util.logging.Logger;

/**
 * @author sumit
 * Creational Design Pattern
 * Factory design pattern is used when we have a super class with multiple sub-classes
 * and based on input, we need to return one of the sub-class.
 */
public class PCFactory implements ComputerAbstractFactory {
    private static final Logger log = Logger.getLogger(PCFactory.class.getName());
    private final String ram;
    private final String hdd;
    private final String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public Computer createComputer() {
        log.info("Get PC object based on User Input!");
        return new PC(ram, hdd, cpu);
    }

}
