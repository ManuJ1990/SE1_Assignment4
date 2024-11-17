# Design Patterns Exercises

This document provides a detailed description of additional exercises involving different design patterns and their practical implementations.

## Overview of Additional Exercises

### Exercise 2: Masking Input Characters

- **Pattern Used**: **Decorator Pattern**
- **Description**: In this exercise, an input stream is used to mask certain characters in the input flow (e.g., using an asterisk `*`). The **Decorator Pattern** is ideal here as it provides a flexible way to extend the functionality of an input stream without modifying the existing I/O stream class hierarchy. The masking logic is implemented as a decorator that "wraps" an existing input stream, adding additional functionality.

### Exercise 3: Organization Directory Structure

- **Pattern Used**: **Composite Pattern**
- **Description**: This exercise simulates the directory structure of an organization (such as MCI) that consists of board members, administrative staff, researchers, and technical personnel. The **Composite Pattern** is used to model a unified tree structure that contains both individual employees and groups of employees. This pattern allows for recursive retrieval of employee information without having to differentiate between individual objects and groupings.

### Exercise 4: Parental Control Web Browser

- **Pattern Used**: **Proxy Pattern**
- **Description**: This exercise simulates a web connection that serves as a parental control web browser. Before rendering a web page, the browser uses a filter to check if the URL is blacklisted. The **Proxy Pattern** is suitable here as the proxy acts as a control layer between the user and the actual webpage. The proxy filter intercepts and blocks requests before they reach the "real" browser.

## Running the Exercises

1. Clone the repository:
   ```
   git clone <repository_url>
   ```
2. Navigate to the exercise you wish to run.
3. Compile and run the respective `Main` class to see the output demonstrating the design pattern in use.

## Patterns Summary (Extended)

- **Decorator Pattern**: Used to add additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
- **Composite Pattern**: Composes objects into tree structures to represent part-whole hierarchies. This pattern lets clients treat individual objects and compositions of objects uniformly.
- **Proxy Pattern**: Provides a surrogate or placeholder to control access to another object. The proxy adds an additional level of control to the actual object.

## Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests to add new exercises, improve code quality, or expand on the documentation.

## License

This repository is licensed under the MIT License.

