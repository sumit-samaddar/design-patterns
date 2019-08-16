package com.sam.design.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class School {

    static List<Student> studentList;

    static {
        studentList = new ArrayList() {{
            add(new Student("Kishan"));
            add(new Student("Karan"));
            add(new Student("Vishal"));
            add(new Student("Kapil"));
        }};
    }

    public static void doHealthCheckup() {
        Visitor visitor = new Doctor("Dr.Sumit");
        for (Student student : studentList) {
            student.accept(visitor);
        }
    }
}
