# Food Delivery System

Java implementation of the Food Delivery UML diagram, following SOLID principles.

## Design
- Strategy pattern for `PaymentMethod` and `DeliveryOption` (OCP, DIP)
- `MenuItem` abstract class with `Meal` and `Drink` (LSP)
- Small focused interfaces (ISP)
- One responsibility per class (SRP)

## Run
```
javac src/*.java -d out
java -cp out Main
```
