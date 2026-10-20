# Strategy Pattern — Navigation

Student: A.A. | GitHub: Adler-ton | Java 17

A demonstration of interchangeable car, walking and cycling route estimates. Figures are illustrative estimates, not live routing data.

## Run
Open the folder in IntelliJ IDEA with JDK 17 and run `com.adlerton.strategy.Main`. Or from the project root:

```bash
mkdir -p out
javac -d out src/main/java/com/adlerton/strategy/*.java
java -cp out com.adlerton.strategy.Main
```

## Structure
- `RouteStrategy`: shared contract
- `CarStrategy`, `WalkStrategy`, `CycleStrategy`: algorithms
- `Navigator`: context; switches strategy at runtime
- `Main`: client demonstration
- `Route`: immutable result
- `uml/strategy.puml`: PlantUML class diagram

Repository: https://github.com/Adler-ton/StrategyPattern 
