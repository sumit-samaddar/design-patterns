/**
 * Mediator Pattern Demo
 *
 * Intent: Reduce direct dependencies between communicating objects by routing all
 * interactions through a central mediator, keeping objects loosely coupled.
 *
 * How it works here:
 *   - ChatMediator interface defines addUser() and sendMessage().
 *   - ChatMediatorImpl holds a list of all users and broadcasts each message to every
 *     user except the sender — users never hold references to each other.
 *   - UserImpl receives the mediator at construction and calls mediator.sendMessage()
 *     when sending; it never calls other users' receive() methods directly.
 *   - Adding or removing a user only affects the mediator's list — zero changes to UserImpl.
 *
 * Without Mediator: each user would need a reference to every other user (O(n²) coupling).
 * With Mediator: each user only references the mediator (O(n) coupling).
 *
 * @author sumit
 */

package com.design.patterns.behavioral.mediator;

public class MediatorDemo {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        // Each user receives the mediator — they will communicate only through it
        User user1 = new UserImpl(mediator, "Pankaj");
        User user2 = new UserImpl(mediator, "Lisa");
        User user3 = new UserImpl(mediator, "Saurabh");
        User user4 = new UserImpl(mediator, "David");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        // user1 sends a message; mediator delivers it to user2, user3, user4 — not back to user1
        user1.send("Hi All");
    }

}
