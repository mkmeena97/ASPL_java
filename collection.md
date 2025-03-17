# Java Collections Framework (JCF)

The **Java Collections Framework (JCF)** is a set of **interfaces and classes** that help store and manipulate **groups of objects** efficiently. Collections provide **dynamic, flexible data structures** beyond primitive arrays.

## What is a Generic Class?
A **generic class** allows defining **type parameters**, ensuring **type safety** and **code reusability**.

```java
class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}
```

Here, T represents a **generic type**, allowing the Box class to hold **any object type**.

## Collection Hierarchy in Java
The **collection hierarchy** starts from the **Iterable** interface:

```
Iterable
│
├── Collection
│   ├── List (Ordered, allows duplicates)
│   │   ├── ArrayList
│   │   ├── LinkedList
│   │   ├── Vector
│   │   │   ├── Stack
│   ├── Queue (FIFO)
│   │   ├── PriorityQueue
│   │   ├── Deque (LinkedList, ArrayDeque)
│   ├── Set (No duplicates, unordered)
│       ├── HashSet
│       ├── LinkedHashSet
│       ├── TreeSet (Sorted)
│
└── Map (Key-Value pairs, not part of Collection)
    ├── HashMap
    ├── LinkedHashMap
    ├── TreeMap
    ├── Hashtable
```

## Important Interfaces
### 1. Collection Interface (Root Interface)
The Collection interface is the **parent interface** of all collection classes.

#### Common Methods:

- `boolean add(E e)`: Adds an element
- `boolean remove(Object o)`: Removes an element
- `boolean contains(Object o)`: Checks if element exists
- `int size()`: Returns size of collection
- `boolean isEmpty()`: Checks if collection is empty
- `void clear()`: Removes all elements
- `Iterator<E> iterator()`: Returns iterator for traversal
- `boolean retainAll(Collection<?> c)`: Retains only specified elements

## 2. List Interface
A **List** is an **ordered collection** that allows **duplicate elements**.

### List Implementations:
- **ArrayList**
- **LinkedList**
- **Vector**
- **Stack** (Subclass of Vector)

#### Common Methods:
```java
void add(int index, E element); // Adds at a specific index
E get(int index); // Retrieves an element
E remove(int index); // Removes an element at index
int indexOf(Object o); // Returns first occurrence index
int lastIndexOf(Object o); // Returns last occurrence index
List<E> subList(int fromIndex, int toIndex); // Extracts sublist
void sort(Comparator<? super E> c); // Sorts list
```

## When Should We Use a List?
- **Fast random access**: Use `ArrayList`
- **Frequent insert/delete**: Use `LinkedList`
- **Thread-safe operations**: Use `Vector/Stack`

## ArrayList
- **Dynamic resizing**: Expands automatically.
- **Fast access**: O(1) for `get()`.
- **Slow insert/delete**: O(n) for `add()` and `remove()`.

### Internal Working:
1. **Initial capacity**: 10 elements.
2. **Adding elements**:
   - If space exists, element is inserted.
   - If capacity exceeds, a **new array** is created **with 1.5x capacity**, and elements are copied.
3. **Removing elements**:
   - Shifts **all elements** after the removed index, reducing size by 1.

### Time Complexity:
- `get(index)`: O(1)
- `add(element)`: O(1) amortized
- `remove(index)`: O(n)

## LinkedList
- Uses a **doubly linked list**.
- **Fast insert/delete** (O(1)).
- **Slower random access** (O(n)).
- **More memory overhead** (extra pointers required).

### Internal Working:
- **Each node** stores data and references to next and previous nodes.
- **Adding/removing** at head or tail is O(1), but searching is O(n).
- **Memory overhead** due to node pointers.

## Vector
- **Thread-safe** (but slower due to synchronization).
- Uses **doubling (2x) for resizing**.
- **Alternative**: Use `Collections.synchronizedList(new ArrayList<>())`.

### Internal Working:
- Similar to ArrayList but **synchronized**.
- Default **capacity = 10**.
- Increases **2x when full**.

## Stack
- A **LIFO (Last In First Out)** data structure.
- Uses **Vector** internally.
- **Thread-safe**, but slower.

#### Common Methods:
```java
E push(E item); // Adds item to stack
E pop(); // Removes top element
E peek(); // Returns top element without removing
boolean empty(); // Checks if stack is empty
int search(Object o); // Finds 1-based index of element
```

### Internal Working:
- Uses **Vector** internally.
- `push()` adds to top, `pop()` removes from top.
- **O(1)** time complexity for both operations.
- Uses **synchronization** like Vector, making it slower than other collections.

---

This document provides a **detailed overview** of the Java Collections Framework, explaining its **hierarchy, internal working, time complexity, and use cases** for each major class. 🚀

