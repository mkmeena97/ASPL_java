#  Creational Design Patterns in Java

Creational design patterns deal with object creation mechanisms. They abstract the instantiation process, making the system more flexible, scalable, and decoupled. Instead of instantiating objects directly using `new`, these patterns provide various ways to create objects based on the situation.

---

##  Types of Creational Design Patterns

Creational patterns include:

1. **Singleton**
2. **Factory Method**
3. **Abstract Factory**
4. **Builder**
5. **Prototype**

Each pattern addresses different aspects of object creation, such as instantiation control, construction complexity, or object configuration.

---

## 1️. Singleton Pattern

###  Intent
Ensure a class has **only one instance** and provide a **global point of access** to it.

###  Use Cases
- Logging
- Configuration managers
- Thread pools
- Database connections

### ️ Key Characteristics
- Private constructor
- Static instance of the class
- Public static `getInstance()` method

###  Pros
- Controlled access to the single instance
- Saves memory by avoiding multiple instances

###  Cons
- Difficult to test (global state)
- Can cause issues in multithreaded environments if not implemented correctly

---

## 2️. Factory Method Pattern

###  Intent
Define an interface for creating an object, but let **subclasses decide** which class to instantiate.

###  Use Cases
- GUI libraries where buttons or dialogs differ across platforms
- Document editors (new document of different types)
- Notification systems (SMS, Email, Push)

###  Key Characteristics
- Abstract creator class/interface
- Concrete classes override the creation method

###  Pros
- Code decoupled from specific product classes
- Supports Open/Closed Principle (easy to extend)

###  Cons
- May increase the number of classes
- Complexity can increase with deep hierarchies

---

## 3️. Abstract Factory Pattern

###  Intent
Provide an interface for creating **families of related objects** without specifying their concrete classes.

###  Use Cases
- UI libraries that must support multiple themes/platforms
- Game development (different worlds with consistent object families)

### ️ Key Characteristics
- Abstract factory declares creation methods
- Concrete factories implement them
- Ensures consistency among related products

###  Pros
- Enforces consistency among products
- Facilitates switching between product families

### ️ Cons
- Hard to add new product types
- Can become complex with many variations

---

## 4️. Builder Pattern

###  Intent
Separate the **construction of a complex object** from its representation, allowing the same construction process to create different representations.

###  Use Cases
- Complex objects with many optional fields (e.g., HTTP requests, Pizza orders, User profiles)
- Object creation in stages or steps

### ️ Key Characteristics
- Uses a `Builder` class to set properties step-by-step
- Final `build()` method returns the constructed object

###  Pros
- More readable and maintainable code
- Helps avoid large constructors with many parameters
- Supports immutability

### ️ Cons
- Requires creating a separate Builder class
- Slight increase in code complexity

---

## 5️. Prototype Pattern

###  Intent
Create new objects by **copying (cloning)** an existing object instead of creating from scratch.

###  Use Cases
- Performance-intensive object creation
- Game character templates or form cloning
- UI components with preset configurations

### ️ Key Characteristics
- Objects must implement `Cloneable`
- Deep or shallow copy depending on requirements

###  Pros
- Reduces overhead of new object creation
- Useful for complex object configurations

### ️ Cons
- Clone behavior must be handled carefully (especially with mutable fields)
- Deep cloning can be error-prone

---

##  Comparison Table

| Pattern         | Primary Use                              | When to Use                                       |
|----------------|-------------------------------------------|--------------------------------------------------|
| Singleton       | Single shared instance                   | When exactly one instance is needed              |
| Factory Method  | Object creation via inheritance          | When object type is determined at runtime        |
| Abstract Factory| Related object families                  | When consistent products are needed across family|
| Builder         | Step-by-step object construction         | When object has many optional fields             |
| Prototype       | Clone instead of new                     | When object creation is costly or complex        |

---

##  Summary

Creational patterns encapsulate the logic of object creation to:
- Promote loose coupling
- Support scalability and flexibility
- Hide instantiation logic
- Provide control over how and when objects are created

Choosing the right pattern depends on your use case:
- Need only one instance → Singleton
- Need to defer object creation → Factory Method
- Need families of related objects → Abstract Factory
- Need complex object construction → Builder
- Need cloning of objects → Prototype

---
