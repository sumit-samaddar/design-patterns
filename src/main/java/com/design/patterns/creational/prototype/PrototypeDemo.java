/**
 * @author sumit
 * Creates new objects by copying an existing prototype instance.
 */

package com.design.patterns.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrototypeDemo {
    final static Logger log = LoggerFactory.getLogger(PrototypeDemo.class);

    public static void main(String[] args) {

        Employee original = new Employee("Sumit", "Engineering", 10000);

        Employee cloned = original.clone();
        cloned.setName("Satyaki");

        log.info("Original : {}", original);
        log.info("Cloned   : {}", cloned);
    }
}
