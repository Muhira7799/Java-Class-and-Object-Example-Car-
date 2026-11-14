# Java Class and Object Example (Car)

A small Java program that models a car with four **states** (fields) and three **behaviors** (methods).

## What It Demonstrates

| States (fields) | Behaviors (methods) |
|-----------------|---------------------|
| `brand` = "Toyota" | `startEngine()` |
| `color` = "Red" | `accelerate()` |
| `year` = 2024 | `brake()` |
| `price` = 25000.0 | |

The fields have default values, so a new `Car` object starts as a red 2024 Toyota.

```java
Car myCar = new Car();
System.out.println("Brand: " + myCar.brand + ", Color: " + myCar.color);
myCar.startEngine();
myCar.accelerate();
myCar.brake();
```

## Output

```
Brand: Toyota, Color: Red
Engine started
Car is accelerating
Car has stopped
```

The `year` and `price` fields exist but are not printed in this program.

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac Car.java
java Car
```

## Project Structure

```
.
├── Car.java
└── README.md
```

## Next Steps

- Print `year` and `price` too
- Add a constructor to set the fields when the object is created
- Make the fields `private` and add getters and setters
- Create several `Car` objects with different values
