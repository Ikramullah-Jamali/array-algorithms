## 📌 KthElementInArray

This folder contains two beginner-friendly Java programs to find:

- ✅ **Kth Largest Element** in an array
- ✅ **Kth Smallest Element** in an array

Both programs use **basic sorting logic** without any advanced libraries or data structures.
Perfect for students learning sorting, arrays, and indexing in Java.

---

## 📂 Files Included

|           File Name             |               Description                       |
|---------------------------------|-------------------------------------------------|
| `KthLargestNumberInArray.java`  | Finds the Kth **Largest** element in an array   |
| `KthSmallestNumberInArray.java` | Finds the Kth **Smallest** element in an array  |

---

## 🔎 Problem Statement 

 Given an unsorted array of integers and a number `k`, find the `k`th **largest** or **smallest** element in the array. 

---

## 💡 Approach 

- Sort the array in **descending** order to find the Kth **largest** 
- Sort the array in **ascending** order to find the Kth **smallest** 
- Use simple nested loops (basic sorting logic) 
- Access the `k - 1` index after sorting 

---

## 🧪 Example Output 

## For `KthLargestNumberInArray.java`  
Input: [19, 20, 37, 10, 8, 3, 21] 
k = 4 

Output: 
4 largest element is 19 
Sorted array: 37 21 20 19 10 8 3 
## For KthSmallestNumberInArray.java  
Input: [19, 24, 17, 81, 62, 93, 26] 
k = 3 

Output: 
3 Smallest element is 24 
Sorted array: 17 19 24 26 62 81 93 
⚠️ Input Validation 
Both programs check if k is: 
Greater than 0 
Less than or equal to array length 
Invalid inputs will show an appropriate message. 

## 👨‍💻 Author : Ikramullah Jamali
