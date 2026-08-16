/**
 * @author sumit
 */

package com.design.patterns.behavioral.iterator;

class EmployeeRepository implements EmployeeCollection<String> {

    private final String[] employees = {"Sumit", "Rahul", "Amit", "Rohit", "Saurabh"};

    @Override
    public Iterator<String> createIterator() {
        return new EmployeeIterator(employees);
    }
}