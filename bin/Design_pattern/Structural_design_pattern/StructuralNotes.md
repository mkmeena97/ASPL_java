# Structural Design Patterns

Structural design patterns focus on **how classes and objects are composed to form larger structures**. They simplify design by identifying simple ways to realize relationships between entities. These patterns help ensure that if one part changes, the entire structure does not need to do the same.

---

## 1. Adapter Pattern

### Definition
The Adapter Pattern allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by wrapping the existing class with a new interface.

### Use Case
- When you want to use an existing class but its interface does not match the one you need.
- Integrating legacy or third-party code with your system.
- To convert the interface of a class into another interface the client expects.

### Real-world Example
Connecting a USB-C port (new interface) to an older HDMI cable (old interface) using an adapter.

---

## 2. Bridge Pattern

### Definition
Bridge Pattern separates an abstraction from its implementation so that the two can vary independently. It decouples interface and implementation by putting them in separate class hierarchies.

### Use Case
- When both the abstractions and their implementations should be extensible by subclassing.
- Avoiding a permanent binding between an abstraction and its implementation.
- When changes in the implementation should not affect the client code.

### Real-world Example
Remote controls (abstraction) working with various types of devices (implementation) like TVs, Radios, etc.

---

## 3. Composite Pattern

### Definition
Composite Pattern composes objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions uniformly.

### Use Case
- When you need to represent hierarchies of objects.
- When clients should be able to ignore the difference between compositions and individual objects.
- Managing tree structures like file systems, graphics, or organization charts.

### Real-world Example
An organizational chart where both employees and groups (departments) are treated uniformly.

---

## 4. Decorator Pattern

### Definition
Decorator Pattern attaches additional responsibilities to an object dynamically. It provides a flexible alternative to subclassing for extending functionality.

### Use Case
- When you want to add responsibilities to individual objects without affecting others.
- To add features dynamically and transparently.
- When subclassing would lead to an explosion of classes.

### Real-world Example
Adding scrollbars, borders, or shadows to a UI window dynamically without modifying the window class.

---

## 5. Facade Pattern

### Definition
Facade Pattern provides a simplified interface to a complex subsystem. It shields clients from the complexities of the subsystem by providing a unified higher-level interface.

### Use Case
- When you want to provide a simple interface to a complex system.
- To decouple clients from subsystem components.
- When you want to layer your system into subsystems.

### Real-world Example
A universal remote control that simplifies interaction with multiple home devices like TV, DVD player, and sound system.

---

## 6. Flyweight Pattern

### Definition
Flyweight Pattern reduces memory usage by sharing common parts of the state between multiple objects instead of keeping all data in each object. It’s useful when many objects share similar data.

### Use Case
- When many objects share common data that can be factored out.
- To improve performance and memory consumption.
- When dealing with large numbers of fine-grained objects.

### Real-world Example
Text editors sharing character fonts and formatting among many characters instead of duplicating the style data.

---

## 7. Proxy Pattern

### Definition
Proxy Pattern provides a placeholder or surrogate for another object to control access to it. It adds a level of indirection to support lazy loading, access control, logging, or caching.

### Use Case
- Controlling access to a resource-intensive object.
- Adding security or access control.
- Implementing lazy loading or caching.
- Logging requests or controlling expensive operations.

### Real-world Example
An image viewer that loads images only when they are actually needed (lazy loading).

---

# Summary

Structural design patterns improve the way objects and classes are composed, helping to build flexible and efficient software architectures. By abstracting the interactions and relationships between components, these patterns:

- Promote loose coupling.
- Simplify complex systems.
- Enhance code maintainability and scalability.

They are widely used in software frameworks, libraries, and large systems to manage complexity and improve system robustness.

---

