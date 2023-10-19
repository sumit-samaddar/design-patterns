package com.design.patterns.creational.factory;

import com.design.patterns.creational.prototype.PrototypePattern;

import java.util.logging.Logger;

/**
 * @author sumit
 * Creational Design Pattern
 * Factory design pattern is used when we have a super class with multiple sub-classes
 * and based on input, we need to return one of the sub-class.
 */
public class FactoryPattern {
    private static final Logger log = Logger.getLogger(FactoryPattern.class.getName());

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
        log.info("Factory PC Config::" + pc);
        log.info("Factory Server Config::" + server);
    }

}
