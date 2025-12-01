# Kotlin Employee Inheritance Project

This project demonstrates Object-Oriented Programming (OOP) concepts in Kotlin, specifically focusing on **Inheritance**, **Polymorphism**, and **Visibility Modifiers**.

## Project Overview
The program calculates the salaries of different types of employees (Full-Time vs. Part-Time) using a polymorphic approach. It iterates through a collection of employees and prints a payroll report.

## Class Structure



### 1. Base Class: `Employee`
* **Properties:** `name` and `baseSalary` (both marked as `protected` so they are accessible only to subclasses).
* **Methods:**
    * `calculateSalary()`: Returns the base salary (open for overriding).
    * `getEmployeeName()`: A public helper function to expose the protected name to the main program.

### 2. Subclass: `FullTimeEmployee`
* Inherits from `Employee`.
* Adds a `bonus` to the `baseSalary` in its calculation.

### 3. Subclass: `PartTimeEmployee`
* Inherits from `Employee`.
* Ignores `baseSalary` and calculates earnings based on `hourlyRate * hoursWorked`.

## Key Concepts Used
* **`open` vs `override`:** The base class methods are marked `open` to allow subclasses to provide specific implementations using `override`.
* **`protected` Visibility:** Data encapsulation is enforced by keeping properties protected.
* **Platform Declaration Clash Avoidance:** The getter method is explicitly named `getEmployeeName()` to avoid conflicting with Kotlin's auto-generated getters for the `name` property.

## How to Run
1.  Open `Main.kt` in IntelliJ IDEA or Kotlin Playground.
2.  Run the `main()` function.
3.  The output will display the ID, Name, and Final Salary for each employee in the list.
