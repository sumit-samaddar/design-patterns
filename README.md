# Design Patterns in Java

A reference implementation of 18 Gang of Four (GoF) design patterns organised into three categories. Each pattern lives in its own package under `com.design.patterns.{creational|structural|behavioral}` and has a runnable `*Demo.java` main class.

---

## Creational Patterns

These patterns deal with object creation mechanisms.

---

### Singleton
> Ensures only one instance of a class exists across the JVM.

Four variations are implemented side-by-side:

| Class | Strategy |
|---|---|
| `LazyInitializedSingleton` | Instance created on first call (not thread-safe) |
| `EagerInitializedSingleton` | Instance created at class-load time |
| `StaticBlockSingleton` | Like eager, but inside a `static {}` block to allow exception handling |
| `ThreadSafeSingleton` | Uses `synchronized` to guard lazy creation |

**Usage:**
```java
LazyInitializedSingleton instance = LazyInitializedSingleton.getInstance();
// getInstance() always returns the same object — constructor is private
```

**When to use:** shared resources like config managers, connection pools, logging services.

---

### Factory
> Returns one of several subclasses based on input — the caller never calls `new` directly.

- `Computer` (abstract superclass) → `PC` and `Server` are concrete subclasses
- `ComputerFactory.getComputer(type, ram, hdd, cpu)` decides which to instantiate

**Usage:**
```java
Computer pc     = ComputerFactory.getComputer("PC",     "16 GB", "1 TB", "Intel i7");
Computer server = ComputerFactory.getComputer("Server", "64 GB", "4 TB", "Intel Xeon");
```

**When to use:** when object creation logic should be centralised and the exact type determined at runtime.

---

### Abstract Factory
> A "factory of factories" — produces families of related objects without specifying concrete classes.

- `UIFactory` interface defines `createButton()` and `createCheckbox()`
- `MacFactory` and `WindowsFactory` implement it, each returning platform-specific components
- `Application` accepts a `UIFactory` and delegates all creation to it

**Usage:**
```java
UIFactory factory = new MacFactory();           // or new WindowsFactory()
Application app   = new Application(factory);
app.createUI();   // always creates a consistent Mac (or Windows) UI family
```

**When to use:** when a system must be independent of how its products are created and you need to enforce consistency within a product family (e.g., all Mac widgets together, never mixed).

---

### Builder
> Constructs a complex object step-by-step, separating required from optional parameters.

- `Computer` has two required fields (`HDD`, `RAM`) and two optional ones (`isGraphicsCardEnabled`, `isBluetoothEnabled`)
- `Computer.ComputerBuilder` is the inner static builder with a fluent API
- The `Computer` constructor is private — only `ComputerBuilder.build()` can create it

**Usage:**
```java
Computer computer = new Computer.ComputerBuilder("500 GB", "16 GB")
    .setGraphicsCardEnabled(true)
    .setBluetoothEnabled(false)
    .build();
```

**When to use:** when a constructor would otherwise need many parameters, some of which are optional, leading to telescoping constructors or inconsistent state.

---

### Prototype
> Creates new objects by cloning an existing one instead of constructing from scratch.

- `Prototype` interface declares `clone()`
- `Employee` implements it — `clone()` returns a new `Employee` with the same field values

**Usage:**
```java
Employee original = new Employee("Alice", "Engineering", 90000);
Employee copy     = original.clone();
copy.setName("Bob");   // original is unaffected
```

**When to use:** when object creation is expensive (e.g., DB read, heavy computation) and a pre-populated instance can be cheaply duplicated.

---

## Structural Patterns

These patterns deal with how classes and objects are composed.

---

### Adapter
> Lets two incompatible interfaces work together by wrapping one inside the other.

Real-world analogy: a mobile charger adapts a 120 V wall socket to the 3 V a phone needs.

- `Socket` supplies 120 V (`getVolt()`)
- `SocketAdapter` interface declares `get120Volt()`, `get12Volt()`, `get3Volt()`
- `SocketAdapterImpl` extends `Socket` and implements `SocketAdapter`, performing division to convert

**Usage:**
```java
SocketAdapter adapter = new SocketAdapterImpl();
Volt v3  = adapter.get3Volt();    // 120 / 40 = 3 V
Volt v12 = adapter.get12Volt();   // 120 / 10 = 12 V
```

