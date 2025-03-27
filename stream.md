# Java Streams – Important Notes

## What is a Stream?
- A **Stream** represents a sequence of elements that can be processed sequentially or in parallel.
- Introduced in **Java 8**.
- Streams support **functional-style operations** on collections of elements.

## Stream Sources
- Collections can generate streams using:
  - `stream()`: for sequential operations
  - `parallelStream()`: for parallel operations

## Types of Stream Operations
1. **Intermediate Operations**:
   - Return a Stream.
   - Can be chained.
   - Examples: `filter()`, `map()`, `sorted()`

2. **Terminal Operations**:
   - Produce a non-stream result or side effect.
   - Trigger the execution of intermediate operations.
   - Examples: `forEach()`, `collect()`, `count()`

> Once a terminal operation is performed, the Stream is **consumed** and can no longer be used. 

---

## Key Features
- Streams can represent **infinite data**.
- Processing is **element-by-element** (lazy evaluation).
- They **do not modify** the original data source.
- **Concise and readable** when used with lambda expressions.

---

## Example

```java
Stream<String> fruitStream = Stream.of("apple", "banana", "pear", "kiwi", "orange");
fruitStream
    .filter(s -> s.contains("a"))           // keep fruits with 'a'
    .map(String::toUpperCase)               // convert to uppercase
    .sorted()                               // sort alphabetically
    .forEach(System.out::println);          // print each
