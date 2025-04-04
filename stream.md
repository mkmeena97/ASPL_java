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
          System.out.println("We got a NullPointerException as null was passed as an argument to filter()");
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
## Infinite Streams
 - you can create infinite streams using methods like ```Stream.iterate()``` and ```Stream.generate()```.
 - > These streams do not have an inherent end, and if a terminal operation is applied without limiting the stream, it can result in an infinite loop or run indefinitely.
 - **Using IntStream.iterate()**
   - ```java
     // Generate an infinite stream of natural numbers: 1, 2, 3, 4, ...
      IntStream naturalNumbers = IntStream.iterate(1, x -> x + 1);

      // Print only the first 5 numbers
      naturalNumbers.limit(5).forEach(System.out::println);

     ```
  - **Using Stream.generate()**
    - ```java
      // Generate an infinite stream of random numbers
      Stream<Double> infiniteRandomNumbers = Stream.generate(Math::random);

      // Print only the first 10 random numbers
      infiniteRandomNumbers.limit(10).forEach(System.out::println);

      ```
---

## 📋 `collect()` Cheat Sheet – Java Stream Collectors

The `collect()` method is a **terminal operation** that transforms the elements of a stream into a **collection**, **map**, or **summary result** using **Collectors**.

- **Collect to a List**
  - ```java
    Collectors.toList()
    ```

- ** Collect to an ArrayList with Pre-allocated Size**
  - ```java
    Collectors.toCollection(() -> new ArrayList<>(size))
    ```

- ** Collect to a Set**
  - ```java
    Collectors.toSet()
    ```

- **Collect to a Set with Better Iteration Performance**
  - ```java
    Collectors.toCollection(() -> new LinkedHashSet<>())
    ```

- **Collect to a Case-Insensitive Set<String>**
   - ```java
     Collectors.toCollection(() -> new TreeSet<>(String.CASE_INSENSITIVE_ORDER))
     ```

- **Collect to an EnumSet<AnEnum> (Best Performance for Enums)**
  - ```java
    Collectors.toCollection(() -> EnumSet.noneOf(AnEnum.class))
    ```

- **Collect to a Map<K, V> with Unique Keys**
  - ```java
    Collectors.toMap(keyFunction, valueFunction)
    ```

- **Map MyObject.getter() to Unique MyObject**
  - ```java
    Collectors.toMap(MyObject::getter, Function.identity())
    ```

- **Map MyObject.getter() to Multiple MyObjects (Grouped)**
  - ```java
    Collectors.groupingBy(MyObject::getter)
    ```
---

## Parallel Stream
- Use `parallelStream()` or `stream().parallel()` to perform stream operations concurrently.
- Example:
  ```java
  List<String> data = Arrays.asList("One", "Two", "Three", "Four", "Five");
  Stream<String> aParallelStream = data.parallelStream();
  aParallelStream.forEach(System.out::println);
  ```
- Output order is not guaranteed.
- Good for performance when ordering is unimportant and CPU-bound operations.
- Avoid for IO-bound tasks like networking due to shared fork-join pool.

--- 

## Creating a Stream
- From Collection:
  ```java
  Collection<String> stringList = new ArrayList<>();
  Stream<String> stringStream = stringList.parallelStream();
  ```
- From Array:
  ```java
  String[] values = { "aaa", "bbbb", "ddd", "cccc" };
  Stream<String> stream1 = Arrays.stream(values);
  Stream<String> stream2 = Stream.of(values);
  ```
- Stream.of(varargs) can take individual elements:
  ```java
  Stream<Integer> integerStream = Stream.of(1, 2, 3);
  ```
- Primitive Streams:
  ```java
  IntStream intStream = IntStream.of(1, 2, 3);
  DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0);
  IntStream ranged = Arrays.stream(new int[]{1, 2, 3}, 1, 3);
  ```
- Convert primitive stream to boxed:
  ```java
  Stream<Integer> boxed = intStream.boxed();
  ```
- Stream supplier for reusable intermediate operations:
  ```java
  Supplier<Stream<String>> streamSupplier = () -> Stream.of("apple", "banana","orange")
      .map(String::toUpperCase).sorted();
  ```
---

 ## Statistics on Numerical Streams
- Use IntSummaryStatistics:
  ```java
  List<Integer> nums = Arrays.asList(1,2,3,4,5);
  IntSummaryStatistics stats = nums.stream().mapToInt(x -> x).summaryStatistics();
  System.out.println(stats);
  ```
---

## Convert Iterator to Stream
```java
Iterator<String> iterator = Arrays.asList("A", "B", "C").iterator();
Spliterator<String> spliterator = Spliterators.spliteratorUnknownSize(iterator, 0);
Stream<String> stream = StreamSupport.stream(spliterator, false);
```

## Index-based Iteration using IntStream
```java
String[] names = { "Jon", "Darin", "Bauke", "Hans", "Marc" };
IntStream.range(0, names.length)
  .mapToObj(i -> String.format("#%d %s", i + 1, names[i]))
  .forEach(System.out::println);
```
--- 


## Concatenate Streams
- Two streams:
  ```java
  Stream<String> concat = Stream.concat(abc.stream(), digits.stream());
  ```
- More than two:
  ```java
  Stream<String> concat = Stream.of(abc.stream(), digits.stream(), greekAbc.stream())
                                .flatMap(Function.identity());
  ```

Section 57.14: Reduction with Streams
- Custom reduction:
  ```java
  OptionalInt result = IntStream.of(1, 2, 3).reduce((a, b) -> a + b);
  ```
- With identity element:
  ```java
  int sum = IntStream.of(1, 2, 3).reduce(0, Integer::sum);
  ```
- Reduce List of Lists:
  ```java
  LinkedList<T> combined = listStream.reduce(new LinkedList<T>(), (l1, l2) -> {
      LinkedList<T> result = new LinkedList<>(l1);
      result.addAll(l2);
      return result;
  });
  ```
