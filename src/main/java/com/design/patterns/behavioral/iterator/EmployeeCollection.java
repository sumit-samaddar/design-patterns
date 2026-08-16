/**
 * @author sumit
 */

package com.design.patterns.behavioral.iterator;

interface EmployeeCollection<T> {
    Iterator<T> createIterator();
}