/*Array11
Given an array of integers. Compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in the index as 0.

array11([1, 2, 11], 0) → 1
array11([11, 11], 0) → 2
array11([1, 2, 3, 4], 0) → 0

Input Format
The first line contains the number n, the size of the array

The second line contains N integers

You need to complete the array11 function, which contains the nums array of size N and an integer index and finally returns the answer.

Output Format
Print the number of 11 in the array.

Example 1
Input

5
1 3 11 11 2
Output

2
Explanation

11 occur twice

Example 2
Input

6
1 8 9 12 11
Output

1
Explanation

11 occur once

Constraints
2 <= N <= 3000

0 <= A[i] <= 5000
Hint 1
Try to recursively see each element

Approach 1
Check for each element of array recursively and if it's 11, we add +1 to total count, and keep searching in rest of the array.

The algorithm can be summarised as -

If reached end of array, return 0.
If array[i] is 11, return 1 + array11(arr, i+1).
Else simply return the count of 11 in rest of the array using `return array11(arr, i+1).
Time Complexity

O(n) where n is the size of array.

Space Complexity

O(n) where n is the size of array.

Below is the implementation of above idea:

1. Java*/

import java.util.*;  
// Importing the java.util package for using the Scanner class
public class Array11 {
    // Class name: Array11
    static int array11(int[] nums, int index) {
        // Recursive method that counts how many times '11' appears in the array
        // Parameters:
        // nums  -> input array of integers
        // index -> current position in the array
        if (index > nums.length - 1) return 0;
        // Base condition: 
        // If the current index is beyond the last index of the array,
        // return 0 because there are no more elements to check.
        if (nums[index] == 11)
            return 1 + array11(nums, index + 1);
        // If the current element is 11:
        // Add 1 (since we found one occurrence of 11)
        // and recursively call the same method for the next index.
        return array11(nums, index + 1);
        // If the current element is not 11:
        // Just skip it and check the rest of the array by moving to the next index.
    }
    public static void main(String[] args) throws Throwable {
        // The main method — program execution starts here
        Scanner sc = new Scanner(System.in);
        // Scanner object to take input from the user
        int n = sc.nextInt();
        // Read the size of the array (number of elements)
        int[] arr = new int[n];
        // Declare an integer array of size n
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Read n integers from user input and store them in the array
        System.out.println(array11(arr, 0));
        // Call the recursive method starting from index 0
        // and print the count of how many times '11' appears in the array
    }
}
