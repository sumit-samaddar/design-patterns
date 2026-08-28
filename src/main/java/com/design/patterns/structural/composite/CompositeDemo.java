/**
 * Composite Pattern Demo
 *
 * Intent: Compose objects into tree structures to represent part-whole hierarchies, and let clients
 * treat individual objects (leaves) and compositions (containers) through the same interface.
 *
 * How it works here:
 *   - Shape is the common interface with draw(String fillColor).
 *   - Triangle and Circle are leaf nodes — they draw themselves.
 *   - Drawing is the composite — it holds a List<Shape> and calls draw() on each child,
 *     so the client calls drawing.draw() exactly the same way it would call circle.draw().
 *   - clear() resets the drawing so it can be reused with a different set of shapes.
 *
 * The client never needs to check whether it holds a leaf or a container — it just calls draw().
 *
 * @author sumit
 */

package com.design.patterns.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompositeDemo {
    final static Logger log = LoggerFactory.getLogger(CompositeDemo.class);

    public static void main(String[] args) {
        Shape tri  = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir  = new Circle();

        // First drawing: two triangles + one circle, all filled with Red
        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);
        drawing.draw("Red");   // iterates children; each leaf draws itself

        drawing.clear();       // remove all shapes so the drawing can be reused

        // Second drawing: one triangle + one circle, now filled with Green
        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
        drawing.clear();
    }

}
