package com.design.patterns.behavioral.state;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Package {
    private PackageState state = new OrderedState();

    public PackageState getState() {

        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
