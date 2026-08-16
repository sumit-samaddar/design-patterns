/**
 * @author sumit
 */

package com.design.patterns.creational.prototype;

import java.util.Objects;

public class Employee implements Prototype {

    private final String department;
    private final double salary;
    private String name;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public Employee clone() {
        return new Employee(this.name, this.department, this.salary);
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", department='" + department + '\'' + ", salary=" + salary + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(department, employee.department) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, salary, name);
    }
}
