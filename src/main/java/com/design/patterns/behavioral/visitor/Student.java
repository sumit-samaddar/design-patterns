package com.design.patterns.behavioral.visitor;

public class Student implements Visitable {

    private String nameOfStudent;

    private String healthStatus;

    public Student(String nameOfStudent) {
        super();
        this.nameOfStudent = nameOfStudent;
    }

    public String getName() {
        return nameOfStudent;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }


    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}