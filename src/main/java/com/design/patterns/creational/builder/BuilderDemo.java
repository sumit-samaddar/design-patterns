/**
 * Builder Pattern Demo
 *
 * Intent: Construct a complex object step-by-step, separating required parameters from optional ones
 * and preventing partially-initialised or inconsistent objects.
 *
 * How it works here:
 *   - Computer has a private constructor — it can only be created via its inner ComputerBuilder.
 *   - ComputerBuilder takes the two required fields (HDD, RAM) in its constructor.
 *   - Optional fields (Bluetooth, GraphicsCard) are set through fluent setter methods that return 'this',
 *     allowing method chaining.
 *   - build() performs the final assembly and returns an immutable Computer instance.
 *
 * Without Builder, adding optional fields would force telescoping constructors like
 * new Computer("500 GB", "2 GB", true, false) — unreadable and error-prone.
 *
 * @author sumit
 */

package com.design.patterns.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderDemo {
    final static Logger log = LoggerFactory.getLogger(BuilderDemo.class);

    public static void main(String[] args) {
        // Required fields passed to ComputerBuilder constructor; optional features chained fluently
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)      // optional — omitting this leaves it null
                .setGraphicsCardEnabled(true)   // optional — omitting this leaves it null
                .build();                       // creates the immutable Computer object

        log.info(String.valueOf(comp));
    }

}
