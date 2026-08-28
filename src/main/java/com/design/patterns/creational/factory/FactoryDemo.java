/**
 * Factory Pattern Demo
 *
 * Intent: Define a static factory method that returns one of several subclasses based on input,
 * keeping the caller decoupled from concrete types.
 *
 * How it works here:
 *   - ComputerFactory.getComputer() inspects the "type" argument and instantiates either PC or Server.
 *   - The caller only ever sees the abstract Computer type — it never calls new PC() or new Server() directly.
 *   - Adding a new computer type (e.g., "Laptop") only requires a new subclass and one extra branch in the factory.
 *
 * @author sumit
 */

package com.design.patterns.creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryDemo {
    final static Logger log = LoggerFactory.getLogger(FactoryDemo.class);

    public static void main(String[] args) {
        // Factory decides at runtime that "pc" maps to a PC instance
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");

        // Factory decides at runtime that "server" maps to a Server instance
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

        log.info("Factory PC Config::" + pc);
        log.info("Factory Server Config::" + server);
    }

}
