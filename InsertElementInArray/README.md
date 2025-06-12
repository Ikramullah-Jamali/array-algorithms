# ➕ Insert Element in Array (Java Programs)

This project demonstrates two different methods to **insert an element into an array** at a specific location in Java.

📁 Folder Name: `InsertElementInArray`

---

## 📂 Files Included

|         File Name             |                Description                           |
|-------------------------------|------------------------------------------------------|
| `InsertElementAtIndex.java`   | Inserts element at a specific **index** (0-based)    |
| `InsertElementAtPosition.java`| Inserts element at a specific **position** (1-based) |

---

## 💡 Key Concepts

- Arrays in Java have **fixed size**.
- To insert a value at a specific index/position:
- Traverse from the end of the array to the desired location.
- **Shift elements rightward** to create space.
- Insert the new value at the right index/position.

---

## 🧪 Example 1: Insert by Index (0-based)

📄 **File:** `InsertElementAtIndex.java`

### 🧾 Input:
Array:   {10, 20, 30, 40, 50, 60, 70, 80}
Element: 100
Index:   4
💻 Output: 
10 20 30 40 100 50 60 70 

🧪 Example 2: Insert by Position (1-based)
📄 File: InsertElementAtPosition.java

🧾 Input: 
Array:   {10, 20, 30, 40, 50, 60, 70, 80}
Element: 100
Position: 4
💻 Output: 
10 20 30 100 40 50 60 70

⚠️ Important Notes
These programs assume the array has enough capacity to hold the extra element.

Java arrays are not resizable, so this logic works best with pre-allocated space or static arrays.

For dynamic arrays, consider using Java’s ArrayList class.

🚀 How to Compile & Run
💻 Compile: 
javac InsertElementAtIndex.java 
javac InsertElementAtPosition.java
▶️ Run: 
java InsertElementAtIndex 
java InsertElementAtPosition 

---

##👨‍💻 Author : Ikramullah Jamali
