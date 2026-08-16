/**
 * @author sumit
 */

package com.design.patterns.structural.adapter;

public class Volt {

    private final int volts;

    public Volt(int v) {
        this.volts = v;
    }

    public int getVolts() {
        return volts;
    }
}