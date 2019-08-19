package com.design.patterns.behavioral.visitor;

public class Doctor implements Visitor {

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
        System.out.println("Doctor: " + this.getName() + " does the checkup of the student: "
                + student.getName()
                + " and Reported health is not bad so updated the health status as 'Bad'\n");

    }

}
