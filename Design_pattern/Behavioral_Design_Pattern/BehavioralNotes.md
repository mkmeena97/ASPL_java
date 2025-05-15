# Behavioral Design Patterns

Behavioral design patterns focus on communication between objects. They help in assigning responsibilities and managing complex control flows, improving flexibility in how objects interact.

---

## 1. Chain of Responsibility

### Definition

Allows a request to be passed along a chain of handlers until one of them handles it.

### Use Case

* When multiple objects may handle a request, but the handler isn't known in advance.
* Decouples sender from receiver.

### Problem It Solves

Avoids coupling the sender of a request to its receiver by giving more than one object a chance to handle it.

### Real-Life Example

* Customer support system with Level 1, Level 2, and Level 3 support.

---

## 2. Command Pattern

### Definition

Encapsulates a request as an object, allowing parameterization of clients with different requests.

### Use Case

* For implementing undo/redo, queues, and logs.
* Decouples sender and receiver.

### Problem It Solves

Eliminates tight coupling between sender and receiver of a request.

### Real-Life Example

* Remote control systems.
* Task queues (e.g., in UI frameworks).

---

## 3. Interpreter Pattern

### Definition

Defines a grammar for interpreting a language and provides an interpreter to interpret sentences in the language.

### Use Case

* When building language processors or simple rule engines.

### Problem It Solves

Allows easy parsing and evaluation of structured data or expressions.

### Real-Life Example

* Mathematical expression evaluators.
* Simple scripting engines.

---

## 4. Iterator Pattern

### Definition

Provides a way to access the elements of a collection sequentially without exposing its internal structure.

### Use Case

* For uniform iteration over different collection types.

### Problem It Solves

Abstracts the iteration logic from the collection.

### Real-Life Example

* Java's `Iterator` or `ListIterator`.

---

## 5. Mediator Pattern

### Definition

Defines an object that encapsulates how a set of objects interact.

### Use Case

* When many objects communicate in a complex way.

### Problem It Solves

Reduces the dependency between communicating objects, promoting loose coupling.

### Real-Life Example

* Chat applications with a central chat room mediator.

---

## 6. Memento Pattern

### Definition

Captures and externalizes an object's internal state so it can be restored later without violating encapsulation.

### Use Case

* For implementing undo mechanisms.

### Problem It Solves

Restores object state without breaking encapsulation.

### Real-Life Example

* Text editor undo/redo feature.

---

## 7. Observer Pattern

### Definition

Defines a one-to-many dependency so that when one object changes state, all its dependents are notified.

### Use Case

* When multiple objects need to be updated in response to a state change.

### Problem It Solves

Decouples the subject from its observers.

### Real-Life Example

* Notification systems, real-time dashboards.

---

## 8. State Pattern

### Definition

Allows an object to change its behavior when its internal state changes.

### Use Case

* When an object's behavior depends on its state.

### Problem It Solves

Removes conditional logic for state management.

### Real-Life Example

* Vending machine state transitions.

---

## 9. Strategy Pattern

### Definition

Defines a family of algorithms, encapsulates each one, and makes them interchangeable.

### Use Case

* When different variants of an algorithm are needed.

### Problem It Solves

Eliminates conditional logic for algorithm selection.

### Real-Life Example

* Payment strategies (credit card, UPI, PayPal).

---

## 10. Template Method Pattern

### Definition

Defines the skeleton of an algorithm and lets subclasses override specific steps without changing the algorithm's structure.

### Use Case

* When multiple classes follow similar processes with minor variations.

### Problem It Solves

Promotes code reuse while allowing customization.

### Real-Life Example

* Report generation templates.

---

## 11. Visitor Pattern

### Definition

Separates algorithms from the objects on which they operate.

### Use Case

* When performing operations on a group of similar objects with varying logic.

### Problem It Solves

Adds new operations without modifying object structure.

### Real-Life Example

* Employee evaluations and tax reports using visitor objects.

---

These patterns together help manage complex object interactions, encapsulate behavior, and improve modularity and maintainability in software systems.
