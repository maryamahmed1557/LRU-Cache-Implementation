# ⚡ LRU Cache Implementation

A Java implementation of the **Least Recently Used (LRU) Cache** data structure and algorithm.

The project demonstrates how an LRU Cache manages a limited amount of data by automatically removing the least recently used item when the cache reaches its maximum capacity.

---

## 📌 Overview

An **LRU (Least Recently Used) Cache** is a data structure commonly used to improve performance by storing recently accessed data for quick retrieval.

When the cache reaches its maximum capacity, the item that has not been used for the longest time is removed to make space for new data.

This project implements the core operations of an LRU Cache using **Java and Data Structures**.

---

## ✨ Key Features

* ➕ Add key-value pairs to the cache.
* 🔍 Retrieve values using their keys.
* 🔄 Update the usage order when an item is accessed.
* 🗑️ Automatically remove the least recently used item.
* 📏 Maintain a fixed cache capacity.
* ⚡ Perform cache operations efficiently.

---

## 🧠 How LRU Cache Works

The cache keeps track of how recently each item was used.

For example, if the cache capacity is `3`:

```text id="w5pj9h"
Cache:
[A] [B] [C]
```

If `A` is accessed, it becomes the most recently used item:

```text id="b7f2pn"
[B] [C] [A]
```

If a new item `D` is added, the least recently used item `B` is removed:

```text id="v9l3kx"
[C] [A] [D]
```

This allows the cache to maintain only the most recently used items.

---

## 🛠️ Technologies Used

* ☕ Java
* 🧠 Data Structures
* ⚡ Algorithms
* 🔗 Linked Lists
* 🗂️ Hash Maps
* 🧱 Object-Oriented Programming

---

## 📊 Time Complexity

The main LRU Cache operations are designed to be efficient.

| Operation | Average Time Complexity |
| --------- | ----------------------: |
| Get       |                    O(1) |
| Put       |                    O(1) |
| Remove    |                    O(1) |

Using a **HashMap** together with a linked structure allows the cache to quickly find items while maintaining their usage order.

---

## 📂 Project Structure

```text id="y2s8qh"
LRU-Cache/
│
├── src/
│   ├── ...
│
├── README.md
└── ...
```

> The exact structure depends on the files included in the project.

---

## 🚀 How to Run

### 1. Install Java

Make sure the **Java Development Kit (JDK)** is installed.

### 2. Open the Project

Open the project in a Java-compatible IDE such as:

* IntelliJ IDEA
* Eclipse
* VS Code

### 3. Compile the Project

Compile the Java files:

```bash id="x6m2qk"
javac *.java
```

### 4. Run the Application

Run the class containing the `main()` method:

```bash id="u7p4cz"
java Main
```

> The main class name may differ depending on the project structure.

---

## 🧪 Example

Given a cache with a capacity of `3`:

```text id="m8c4xa"
put(1, A)
put(2, B)
put(3, C)

Cache:
1 → A
2 → B
3 → C
```

After accessing key `1`:

```text id="k2x5jd"
get(1)

Most Recently Used:
1
```

Adding a new item causes the least recently used item to be removed:

```text id="j4w9rs"
put(4, D)

Removed:
2 → B
```

---

## 🌱 What I Learned

Through this project, I gained practical experience in:

* Understanding the LRU Cache concept.
* Implementing Data Structures in Java.
* Working with Hash Maps.
* Working with Linked Lists.
* Analyzing algorithm efficiency.
* Understanding time complexity.
* Applying Object-Oriented Programming.
* Designing efficient data access operations.

---

## 👩‍💻 Project

This project was developed as part of my **Data Structures and Algorithms learning journey**.

It helped me understand how different data structures can work together to build an efficient real-world solution.

---

## ⭐ Future Improvements

Possible future improvements include:

* Adding a graphical user interface.
* Supporting different cache replacement strategies.
* Adding performance comparisons.
* Adding automated unit tests.
* Supporting configurable cache sizes.

---

### ⚡ Built with Java, Data Structures & Algorithms ❤️
