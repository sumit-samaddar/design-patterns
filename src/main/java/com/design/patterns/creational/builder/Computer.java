package com.design.patterns.creational.builder;

/**
 * @author sumit
 * Creational Design Pattern
 * This pattern was introduced to solve some of the problems with Factory and Abstract Factory
 * design patterns when the Object contains a lot of attributes.
 * Builder pattern solves the issue with large number of optional parameters and inconsistent
 * state by providing a way to build the object step-by-step and provide a method that will
 * actually return the final Object.
 */
public class Computer {
    private final String HDD;
    private final String RAM;
    private final Boolean graphicsCardEnabled;
    private final Boolean bluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.graphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.bluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public Boolean isGraphicsCardEnabled() {
        return graphicsCardEnabled;
    }

    public Boolean isBluetoothEnabled() {
        return bluetoothEnabled;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((HDD == null) ? 0 : HDD.hashCode());
        result = prime * result + ((RAM == null) ? 0 : RAM.hashCode());
        result = prime * result + ((bluetoothEnabled == null) ? 0 : bluetoothEnabled.hashCode());
        result = prime * result + ((graphicsCardEnabled == null) ? 0 : graphicsCardEnabled.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Computer other = (Computer) obj;
        if (HDD == null) {
            if (other.HDD != null) return false;
        } else if (!HDD.equals(other.HDD)) return false;
        if (RAM == null) {
            if (other.RAM != null) return false;
        } else if (!RAM.equals(other.RAM)) return false;
        if (bluetoothEnabled == null) {
            if (other.bluetoothEnabled != null) return false;
        } else if (!bluetoothEnabled.equals(other.bluetoothEnabled)) return false;
        if (graphicsCardEnabled == null) {
            return other.graphicsCardEnabled == null;
        } else return graphicsCardEnabled.equals(other.graphicsCardEnabled);
    }

    @Override
    public String toString() {
        return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + graphicsCardEnabled + ", isBluetoothEnabled=" + bluetoothEnabled + "]";
    }

    public static class ComputerBuilder {
        private final String HDD;
        private final String RAM;
        private Boolean isGraphicsCardEnabled;
        private Boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(Boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(Boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}