# Low Level Design (LLD) Projects

This repository contains two Low Level Design projects demonstrating different design patterns and system architectures.

## Projects

### 1. Decorator Pattern - Pizza Ordering System
**Location:** `Decorator_Demo/`

A Java implementation of the Decorator Design Pattern using a pizza ordering system. This project demonstrates how to dynamically add functionality to objects without altering their structure.

**Features:**
- Base pizza interface and concrete implementations
- Abstract decorator class for toppings
- Concrete topping decorators (Cheese, Chicken)
- Organized folder structure with proper package management

**Structure:**
```
Decorator_Demo/
├── interfaces/          # BasePizzaInt interface
├── abstracts/           # ToppingsAbstract class
├── concrete/            # PlainPizzaConc, ThinCrustPizzaConc
├── toppings/            # CheeseTopping, ChickenTopping
└── Main.java           # Demo application
```

### 2. Parking Lot Management System
**Location:** `ParkingLot/`

A comprehensive parking lot management system designed using object-oriented principles. This project demonstrates system design concepts for a real-world application.

**Features:**
- Vehicle type management
- Parking spot allocation
- Billing strategy pattern
- Entrance and exit gate management
- Floor-based parking organization

**Key Classes:**
- `ParkingLot.java` - Main system controller
- `ParkingFloor.java` - Floor management
- `ParkingSpot.java` - Individual spot management
- `Vehicle.java` - Vehicle representation
- `BillingStrategy.java` - Billing pattern implementation

## Getting Started

### Prerequisites
- Java 8 or higher
- Git

### Running the Projects

#### Decorator Pattern Demo
```bash
cd Decorator_Demo
javac -cp . Main.java
java Main
```

#### Parking Lot System
```bash
cd ParkingLot
javac -cp . *.java
java Main
```

## Design Patterns Used

1. **Decorator Pattern** - Pizza ordering system
2. **Strategy Pattern** - Billing system in parking lot
3. **Factory Pattern** - Vehicle creation
4. **Observer Pattern** - Spot availability notifications

## Learning Outcomes

These projects demonstrate:
- Object-oriented design principles
- Design pattern implementation
- System architecture planning
- Code organization and structure
- Interface segregation
- Dependency inversion

## Author

Yashwanth Varma Alluri