**When to use:** integrating a legacy or third-party class whose interface you cannot change.

---

### Bridge
> Decouples an abstraction from its implementation so the two can vary independently.

- `Shape` (abstraction) holds a reference to `Colour` (implementor) via composition
- `Triangle` and `Pentagon` extend `Shape`; `RedColour` and `GreenColour` implement `Colour`
- Any shape can be combined with any colour without a combinatorial explosion of subclasses

**Usage:**
```java
Shape redTriangle = new Triangle(new RedColour());
redTriangle.applyColor();   // "Triangle filled with Red"

Shape greenPentagon = new Pentagon(new GreenColour());
greenPentagon.applyColor(); // "Pentagon filled with Green"
```

**When to use:** when you want to avoid a permanent binding between abstraction and implementation, or when both should be extensible via subclassing independently.

---

### Composite
> Treats individual objects and compositions of objects uniformly through a shared interface.

- `Shape` interface defines `draw(String fillColor)`
- `Circle` and `Triangle` are leaf nodes
- `Drawing` is the composite — it contains a `List<Shape>` and delegates `draw()` to each

**Usage:**
```java
Drawing drawing = new Drawing();
drawing.add(new Circle());
drawing.add(new Triangle());
drawing.draw("Red");   // draws all contained shapes in Red
drawing.clear();
```

**When to use:** tree structures like UI component hierarchies, file systems, or org charts where leaf and container must be handled the same way.

---

### Decorator
> Adds behaviour to an object at runtime by wrapping it, without changing its class.

- `Car` interface → `BasicCar` is the base implementation
- `CarDecorator` wraps a `Car` and delegates `assemble()` to it
- `SportsCar` and `LuxuryCar` extend `CarDecorator`, calling `super.assemble()` then adding their own output

**Usage:**
```java
Car basic        = new BasicCar();
Car sports       = new SportsCar(basic);          // Basic + Sports features
Car luxury       = new LuxuryCar(basic);          // Basic + Luxury features
Car sportsLuxury = new SportsCar(new LuxuryCar(new BasicCar())); // all three
sportsLuxury.assemble();
```

**When to use:** when you need to add responsibilities to objects dynamically and independently, and subclassing would produce an unwieldy number of combinations.

---

### Facade
> Provides a single simplified interface to a complex subsystem.

- The subsystem involves `Report`, `ReportHeader`, `ReportFooter`, `ReportData`, and `ReportWriter`
- `ReportGeneratorFacade.generateReport(ReportType)` hides all assembly and writing details

**Usage:**
```java
ReportGeneratorFacade facade = new ReportGeneratorFacade();
facade.generateReport(ReportType.HTML);
facade.generateReport(ReportType.PDF);
```

**When to use:** when you want to provide a simple entry point to a layered or complex subsystem, reducing coupling between clients and internals.

---

### Proxy
> Controls access to an object — here used for lazy initialisation (virtual proxy).

- `Image` interface declares `display()`
- `RealImage` loads the image file in its constructor (expensive)
- `ImageProxy` defers creating `RealImage` until `display()` is first called

**Usage:**
```java
Image image = new ImageProxy("photo.jpg");
// RealImage not loaded yet
image.display();   // loads "photo.jpg" from disk, then displays it
image.display();   // uses already-loaded RealImage — no reload
```

**When to use:** lazy loading of expensive resources, access control, logging/auditing access to an object, or remote object representation.

---

## Behavioral Patterns

These patterns deal with communication and responsibility between objects.

---

### State
> Allows an object to alter its behaviour when its internal state changes — the object appears to change its class.

- `PackageState` interface defines `next(Package)`, `prev(Package)`, `printStatus()`
- Concrete states: `OrderedState` → `DeliveredState` → `ReceivedState`
- `Package` holds the current state and delegates `nextState()` / `previousState()` to it; each state sets the next

**Usage:**
```java
Package pkg = new Package();       // starts in OrderedState
pkg.printStatus();                 // "Package ordered"
pkg.nextState();
pkg.printStatus();                 // "Package delivered"
pkg.nextState();
pkg.printStatus();                 // "Package received"
pkg.previousState();
pkg.printStatus();                 // back to "Package delivered"
```

**When to use:** when an object must behave differently depending on its current state and that state can change at runtime (order lifecycles, vending machines, traffic lights).

