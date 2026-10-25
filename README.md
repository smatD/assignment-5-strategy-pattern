# Assignment #5 - Strategy Pattern

Java 17 project demonstrating runtime switching between car, walking, and cycling route strategies.

## How to run

1. Right-click `src/Main` and choose Run 'Main.main()'.

## Run from terminal

From the project root:

```
javac -d out src/*.java
java -cp out Main
```

## Add another strategy

1. Create a class in `src` that implements `RouteStrategy`.
2. Implement `buildRoute(String start, String destination, double distanceKm)`.
3. In `Main`, pass an instance to `new Navigator()` or `navigator.setStrategy()`.

## Files

- `RouteStrategy`: common interface
- `CarStrategy`, `WalkStrategy`, `CycleStrategy`: algorithms
- `Navigator`: context
- `Main`: client
