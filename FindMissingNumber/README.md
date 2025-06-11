# 🔎 Find Missing Number in Array (Java)

This folder contains a Java program to find a missing number in a sequence of consecutive natural numbers using the **sum formula approach**.

---

## 📄 File Included

- `FindMissingNumberInArray.java`

---

## 🧾 Description

This program finds **one missing number** from a sequence of integers ranging from 1 to `n`. It assumes that:

- The array contains unique numbers
- The numbers are consecutive and start from `1`
- **Exactly one number** is missing

---

## 🧠 How It Works

The program uses the mathematical formula for the sum of the first `n` natural numbers:

Sum = n(n + 1) / 2

### Steps:
1. Calculates the **expected total sum** of numbers from 1 to `n`
2. Computes the **actual sum** of elements in the given array
3. Subtracts the actual sum from the expected sum to get the **missing number**

---

## 🎯 Sample Input
```java
int[] a = {1, 2, 3, 4, 5, 6, 7, 9, 10};
Missing number is: 8
▶️ How to Run
Save the file as FindMissingNumberInArray.java

Compile the code: 
javac FindMissingNumberInArray.java 
Run the program: 
java FindMissingNumberInArray 
📌 Notes 
The method works only when one number is missing in a sequence starting from 1.

If the sequence starts from another number (e.g. 5 to 14), a different approach is needed (e.g. XOR or formula adjustment).

Time Complexity: O(n)

Space Complexity: O(1)

🧠 Author
👤 Ikramullah Jamali 
📘 Learning DSA in Java
