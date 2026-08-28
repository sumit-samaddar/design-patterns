/**
 * Iterator Pattern Demo
 *
 * Intent: Provide a standard way to traverse a collection sequentially without exposing
 * its underlying data structure (array, list, tree, etc.).
 *
 * How it works here:
 *   - Iterator<T> interface declares hasNext() and next() — the traversal contract.
 *   - EmployeeCollection wraps a String[] of employee names internally.
 *   - EmployeeIterator implements Iterator<String>, tracking the current index.
 *   - EmployeeRepository holds an EmployeeCollection and exposes createIterator()
 *     so callers get an Iterator without ever seeing the backing array.
 *   - The while loop is the standard traversal idiom — identical regardless of whether
 *     the collection is backed by an array, a linked list, or a database cursor.
 *
 * @author sumit
 */

package com.design.patterns.behavioral.iterator;

import java.util.logging.Logger;

public class IteratorDemo {
    private static final Logger log = Logger.getLogger(IteratorDemo.class.getName());

    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();

        // createIterator() hides the internal EmployeeCollection and its backing array
        Iterator<String> iterator = repository.createIterator();

        // Standard traversal — works the same regardless of the underlying data structure
        while (iterator.hasNext()) {
            log.info("Employee: " + iterator.next());
        }
    }
}
