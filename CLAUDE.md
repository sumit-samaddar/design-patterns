# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

```bash
# Build the project
mvn clean install

# Compile only
mvn compile

# Run a specific Demo class (replace with any *Demo fully-qualified class name)
mvn exec:java -Dexec.mainClass="com.design.patterns.creational.singleton.SingletonDemo"

# Skip tests during build (no test sources exist currently)
mvn clean install -DskipTests
```

## Architecture

This is a single-module Maven project (`com.design.patterns:design-patterns:1.0`) containing educational reference implementations of 18 Gang of Four design patterns. There is no application entry point — each pattern has its own standalone `*Demo.java` main class.

### Package layout

```
src/main/java/com/design/patterns/
├── creational/
│   ├── singleton/       — 4 variations: Lazy, Eager, StaticBlock, ThreadSafe
│   ├── factory/         — superclass + subclass selection via ComputerFactory
│   ├── abstructfactory/ — note: intentional typo in package name; UI component factories (Mac/Windows)
│   ├── builder/         — inner static Builder class with fluent API
│   └── prototype/       — Employee cloning via Cloneable
├── structural/
│   ├── adapter/         — voltage conversion; interface bridging via SocketAdapterImpl
│   ├── bridge/          — Shape + Colour hierarchies decoupled via composition
│   ├── composite/       — Drawing as container of Shape leaf nodes
│   ├── decorator/       — Car wrapping chain: BasicCar → SportsCar/LuxuryCar
│   ├── facade/          — ReportGeneratorFacade hiding HTML/PDF subsystems
│   └── proxy/           — ImageProxy with lazy-load delegation to RealImage
└── behavioral/
    ├── state/           — Package lifecycle: Ordered → Delivered → Received
    ├── templatemethod/  — HouseTemplate abstract steps; WoodenHouse/GlassHouse implement
    ├── visitor/         — Doctor visiting Students in a School
    ├── iterator/        — EmployeeRepository + custom Iterator interface
    ├── mediator/        — ChatMediatorImpl coordinating UserImpl instances
    ├── memento/         — Article state saved/restored via ArticleMemento
    └── interpreter/     — Date format grammar: Format interface → Day/Month/YearFormat
```

### Key conventions

- Each pattern directory has exactly one `*Demo.java` with a `main` method — this is the runnable entry point for that pattern.
- Logging uses SLF4J + Logback. Logger is declared as `final static Logger log = LoggerFactory.getLogger(Foo.class)`. Logback config is at `src/main/resources/logback.xml` (DEBUG level, console appender).
- Lombok is on the compile classpath (`provided` scope). The `maven-compiler-plugin` includes `--add-opens` JVM args specifically to allow Lombok annotation processing on newer JDKs.
- The `abstructfactory` package name is a known typo — do not rename it, as it matches the existing git history.
- Domain objects are reused across patterns for familiarity (e.g., `Computer` appears in both `factory` and `builder` as independent classes with the same name but different implementations).
