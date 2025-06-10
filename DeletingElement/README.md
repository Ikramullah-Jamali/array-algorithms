# 🧹 DeletingElement – Java Array Deletion Examples

This folder contains simple Java programs that demonstrate how to **delete one element** from arrays — both **1D and 2D** — using different approaches.

---

## 📁 Files Included

### 1. `DeletingOneElementFrom1DArray.java`
🔸 Deletes a specified element from a **1D array** by shifting elements left.  
🔸 The last element is ignored since the array size is fixed.  
🔸 If the element is not found, it shows an appropriate message.

**🧪 Example Output:**

Element deleted successfully:
10 20 40 50

---

### 2. `DeletingOneElementFrom2DArraySimple.java`
🔸 Searches for a specified element in a **2D array**.  
🔸 If found, it **replaces it with `0`** to simulate deletion.  
🔸 Maintains array size and structure.

**🧪 Example Output:**

Element deleted successfully:
10 20 30
40 0 60
70 80 90

---

### 3. `DeletingOneElementFrom2DArrayShifted.java`
🔸 A more advanced method that:
- Flattens the 2D array to a 1D array
- Deletes the element by shifting remaining elements left
- Prints the elements in a **resized 2D format** (last row may be incomplete)

🔸 This method **removes the element completely** instead of replacing it with 0.

**🧪 Example Output:**

Element deleted successfully:
10 20 30
40 60 70
80 90

---

## 📚 Concepts Covered

- Array traversal (1D & 2D)
- Element search and conditional logic
- Shifting elements to simulate deletion
- Flattening and reshaping arrays
- Handling fixed-size limitations in Java arrays

---

## 💡 Future Improvements (Optional)

- Accepting input from users using `Scanner`
- Deleting multiple occurrences
- Using `ArrayList` or dynamic data structures
- Supporting rectangular or uneven 2D arrays

---

## 🛠️ How to Run

Compile and run any of the `.java` files:

```bash
javac FileName.java
java FileName
Replace FileName with the name of the file you'd like to run (e.g., DeletingOneElementFrom1DArray).

Made with ☕ Java for learning and practice.
Happy coding! 😄
---
## Auther : Ikramullah Jamali
