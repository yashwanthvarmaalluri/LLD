# Parking Lot System

A Java-based parking lot management system that demonstrates object-oriented design principles and design patterns.

## Features

- **Vehicle Management**: Support for different vehicle types (Car, Bike)
- **Spot Management**: Different parking spot types with availability tracking
- **Ticket System**: Generate and process parking tickets
- **Billing Strategy**: Pluggable billing strategy pattern for different pricing models
- **Gate Management**: Separate entrance and exit gates for controlled access

## Design Patterns Used

- **Strategy Pattern**: For billing calculations (SimpleBilling implementation)
- **Factory Pattern**: For creating different types of vehicles and spots
- **Observer Pattern**: For spot availability notifications

## Project Structure

```
ParkingLot/
├── Main.java                 # Main application entry point
├── ParkingLot.java          # Main parking lot controller
├── ParkingFloor.java        # Floor management
├── ParkingSpot.java         # Individual parking spot
├── Vehicle.java             # Vehicle entity
├── VehicleType.java         # Vehicle type enumeration
├── SpotType.java            # Spot type enumeration
├── Ticket.java              # Parking ticket
├── EntranceGate.java        # Entry gate management
├── ExitGate.java            # Exit gate management
├── BillingStrategy.java     # Billing strategy interface
└── SimpleBilling.java       # Simple billing implementation
```

## How to Run

1. Compile the Java files:
   ```bash
   javac *.java
   ```

2. Run the main class:
   ```bash
   java Main
   ```

## Usage Example

The system creates a parking floor with different spot types, allows vehicles to enter and park, and processes their exit with billing calculation.

## Design Principles

- **Single Responsibility**: Each class has a single, well-defined responsibility
- **Open/Closed**: Easy to extend with new vehicle types or billing strategies
- **Dependency Inversion**: High-level modules don't depend on low-level modules
- **Interface Segregation**: Small, focused interfaces for different concerns
