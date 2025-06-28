# 🔍 Find Second Smallest Element in an Array

This folder contains Java programs that demonstrate different ways to find the **second smallest element** in a one-dimensional integer array.

### 🧠 These implementations focus on logic building, array traversal, sorting techniques, 
and performance considerations — ideal for beginners learning core Java and algorithm design.

---

## 📁 Files Included

### 📄 1. `SecondSmallestElementUsingBubbleSort.java`
- 🔧 **Logic**: Uses **full bubble sort** to sort the array in ascending order.
- ✅ Once sorted, the second element (index `1`) is returned as the second smallest.
- 📌 **Best for**: Understanding sorting-based methods to rank elements.
- 🧪 **Output**: Sorted array + second smallest element.

---

### 📄 2. `SecondSmallestElementUsingLimitedSort.java`
- ⚡ **Logic**: Sorts only the first two smallest elements by limiting the number of iterations.
- 🚀 More efficient than full sorting for large arrays.
- 📌 **Best for**: Learning how partial sorting can solve specific problems faster.
- 🧪 **Output**: Partially sorted array + second smallest element.

---

## 🧾 Sample Array
int[] a = {11, 13, 9, 15, 4, 7};
### 🖥️ Sample Output
Sorted array in ascending order: 4  7  9  11  13  15   
Second smallest number in array is: 7   
or  
Partially sorted array (top 2 smallest elements): 4  7  9  15  13  11  
Second smallest number in array is: 7
### 📚 Key Concepts Practiced
#### ✅ Bubble Sort (Full vs Limited)
#### ✅ Array Traversal & Index Access
#### ✅ Conditional Swapping
#### ✅ Efficient Logic Building for Competitive Programming
#### ✅ Edge Case Handling (small arrays)

### 🧠 Learning Use-Cases
Concept	Covered In
#### Basic Sorting Logic	SecondSmallestElementUsingBubbleSort.java
#### Optimization via Early Exit	SecondSmallestElementUsingLimitedSort.java
#### Performance Understanding	Comparison between both implementations

### 💡 Future Improvements
#### ✅ Add a third version using single-pass traversal (without sorting).

#### ✅ Handle duplicate elements (e.g., if two smallest values are the same).

#### ✅ Use Arrays.sort() to simplify logic (optional for beginners).

## 👨‍💻 Author : Ikramullah Jamali
