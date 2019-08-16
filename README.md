# Creational Design Patterns

### Singleton Pattern
    Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
### Factory Pattern
    Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class.
### Abstract Factory Pattern
    Abstract Factory pattern is similar to Factory pattern and its factory of factories
### Builder Pattern
    This pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes. Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object.
### Prototype Pattern
    Prototype pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing.

# Structural Design Patterns
### Adapter Pattern
    Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together. The object that joins these unrelated interface is called an Adapter. As a real life example, we can think of a mobile charger as an adapter because mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India). So the mobile charger works as an adapter between mobile charging socket and the wall socket.
### Composite Pattern
    Composite pattern is one of the Structural design pattern and is used when we have to represent a part-whole hierarchy. When we need to create a structure in a way that the objects in the structure has to be treated the same way, we can apply composite design pattern.
### Proxy Pattern
    Proxy pattern intent is to "Provide a surrogate or placeholder for another object to control access to it". The definition itself is very clear and proxy pattern is used when we want to provide controlled access of a functionality.
### Facade Pattern
    Facade Pattern is used to help client applications to easily interact with the system.
### Bridge Pattern
    When we have interface hierarchies in both interfaces as well as implementations, then bridge design pattern is used to decouple the interfaces from implementation and hiding the implementation details from the client programs.
### Decorator Pattern
    Decorator design pattern is used to modify the functionality of an object at runtime.

# Behavioral Design Patterns
### Template Method Pattern
    Template Method is a behavioral design pattern and it&#39;s used to create a method stub and deferring some of the steps of implementation to the subclasses. Template method defines the steps to execute an algorithm and it can provide default implementation that might be common for all or some of the subclasses.
### Mediator Pattern
    Mediator design pattern is used to provide a centralized communication medium between different objects in a system.
### Memento Pattern
    Memento design pattern is used when we want to save the state of an object so that we can restore later on.
### Iterator Pattern
    iterator pattern in one of the behavioral pattern and it&#39;s used to provide a standard way to traverse through a group of Objects. For example - channel Iterator
### Interpreter Pattern
    is used to defines a grammatical representation for a language and provides an interpreter to deal with this grammar. For example - Interpret user input and convert accordingly.
### Visitor Pattern
    Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects. With the help of visitor pattern, we can move the operational logic from the objects to another class. For example - Dr visiting group of students in school.
### State Pattern
    State design pattern is used when an Object change its behavior based on its internal state. For example - Courier package change package state from Orderd -> Delivered -> Recived.