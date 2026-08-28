/**
 * Visitor Pattern Demo
 *
 * Intent: Separate an algorithm (operation) from the object structure it operates on,
 * so new operations can be added without modifying the element classes.
 *
 * How it works here:
 *   - Visitable interface declares accept(Visitor) — implemented by Doctor and Student.
 *   - Visitor interface declares visit(Doctor) and visit(Student) — the new operation.
 *   - School holds a mixed list of Visitable elements and drives the health check-up:
 *       each element calls accept(visitor), which in turn calls visitor.visit(this) —
 *       this double-dispatch ensures the correct visit() overload is called per element type.
 *   - To add a new operation (e.g., payroll audit), create a new Visitor implementation
 *     without touching Doctor, Student, or School.
 *
 * Real-world analogy: a doctor visits a school — students and staff each receive an
 * appropriate check-up without the school needing to know the medical details.
 *
 * @author sumit
 */

package com.design.patterns.behavioral.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        // School orchestrates the visit: each element accepts the visitor via double-dispatch
        School.doHealthCheckup();
    }
}
