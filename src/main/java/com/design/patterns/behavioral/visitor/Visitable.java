package com.design.patterns.behavioral.visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
