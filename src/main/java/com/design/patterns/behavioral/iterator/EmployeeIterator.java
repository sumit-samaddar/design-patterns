/**
 * @author sumit
 */

package com.design.patterns.behavioral.iterator;

class EmployeeIterator implements Iterator<String> {

    private final String[] employees;
    private int position = 0;

    public EmployeeIterator(String[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return position < employees.length;
    }

    @Override
    public String next() {
        return employees[position++];
    }
}