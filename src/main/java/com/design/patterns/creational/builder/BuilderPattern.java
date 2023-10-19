package com.design.patterns.creational.builder;


import java.util.logging.Logger;

/**
 * @author sumit
 * Creational Design Pattern
 * This pattern was introduced to solve some of the problems with Factory and Abstract Factory
 * design patterns when the Object contains a lot of attributes.
 * Builder pattern solves the issue with large number of optional parameters and inconsistent
 * state by providing a way to build the object step-by-step and provide a method that will
 * actually return the final Object.
 */
public class BuilderPattern {
    private static final Logger log = Logger.getLogger(BuilderPattern.class.getName());

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
        log.info(computer.toString());
    }
}
