# Bounded Generics Example

## Overview

This project demonstrates the use of bounded generics in Java, showcasing how generic classes can restrict the types they accept, enhancing code reusability and type safety. Bounded generics allow developers to create methods or classes that work with specific types while maintaining flexibility. This example includes various classes for printing data types using a generic printer class.

## Files

- **BoundedGenericsExample_WB.java**: Main class demonstrating the use of bounded generics. This file contains examples of how to work with various data types using bounded generic classes.
  
- **BoundedPrinter_WB.java**: A generic printer class that uses bounded types to accept specific data types. This ensures that only compatible types are accepted, enforcing type safety.
  
- **DataPrinter_WB.java**: A data-printer class to print details of different types, illustrating the flexibility and constraints of bounded generics.

- **DoublePrinter_WB.java**: Specialized printer class for `Double` values, demonstrating how to handle specific types within a bounded generic structure.
  
- **GenericDataPrinter_WB.java**: A more flexible data-printer class, illustrating a generic approach without specific bounds.
  
- **Grade_WB.java**: Represents a custom data type, `Grade`, used as an example of a bounded type within the printer classes.
  
- **GradeExample_WB.java**: Provides examples of printing `Grade` objects, showing how bounded generics work with custom classes.

- **IntegerPrinter_WB.java**: Specialized printer class for `Integer` values, illustrating bounded generics with primitive wrapper classes.
  
- **Printer_WB.java**: Base class for printer classes, outlining the generic structure and defining core methods for printing.
  
- **StringPrinter_WB.java**: Specialized printer class for `String` values, showing bounded generics in action with `String` data type.

## Requirements

- Java Development Kit (JDK) 8 or higher.

## Usage

1. **Compile** the Java files:
   ```bash
   javac *.java
   ```

2. **Run the Main Class**:
   Execute `BoundedGenericsExample_WB` to see the output of the bounded generics in action:
   ```bash
   java BoundedGenericsExample_WB
   ```

## Key Concepts Demonstrated

- **Bounded Generics**: The files demonstrate how to define generic classes with upper bounds, such as `<T extends Number>`, to allow only specific types (e.g., `Integer`, `Double`) while excluding incompatible types.
  
- **Type Safety**: By defining bounds on generics, these classes ensure type compatibility, reducing the risk of runtime errors.
  
- **Reusability**: The generic structure allows these classes to be easily adapted for different data types, enhancing code reuse and flexibility.

## Examples

The main class `BoundedGenericsExample_WB` includes sample code illustrating the use of each printer class. This allows users to see the behavior of the generic classes with different bounded types.

## License

This project is open source and available under the [MIT License](LICENSE).
