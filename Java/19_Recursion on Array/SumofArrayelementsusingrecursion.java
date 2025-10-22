/*Sum of Array elements using recursion
Given an array of integers, find sum of array elements using recursion.

Input Format
Input consists of a 2 lines.

First line contains n.

Second line contains n spaced integers.

Output Format
Return the sum of array elements.

EXAMPLE 1
Input:

4
1 2 3 4
Output::

10
EXPLANATION:

1 + 2 + 3 + 4 = 10

EXAMPLE 2
Input:

3
1 3 3
Output::

7
EXPLANATION:

1 + 3 + 3 = 7.

CONSTRAINTS
1 <= n <= 10^5

-10^4 <= arr[i] <= 10^4
Hint 1
keep adding last element in each function.

Approach 1:
Keep adding last element in each function and keep reducing the size.

Algorithm:

return arr[n-1]+ sumofArrayRec(arr, n-1). where n is the size of the array.
Time Complexity

O(n).

Space Complexity

O(n) because of recursion stack.

Code:

1. Java*/

import java.util.*; // Import utility classes, including Scanner for input

public class SumofArrayelementsusingrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input
        
        int n = sc.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Create an integer array of size n
        
        // Read n integers from the user and store them in the array
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // Call the recursive function to calculate sum and print it
        System.out.println(sumofArrayRec(arr, n));
    }

    // Recursive function to calculate the sum of the first n elements of an array
    public static int sumofArrayRec(int[] arr, int n) {
        if (n <= 0) // Base case: if no elements are left, sum is 0
            return 0;
        
        // Recursive case:
        // sum of first n elements = last element (arr[n-1]) + sum of first n-1 elements
        return arr[n - 1] + sumofArrayRec(arr, n - 1);
    }
}
