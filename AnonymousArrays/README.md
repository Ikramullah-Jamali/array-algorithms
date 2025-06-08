# Anonymous Arrays in Java

This folder contains simple Java programs demonstrating the concept of **anonymous arrays** in Java, including both 1D and 2D arrays.

Anonymous arrays are arrays that are **declared and instantiated without a reference variable**.
They are commonly used when arrays are needed for **one-time use**, such as passing as arguments to methods.

---

## 📁 Files Included

### 1. Anonymous1DArray.java

- Demonstrates how to create and use an **anonymous 1D array**.
- Passes the array directly to a method without storing it in a named variable.
- Uses an enhanced `for` loop to calculate and print the sum of elements.

📌 **Key Concepts:**
- Anonymous 1D array syntax: `new int[]{10, 20, 30}`
- Method receives array as parameter and processes it

---

### 2. `Anonymous2DArray.java`

- Demonstrates how to create and use an **anonymous 2D array** (including jagged arrays).
- Calculates and prints the sum of all elements using nested loops.

📌 **Key Concepts:**
- Anonymous 2D array syntax: `new int[][]{{10, 20, 30}, {40, 50}}`
- Enhanced `for` loops for iterating over rows and elements

---

## 🧠 What You Learn

- How to use anonymous arrays in real code
- When and why to use anonymous arrays (e.g., short-term data processing)
- Basic array traversal using enhanced `for` loops

---

## 🛠️ How to Run

javac Anonymous1DArray.java
java Anonymous1DArray

javac Anonymous2DArray.java
java Anonymous2DArray

Each program will output the sum of the elements in the anonymous array.

📌 Example Output
Anonymous1DArray.java

Calculating sum of anonymous 1D array elements:
Sum is: 60

Anonymous2DArray.java

Calculating sum of anonymous 2D array elements:
Sum is: 150

## 📘 License
This repository is intended for learning and educational use.

Feel free to modify the code or reuse it in your own Java practice projects!

---

## 🙋‍♂️ Auther
Auther: Ikramullah Jamali
