# 🚀 Remove Duplicate Elements from Array  

Welcome to the removeduplicteelementsfromarray folder in the arrayalgorithim repository!  
🎉 This folder has three cool Java programs that kick out duplicate numbers from arrays. 
😎 Each program uses a different trick to make arrays unique, and they work with sorted or unsorted arrays. Let’s dive in! 

## 📦 What’s Inside?  
Here are the three programs, each doing something awesome to remove duplicates:
### 🛠️ 1. RemoveDuplicateElementsInPlace.java  
What it does: Takes a sorted array and removes duplicates by changing the original array (no extra space needed!). 
How it works: Compares each number with the next one and keeps only unique numbers at the start of the array. 
✅ Example: 
Input: {1, 2, 2, 3, 4, 5, 5, 5} 
Output: 1 2 3 4 5 
Note: Your array must be sorted (numbers in order). 
### 📋 2. RemoveDuplicatesUsingTempArray.java 
What it does: Removes duplicates from a sorted array by copying unique numbers to a new array. 
How it works: Checks for unique numbers and stores them in a temporary array, then prints them. 
✅Example: 
Input: {1, 2, 2, 3, 4, 5, 5, 5} 
Output: 1 2 3 4 5  
#### Note: Your array must be sorted. Also, there’s a small fix: change System.out.print() to System.out.println() at the end for a clean newline. 
### 🌈 3. RemoveDuplicatesFromUnsortedArray.java  
What it does: Removes duplicates from an unsorted array using a HashSet (a special Java tool that keeps only unique items).  
How it works: Adds all numbers to a HashSet, which automatically removes duplicates, then prints them. 
✅Example: 
Input: {1, 4, 2, 3, 4, 5, 2, 5} 
Output: 1 2 3 4 5 (order might be different, like 2 1 4 3 5)  
#### Note: Works with unsorted arrays, but the output order may vary. 
#### 🎉The program will print the unique numbers in the array! 
## 📝Quick Tips 
=> The first two programs (RemoveDuplicateElementsInPlace.java and RemoveDuplicatesUsingTempArray.java) need a sorted array (numbers in order, like 1, 2, 2, 3).
=> The third program (RemoveDuplicatesFromUnsortedArray.java) works with unsorted arrays (like 1, 4, 2, 3).
=> For RemoveDuplicatesUsingTempArray.java, make sure the last line is System.out.println(); (not System.out.print();) to avoid errors.
=> The output for the unsorted array program might not match the input order because HashSet shuffles things up.
=>😄 Happy coding! 
## Auther: Ikramullah Jamali