---

### Template Method
> Defines the skeleton of an algorithm in a base class, deferring specific steps to subclasses.

- `HouseTemplate.buildHouse()` is `final` — it calls `buildFoundation()`, `buildPillars()`, `buildWalls()`, `buildWindows()` in order
- `buildFoundation()` and `buildWindows()` have default implementations in the abstract class
- `buildPillars()` and `buildWalls()` are abstract — `WoodenHouse` and `GlassHouse` provide their own versions

**Usage:**
```java
HouseTemplate house = new WoodenHouse();
house.buildHouse();   // runs all steps; wooden-specific steps use WoodenHouse impl

house = new GlassHouse();
house.buildHouse();   // same order, different wall and pillar implementations
```

**When to use:** when multiple classes share the same algorithm structure but differ in specific steps — avoids duplicating the invariant parts.

---

### Visitor
> Adds new operations to an object structure without modifying the element classes.

- `Visitable` interface declares `accept(Visitor)`
- `Visitor` interface declares `visit(Doctor)` and `visit(Student)`
- `Doctor` and `Student` implement `Visitable`; `School` holds a list of both and runs a health check-up

**Usage:**
```java
School.doHealthCheckup();
// Each student and each doctor in the school accepts the visitor,
// which performs the check-up operation without changing Student or Doctor
```

**When to use:** when you need to perform many unrelated operations on an object structure and want to keep those operations separate from the element classes.

---

### Iterator
> Provides a standard way to traverse a collection without exposing its internals.

- `Iterator<T>` interface declares `hasNext()` and `next()`
- `EmployeeCollection` wraps a `String[]` of names
- `EmployeeRepository` holds an `EmployeeCollection` and returns an `EmployeeIterator` via `createIterator()`

**Usage:**
```java
EmployeeRepository repository = new EmployeeRepository();
Iterator<String> it = repository.createIterator();
while (it.hasNext()) {
    System.out.println(it.next());   // prints each employee name
}
```

**When to use:** when you want a uniform traversal API across different collection types, hiding whether the underlying store is an array, list, tree, etc.

---

### Mediator
> Centralises communication between objects so they don't refer to each other directly.

- `ChatMediator` interface declares `addUser(User)` and `sendMessage(String, User)`
- `ChatMediatorImpl` maintains a `List<User>` and broadcasts each message to all users except the sender
- `UserImpl` sends and receives through the mediator — users never talk to each other directly

**Usage:**
```java
ChatMediator mediator = new ChatMediatorImpl();
User alice = new UserImpl(mediator, "Alice");
User bob   = new UserImpl(mediator, "Bob");
mediator.addUser(alice);
mediator.addUser(bob);
alice.send("Hello everyone!");   // Bob receives it; Alice does not
```

**When to use:** when many objects communicate in complex ways, creating tight coupling. Common in chat systems, air-traffic control, UI form coordination.

---

### Memento
> Captures and externalises an object's state so it can be restored later, without violating encapsulation.

- `Article` holds `id`, `title`, and mutable `content`
- `Article.createMemento()` returns an `ArticleMemento` (immutable snapshot)
- `Article.restore(ArticleMemento)` rolls back `content` to the saved state

**Usage:**
```java
Article article = new Article(1, "My Article");
article.setContent("Draft v1");

ArticleMemento saved = article.createMemento();   // take snapshot

article.setContent("Draft v2 — bad edit");
article.restore(saved);                            // undo back to "Draft v1"
```

**When to use:** undo/redo functionality, transaction rollback, save-game checkpoints.

---

### Interpreter
> Defines a grammar for a language and provides an interpreter to process sentences in that language.

- `Format` is the context object holding the format string (e.g., `"MM-DD-YYYY"`) and the current `Date`
- `AbstractFormat` is the base expression; `MonthFormat`, `DayFormat`, `YearFormat` are terminal expressions
- `InterpreterDemo` parses the format string, builds a list of expression objects, and executes them in order

**Usage:**
```java
Format format = new Format();
format.setFormat("MM-DD-YYYY");
format.setDate(new Date());
// The interpreter replaces "MM" with the actual month, "DD" with day, "YYYY" with year
```

**When to use:** when you need to interpret sentences in a simple language or grammar — SQL parsing, expression evaluators, date formatters, configuration DSLs.
