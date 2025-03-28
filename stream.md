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
---

## Processing Order
 - Streams can be sequential or parallel:
   - Sequential streams process elements in the encounter order (if the source is ordered like a ```List, SortedSet,``` etc.).
   - Parallel streams may process elements in a non-deterministic order for performance gains.
 - To preserve order in parallel streams, use ```forEachOrdered()``` instead of ```forEach()```:
 - ```java
   list.parallelStream()
    .forEachOrdered(System.out::println);
   ```
--- 

## Closing Stream
 - Most streams do not need to be closed, except when dealing with IO resources.
 - Streams created from files, sockets, etc., must be closed to avoid resource leaks.
 - Example using try-with-resources:
   - ```java
     try (Stream<String> lines = Files.lines(Paths.get("somePath"))) {
     lines.forEach(System.out::println);
     }
     ```
 - Streams implement ```AutoCloseable```, allowing them to be used in try-with-resources.
 - We can also use onClose() to register a cleanup handler when the stream is closed.
 - Example with ```onClose():```
   - ```java
     public Stream<String> streamAndDelete(Path path) throws IOException {
     return Files.lines(path)
                .onClose(() -> someClass.deletePath(path));
     }
     ```
   - > **Note:** onClose() handlers are invoked only when the stream is explicitly or implicitly closed.

---

## Consuming Streams
 - A Stream is not evaluated until a terminal operation is called.
 - Intermediate operations like filter(), map(), peek() are lazy and do nothing by themselves.
 - After a terminal operation, the Stream is consumed and cannot be reused.
 - **Reusing a Stream with Iterable:**
   - While a Stream itself can't be reused, you can wrap a stream-producing lambda inside an Iterable:
   - ```java
     List<String> list = Arrays.asList("FOO", "BAR");

      Iterable<String> iterable = () -> list.stream()
                                      .map(String::toLowerCase)
                                      .iterator();

      for (String str : iterable) {
        System.out.println(str);
      }

     ```
  - **Argument Validation Happens Immediately**
    - Even without a terminal operation, invalid arguments to intermediate operations are checked immediately.
    -  ```java
       try {
        IntStream.range(1, 10).filter(null);
        } catch (NullPointerException e) {
          System.out.println("We got a NullPointerException as null was passed as an             argument to filter()");
        }

       ```
---

## Creating a Frequency Map
 - use to analyze frequency of user inputs, logs, or any list of repeated values.
 - **Key Concepts**
   - ```groupingBy(classifier, downstreamCollector):```
     - Classifier: A function used to group the elements (e.g., by the value itself).
     - Downstream Collector: An operation applied to each group of elements (e.g., count, sum, list, etc.).
     - ```java
               Map<String, Long> frequencyMap = Stream.of("apple", "orange", "banana", "apple")
            .collect(Collectors.groupingBy(
                Function.identity(), // classifier: the word itself
                Collectors.counting() // downstream: count how many times each appears
            ));

        frequencyMap.entrySet().forEach(System.out::println);
       ```
---
