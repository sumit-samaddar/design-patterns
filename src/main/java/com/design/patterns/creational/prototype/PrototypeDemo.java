/**
 * Prototype Pattern Demo
 *
 * Intent: Create new objects by cloning an existing instance rather than constructing from scratch,
 * which is useful when object creation is costly (e.g., DB lookup, heavy initialisation).
 *
 * How it works here:
 *   - Employee implements the Prototype interface and overrides clone() to return a field-by-field copy.
 *   - The original and cloned objects are independent — mutating the clone does not affect the original.
 *   - Only 'name' is mutable via setName(); 'department' and 'salary' are final (shared values, copied on clone).
 *
 * Use case: imagine Employee is populated from a slow DB query. Cloning reuses that data
 * for a new employee in the same department without repeating the query.
 *
 * @author sumit
 */

package com.design.patterns.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrototypeDemo {
    final static Logger log = LoggerFactory.getLogger(PrototypeDemo.class);

    public static void main(String[] args) {
        // Original employee — imagine this was expensive to create (e.g., loaded from a database)
        Employee original = new Employee("Sumit", "Engineering", 10000);

        // Clone copies all fields; changing the clone's name does not touch the original
        Employee cloned = original.clone();
        cloned.setName("Satyaki");

        // Both employees share the same department and salary, but have different names
        log.info("Original : {}", original);
        log.info("Cloned   : {}", cloned);
    }
}
