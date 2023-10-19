package com.design.patterns.creational.prototype;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author sumit
 * Creational Design Pattern
 * Prototype pattern is used when the Object creation is a costly affair and requires a lot of
 * time ,resources, and you have a similar object already existing.
 */
public class PrototypePattern {
    private static final Logger log = Logger.getLogger(PrototypePattern.class.getName());

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.loadData();
        //Use the clone method to get the Employee object
        Employee employee1 = (Employee) employee.clone();
        Employee employee2 = (Employee) employee.clone();
        List<String> list = employee1.getList();
        list.add("John");
        List<String> list1 = employee2.getList();
        list1.remove("Pankaj");
        log.info("employee List: " + employee.getList());
        log.info("employee1 List: " + list);
        log.info("employee2 List: " + list1);
    }
}