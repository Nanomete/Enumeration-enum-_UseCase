# Enumeration-enum-_UseCase
An enumeration, or enum, is a user-defined data type that consists of a set of named constants. These constants are typically integers under the hood, but the names make your code more readable and meaningful.

This project demonstrates the use of Java enums to represent product sizes and their associated prices.

## Files
- `SizePrice.java`: Contains the main logic and the `Size` enum.
- `README.md`: Project documentation.

## How It Works
- The `Size` enum defines four sizes: S, M, L, XL, each with a specific price.
- The `SizePrice` class prompts the user to enter a size (S, M, L, XL).
- Based on the input, the program displays the corresponding price or an error message for invalid input.

## Example Usage
```
Enter size (S, M, L, XL): M
Price for size M: $45.99
```

## How to Run
1. Compile the Java file:
	```powershell
	javac SizePrice.java
	```
2. Run the program:
	```powershell
	java SizePrice
	```

## Requirements
- Java Development Kit (JDK) 8 or higher  
	[Download JDK from Oracle](https://www.oracle.com/java/technologies/downloads/)
- Windows OS (recommended)

## Features
- Uses Java enum with constructor and method.
- Simple switch-case with lambda expressions (Java 14+ syntax).
- User input handling via `Scanner`.
