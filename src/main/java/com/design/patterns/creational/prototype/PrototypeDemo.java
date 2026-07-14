package com.design.patterns.creational.prototype;

import org.apache.log4j.Logger;

public class PrototypeDemo {
    final static Logger log = Logger.getLogger(PrototypeDemo.class);
    public static void main(String[] args) {

        Employee original =
                new Employee("Sumit", "Engineering", 10000);

        Employee cloned = original.clone();
        cloned.setName("Satyaki");

        log.info("Original : " + original);
        log.info("Cloned   : " + cloned);
    }
}
