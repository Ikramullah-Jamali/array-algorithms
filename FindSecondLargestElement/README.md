# 🔢 Find Second Largest Element in an Array 

This folder contains three Java programs that demonstrate different approaches to finding the **second largest element** in an array.  
Each method is designed to build logic, compare performance, and improve array-handling skills.  

--- 

## 📂 File Overview  

## 1️⃣ `SecondLargestElementUsingBubbleSort.java` 
- **Approach:** Sorts the entire array in descending order using nested loops. 
- **Logic:** The second element (`a[1]`) after sorting is the second largest. 
- **Use Case:** Good for understanding sorting mechanics. 
- **Time Complexity:** `O(n²)` 
- **Drawback:** Slower and not ideal for large arrays. 

--- 

## 2️⃣ `SecondLargestElementUsingLimitedSort.java` 
- **Approach:** Only sorts the top two elements by breaking early after two passes. 
- **Logic:** Uses the same logic as full sort but stops after sorting top 2 elements. 
- **Use Case:** Introduces basic optimization to reduce unnecessary sorting. 
- **Time Complexity:** Still `O(n²)`, but fewer operations. 
- **Note:** May not be reliable for arrays with many duplicates or unsorted clusters. 

---

## 3️⃣ `SecondLargestElementBySinglePass.java` 
- **Approach:** Uses a single loop to find the largest and second largest elements. 
- **Logic:** Tracks `largest` and `secondLargest` values in one pass. 
- **Use Case:** Best choice for interviews and real-world problems. 
- **Time Complexity:** `O(n)` – most efficient. 
- **Advantage:** No sorting, works well with any input size or order. 

---

## 🧪 Example 

int[] a = {11, 6, 9, 15, 4, 7}; 
=> Sample Output: 
Sorted array in descending order: 15 11 9 7 6 4  
Second largest number in array is: 11 
## ✅ Summary 
#### File Name	                              |   Strategy         |	 Time Complexity	Best For
SecondLargestElementUsingBubbleSort.java      |   Full Sort        |	 O(n²)	Learning sorting
SecondLargestElementUsingLimitedSort.java	    |   Partial Sort     |	 O(n²) (faster)	Exploring minor optimization
SecondLargestElementBySinglePass.java	        |   Single-Pass Scan |	 O(n)	Interviews & real-world use

#### This is part of my learning journey to improve Java & DSA problem-solving through hands-on coding.

## 🙋‍♂️ Author : Ikramullah Jamali

