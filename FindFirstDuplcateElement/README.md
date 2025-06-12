# 🔁 Find First Duplicate Element in Java

This repository contains two Java programs that find the **first duplicate element** in an array.
Both approaches are simple and beginner-friendly.

📁 Folder Name: `FindFirstDuplicateElement`

---

## 📂 Files Included

1. **`FirstDuplicateElementInArrayUsingLoop.java`**  
   🔸 *Brute-force method using nested loops*

2. **`FirstDuplicateElementInArrayUsingHashSet.java`**  
   🔸 *Efficient method using Java Collections (`HashSet`)*

---

## 🧠 Approaches Explained

### 🥇 1. Nested Loop Method

- Uses two loops to compare each element with the rest.
- Stops and prints the **first duplicate found**.
- **Time Complexity:** `O(n²)`

📄 **File:** `FirstDuplicateElementInArrayUsingLoop.java`

💻 **Example Output:**
First duplicate element is: 2


---

### ⚡ 2. HashSet Method (Collections)

- Uses a `HashSet` to keep track of seen elements.
- Traverses the array **from right to left**.
- Prints the first duplicate that would appear from the left.
- **Time Complexity:** `O(n)`

📄 **File:** `FirstDuplicateElementInArrayUsingHashSet.java`

💻 **Example Output:**
First duplicate element is: 2

---

## ▶️ How to Run

1. Compile the Java file:
javac FirstDuplicateElementInArray1.java
javac FirstDuplicateElementInArrayUsingHashSet.java

2. Run the desired program:
java FirstDuplicateElementInArray1
java FirstDuplicateElementInArrayUsingHashSet

---

## 💡 Which One to Use?

| Method        | Speed           | Simplicity                     | Best Use                            |
|---------------|-----------------|--------------------------------|-------------------------------------|
| Nested Loops  | ❌ Slow (O(n²)) | ✅ Easy to understand         | Small arrays                        |
| HashSet       | ✅ Fast (O(n) ) | ⚠️ Requires HashSet knowledge | Large arrays or performance matters |

---

## 👨‍💻 Author : Ikramullah Jamali
