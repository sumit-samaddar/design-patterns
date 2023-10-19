package com.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sumit
 * Creational Design Pattern
 * Prototype pattern is used when the Object creation is a costly affair and requires a lot of
 * time ,resources, and you have a similar object already existing.
 */
public class Employee implements Cloneable {
    private final List<String> list;

    public Employee() {
        list = new ArrayList<String>();
    }

    public Employee(List<String> list) {
        this.list = list;
    }

    public void loadData() {
        //read all employees from database and put into the list
        list.addAll(Arrays.asList("Pankaj", "Raj", "David", "Lisa"));
    }

    public List<String> getList() {
        return list;
    }

    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>(this.getList());
        return new Employee(temp);
    }
}