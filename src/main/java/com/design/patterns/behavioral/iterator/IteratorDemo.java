/**
 * @author sumit
 * Traverses a collection without exposing its internal representation.
 */

package com.design.patterns.behavioral.iterator;

import java.util.logging.Logger;

public class IteratorDemo {
    private static final Logger log = Logger.getLogger(IteratorDemo.class.getName());

    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        Iterator<String> iterator = repository.createIterator();

        while (iterator.hasNext()) {
            log.info("Employee: " + iterator.next());
        }
    }
}
