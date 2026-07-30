package com.design.patterns.behavioral.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Doctor implements Visitor {
    final static Logger log = LoggerFactory.getLogger(Doctor.class);
    private String nameOfDoctor;

    public Doctor(String nameOfDoctor) {
        super();
        this.nameOfDoctor = nameOfDoctor;
    }

    public String getName() {
        return nameOfDoctor;
    }


    public void visit(Visitable visitable) {
        Student student = (Student) visitable;
        student.setHealthStatus("Good");
        log.info("Doctor: {} does the checkup of the student: {} and Reported that student's  health is not {} ", 
            this.getName(), student.getName(), student.getHealthStatus()
            );

    }

}
