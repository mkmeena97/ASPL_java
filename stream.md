# Java Streams – Important Notes

## What is a Stream?
- A **Stream** represents a sequence of elements supporting **functional-style operations**.
- Introduced in **Java 8**, part of the `java.util.stream` package.
- Supports both **sequential** and **parallel** processing.

## Stream Sources
- Collections can generate streams using:
  - `stream()` – sequential processing.
  - `parallelStream()` – parallel processing.

## Types of Stream Operations

### Intermediate Operations:
- Return another Stream.
- Lazy – they are not executed until a terminal operation is invoked.
- Can be chained.
- Common examples:
  - `filter()`
  - `map()`
  - `sorted()`
  - `distinct()`
  - `limit()`
  - `skip()`

### Terminal Operations:
- Trigger processing of the pipeline.
- Return a result or produce a side-effect.
- Examples:
  - `forEach()`
  - `collect()`
  - `count()`
  - `anyMatch()`
  - `allMatch()`
  - `reduce()`

> **Note**: Once a terminal operation is executed, the Stream is **consumed** and cannot be reused.

---

## Example

```java
Stream<String> fruitStream = Stream.of("apple", "banana", "pear", "kiwi", "orange");

fruitStream
    .filter(s -> s.contains("a"))
    .map(String::toUpperCase)
    .sorted()
    .forEach(System.out::println);
```
## Processing Order
 - Streams can be sequential or parallel:
   - Sequential streams process elements in the encounter order (if the source is ordered like a ```List, SortedSet,``` etc.).
   - Parallel streams may process elements in a non-deterministic order for performance gains.
 - To preserve order in parallel streams, use ```forEachOrdered()``` instead of ```forEach()```:
 - ```java
   list.parallelStream()
    .forEachOrdered(System.out::println);
   ```
