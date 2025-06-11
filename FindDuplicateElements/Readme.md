# 🔁 Duplicate Elements in Arrays (Java)

This folder contains two Java programs that demonstrate how to find duplicate elements in an array using two different approaches.

---

## 📄 Files Included

- `FindDuplicateElementsUsingSet.java`
- `FindDuplicateElementsUsingLoop.java`

---

## 🧩 FindDuplicateElementsUsingSet.java

This program finds duplicate elements in an array using Java’s `HashSet` collection.

### 🔹 Description

- It adds each element to a `HashSet`.
- If an element already exists in the set, it is identified as a duplicate.
- A second set is used to ensure that each duplicate is printed only once.

This approach is efficient and works well with large datasets due to constant-time operations of the `HashSet`.

---

## 🔂 FindDuplicateElementsUsingLoop.java

This program uses nested `for` loops and a `boolean[]` array to detect and print duplicate elements.

### 🔹 Description

- Each element is compared with all elements after it in the array.
- A boolean array is used to track and prevent printing the same duplicate more than once.
- This method does not use any Java collections, making it suitable for understanding basic loop logic and array manipulation.

---

## ▶️ Sample Output for Both Programs
Original Array is: 4 7 2 4 8 2 6
Duplicate elements in that array are: 4 2

---

## 🧠 Author
**Auther : Ikramullah Jamali** 

---

## 🛠️ How to Run

Compile and run each file using your terminal or Java IDE:

```bash
javac FileName.java
java FileName
Replace FileName with the actual file you want to run.

📚 Related Topics
Arrays
Loops
HashSet
Duplicate Detection
