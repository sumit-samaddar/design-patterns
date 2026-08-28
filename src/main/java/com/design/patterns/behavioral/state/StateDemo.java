/**
 * State Pattern Demo
 *
 * Intent: Allow an object to change its behaviour when its internal state changes,
 * eliminating large if-else or switch chains that check state flags.
 *
 * How it works here:
 *   - PackageState interface defines next(), prev(), and printStatus().
 *   - Concrete states: OrderedState → DeliveredState → ReceivedState.
 *   - Package delegates nextState()/previousState() to its current PackageState object.
 *   - Each state is responsible for transitioning to the next/previous state by calling
 *     pkg.setState(...) — the Package itself has no transition logic.
 *   - Calling nextState() beyond ReceivedState (the terminal state) prints a message
 *     and stays in ReceivedState — no crash, no invalid transition.
 *
 * Adding a new state (e.g., "InTransitState") requires only a new class — no changes to Package.
 *
 * @author sumit
 */

package com.design.patterns.behavioral.state;

public class StateDemo {

    public static void main(String[] args) {
        Package pkg = new Package(); // starts in OrderedState by default

        pkg.printStatus(); // OrderedState

        pkg.nextState();   // transitions to DeliveredState
        pkg.printStatus();

        pkg.nextState();   // transitions to ReceivedState
        pkg.printStatus();

        pkg.nextState();   // terminal state — stays in ReceivedState, prints boundary message
        pkg.printStatus();
    }
}
