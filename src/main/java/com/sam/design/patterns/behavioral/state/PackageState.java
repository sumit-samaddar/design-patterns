package com.sam.design.patterns.behavioral.state;

public interface PackageState {
    void next(Package pkg);

    void prev(Package pkg);

    void printStatus();
}
