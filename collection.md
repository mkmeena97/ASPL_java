# Java Collections

## Introduction
Java Collection is a framework that provides a set of classes and interfaces for storing and managing groups of objects. It is primarily built around a set of interfaces that define different types of collections.

## What is a Generic Class?
A **generic class** in Java is a class that is parameterized over types, allowing the creation of classes and methods that operate on specified types without specifying the exact type during implementation. This helps in ensuring type safety and reducing runtime errors.

Example:
```java
class Box<T> {
    private T value;
    public void setValue(T value) { this.value = value; }
    public T getValue() { return value; }
}
```

## Collection Hierarchy
The Java Collection framework starts with the **Iterable** interface, which is the root of the collection hierarchy. The hierarchy is as follows:

```
Iterable (interface)
    ├── Collection (interface)
        ├── List (interface)  → ArrayList, LinkedList, Vector, Stack
        ├── Set (interface)   → HashSet, LinkedHashSet, TreeSet
        ├── Queue (interface) → PriorityQueue, LinkedList, ArrayDeque
        ├── Deque (interface) → ArrayDeque, LinkedList
```

## Important Interfaces

### 1. Collection Interface (Root Interface)
**Methods of Collection Interface:**
```java
boolean add(E e);
boolean remove(Object o);
boolean contains(Object o);
boolean isEmpty();
int size();
void clear();
boolean containsAll(Collection<?> c);
boolean addAll(Collection<? extends E> c);
boolean removeAll(Collection<?> c);
boolean retainAll(Collection<?> c);
Object[] toArray();
<T> T[] toArray(T[] a);
```

---

### 2. List Interface
- **Definition**: A List is an ordered collection that allows duplicate elements.
- **Package**: `java.util`
- **Common Implementations**: `ArrayList`, `LinkedList`, `Vector`, `Stack`

**Methods of List Interface:**
```java
void add(int index, E element);
boolean addAll(int index, Collection<? extends E> c);
E get(int index);
E remove(int index);
E set(int index, E element);
int indexOf(Object o);
int lastIndexOf(Object o);
ListIterator<E> listIterator();
ListIterator<E> listIterator(int index);
List<E> subList(int fromIndex, int toIndex);
```

#### When Should You Use List?
- When you need **ordered elements**.
- When you **allow duplicate values**.
- When you need **random access** to elements (especially for `ArrayList`).

#### ArrayList (Detailed Explanation)
**Definition**: `ArrayList` is a resizable array implementation of the `List` interface.

**Key Features:**
- It **can grow dynamically**.
- **Implements RandomAccess interface**, providing fast access time (O(1) for `get()` operations).
- **Not synchronized**, making it faster than `Vector` but not thread-safe.

##### Internal Working of ArrayList:
- The default capacity of `ArrayList` is **10**.
- When adding elements:
  - If the current capacity is full, a **new array is created** with 1.5x of the current capacity.
  - All elements are **copied** to the new array.
- **Time Complexity**:
  - **Access (`get()`)**: O(1)
  - **Insertion at end (`add()`)**: O(1) (Amortized)
  - **Insertion in middle (`add(index, element)`)**: O(n)
  - **Deletion (`remove()`)**: O(n), as elements need to be shifted.

Example:
```java
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove(2);
        System.out.println("After removal: " + list);
    }
}
```
**Output:**
```
[1, 2, 3, 4]
After removal: [1, 2, 4]
```

##### Memory Allocation:
When `ArrayList` expands, a **new array** is created and elements are copied over. The **new capacity formula**:
```java
newCapacity = (oldCapacity * 3) / 2 + 1;
```
Example:
- If the capacity is `10`, after exceeding:
  - `New capacity = (10 * 3) / 2 + 1 = 16`
  - If exceeded again, `New capacity = (16 * 3) / 2 + 1 = 25`, and so on.

---

