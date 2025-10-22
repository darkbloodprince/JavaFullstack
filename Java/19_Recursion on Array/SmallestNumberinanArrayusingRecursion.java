/*Smallest Number in an Array using Recursion
Given an array arr of length n, you have to find the minimum element present in the array using recursion.

Input Format
First line consists of an integer n, the number of elements in the array

Second line consists of n spaced inetegrs, representing the array arr.

Output Format
Return the minimum element of the array.

Example 1
Input

3
1 2 3
Output

1
Explanation

1 is the smallest among 1, 2 and 3.

Example 2
Input

5
5 4 0 -8 67
Output

-8
Explanation

-8 is the smallest among 5, 4, 0, -8 and 67

Constraints
1 <= n <= 10^3

-10^4 <= arr[i] <= 10^4
Hint 1
Recurse the array, maintaining a min variable and updating at each step

Approach: Recursive

Traverse the array recursively and maintain a minimum variable, updating it at each element.

Time Complexity: O(n)

Space Complexity: O(n)

Below is the implementation of the above approach:

1. Java*/


import java.util.*;
// Importing java.util package to use Scanner for taking input.
public class SmallestNumberinanArrayusingRecursion {
    // Main class — program execution starts here.
    public static void main(String[] args) {
        // The main() method — entry point of the program.
        Scanner sc = new Scanner(System.in);
        // Create a Scanner object to read input from the user.
        int n = sc.nextInt();
        // Read the size of the array (number of elements).
        int[] arr = new int[n];
        // Declare an integer array of size 'n'.
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Loop through the array and take 'n' integer inputs from the user.
        sc.close();
        // Close the Scanner object to prevent resource leaks.
        System.out.println(recforMin(arr, n));
        // Call the recursive function 'recforMin' with the array and its size 'n'.
        // Print the smallest (minimum) element returned by the function.
    }
    public static int recforMin(int[] arr, int n) {
        // Recursive method to find the minimum element in the array.
        // Parameters:
        // arr -> the input array
        // n   -> the number of elements to consider (starting from n, decreasing each call)
        if (n == 1)
            return arr[0];
        // Base case:
        // When there’s only one element left (n == 1),
        // that element is the minimum by default.
        return Math.min(arr[n - 1], recforMin(arr, n - 1));
        // Recursive step:
        // Compare the last element (arr[n - 1]) with the minimum of the rest of the array.
        // 'recforMin(arr, n - 1)' gives the minimum of the first (n-1) elements.
        // Math.min() picks the smaller of the two.
    }
}
