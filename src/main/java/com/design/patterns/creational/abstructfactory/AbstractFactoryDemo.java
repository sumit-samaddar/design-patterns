/**
 * Abstract Factory Pattern Demo
 *
 * Intent: Produce families of related objects (Button + Checkbox) without coupling the client
 * to any concrete platform class. Switching the factory switches the entire UI family atomically.
 *
 * How it works here:
 *   - UIFactory is the abstract factory interface with createButton() and createCheckbox().
 *   - WindowsFactory and MacFactory are concrete factories — each returns platform-matched components.
 *   - Application only depends on UIFactory; it never references WindowsButton or MacCheckbox directly.
 *   - Swapping new WindowsFactory() for new MacFactory() changes every component in one place.
 *
 * Difference from Factory Method: Abstract Factory groups multiple related factories under one interface,
 * ensuring all created products are compatible with each other.
 *
 * @author sumit
 */

package com.design.patterns.creational.abstructfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractFactoryDemo {
    final static Logger log = LoggerFactory.getLogger(AbstractFactoryDemo.class);

    public static void main(String[] args) {
        // WindowsFactory produces Windows-styled Button and Checkbox together
        Application app = new Application(new WindowsFactory());
        app.render();

        // Swapping to MacFactory; Application code stays identical — only the factory changes
        app = new Application(new MacFactory());
        app.render();
    }
}
