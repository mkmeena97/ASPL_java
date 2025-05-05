# Java Collections Framework

## Overview
Java Collections Framework is a set of interfaces and classes that provide a standardized way to handle groups of objects. It includes various types of collections such as lists, sets, queues, and maps.

## Collection Hierarchy
```
Iterable
  ├── Collection
  │    ├── List
  │    │    ├── ArrayList
  │    │    ├── LinkedList
  │    │    ├── Vector
  │    │    │    └── Stack
  │    ├── Set
  │    │    ├── HashSet
  │    │    ├── TreeSet
  │    │    ├── LinkedHashSet
  │    ├── Queue
  │         ├── PriorityQueue
  │         ├── LinkedList (when used as a queue)
  │         ├── ArrayDeque
  │
  ├── Map (Does not extend Collection)
       ├── HashMap
       ├── TreeMap
       ├── LinkedHashMap
       ├── Hashtable
```

---
## 1. Collection Interface (Root Interface)
**Methods:**
- `add(E e)`: Adds an element to the collection.
- `remove(Object o)`: Removes the specified element.
- `contains(Object o)`: Checks if the collection contains the element.
- `isEmpty()`: Checks if the collection is empty.
- `size()`: Returns the number of elements in the collection.
- `clear()`: Removes all elements.
- `iterator()`: Returns an iterator to traverse elements.

---
## 2. List Interface (Ordered Collection, Allows Duplicates)
### Internal Working:
- Uses indexing to store elements.
- Provides ordered insertion.

### Methods:
- `get(int index)`: Returns element at a given index.
- `set(int index, E element)`: Replaces the element at the index.
- `indexOf(Object o)`: Returns the index of the first occurrence.
- `lastIndexOf(Object o)`: Returns the index of the last occurrence.
- `subList(int fromIndex, int toIndex)`: Returns a portion of the list.

#### a) **ArrayList**
- Uses a dynamic array for storage.
- Default capacity is **10**.
- Resizes when the capacity is exceeded:
  - New capacity = `(old capacity * 1.5) + 1`
- **Time Complexity:**
  - `O(1)` for adding at the end.
  - `O(n)` for removing or inserting in between.

##### **Additional Methods in ArrayList:**
- `ensureCapacity(int minCapacity)`: Increases the capacity.
- `trimToSize()`: Reduces capacity to current size.

#### b) **LinkedList**
- Uses **doubly linked list** for storage.
- Faster insertion/deletion than ArrayList but **slower random access**.

##### **Additional Methods in LinkedList:**
- `addFirst(E e)`, `addLast(E e)`: Add elements at the beginning or end.
- `removeFirst()`, `removeLast()`: Remove first or last element.
- `getFirst()`, `getLast()`: Retrieve first or last element.

#### c) **Vector**
- Legacy class, synchronized (thread-safe).
- Resizes dynamically by doubling capacity.

##### **Additional Methods in Vector:**
- `capacity()`: Returns the current capacity.
- `copyInto(Object[] array)`: Copies elements into another array.
- `elements()`: Returns an enumeration of elements.
- `setSize(int newSize)`: Changes the size of the vector.

#### d) **Stack**
- Extends Vector.
- **Follows LIFO (Last In, First Out).**

##### **Additional Methods in Stack:**
- `push(E e)`: Pushes an element onto the stack.
- `pop()`: Removes and returns the top element.
- `peek()`: Returns the top element without removing it.
- `empty()`: Checks if the stack is empty.

---
## 3. Set Interface (No Duplicate Elements)
### Methods:
- `add(E e)`: Adds an element if not already present.
- `remove(Object o)`: Removes the element.
- `contains(Object o)`: Checks if the set contains the element.

#### a) **HashSet**
- Unordered collection, backed by a **HashMap**.
- Uses a hash table for storage.

#### b) **LinkedHashSet**
- Maintains insertion order.

#### c) **TreeSet**
- Stores elements in sorted order.
- Implemented using **Red-Black Tree**.

---
## 4. Queue Interface (FIFO - First In, First Out)
### Methods:
- `offer(E e)`: Adds an element.
- `poll()`: Retrieves and removes the head.
- `peek()`: Retrieves the head without removal.

#### a) **PriorityQueue**
- Elements are ordered based on **natural ordering** or a **custom comparator**.

#### b) **ArrayDeque**
- Double-ended queue, allows efficient addition/removal from both ends.

---
## 5. Map Interface (Key-Value Pairs)
### Methods:
- `put(K key, V value)`: Adds a key-value pair.
- `get(Object key)`: Retrieves value by key.
- `containsKey(Object key)`: Checks if key exists.
- `remove(Object key)`: Removes entry by key.

#### a) **HashMap**
- Stores key-value pairs.
- Allows **one null key** and multiple null values.
- **Uses hashing:**
  - Default size: **16**.
  - Load factor: **0.75** (resizes when 75% full).
  - **Resizing:**
    - If exceeded, capacity is **doubled** and entries are **rehashed**.

#### b) **LinkedHashMap**
- Maintains insertion order.

#### c) **TreeMap**
- Sorted based on **natural ordering**.
- Implemented using **Red-Black Tree**.

#### d) **Hashtable**
- **Synchronized** (thread-safe) version of HashMap.
- Does not allow null keys or values.

---
### Conclusion
- **ArrayList** is better for fast random access.
- **LinkedList** is better for frequent insertion/deletion.
- **Vector** is synchronized but rarely used.
- **HashMap** is efficient but unordered.
- **TreeMap** maintains sorted keys.
- **PriorityQueue** is useful for task scheduling.

Each collection has its own advantages, and choosing the right one depends on the use case!

