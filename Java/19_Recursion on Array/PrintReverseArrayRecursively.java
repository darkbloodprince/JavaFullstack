/*Print Reverse Array Recursively
You are given an array arr of n elements, you are required to print all the n elements but in a reverse order, in a single line.

Note: Print the elements using a Recursive approach and not using loops(for, while, etc).

Input Format
First line contains an integer n which is the number of elements.

Second line contains n space separated integers.

Output Format
Print all the n elements but in reverse space-separated in a single line

Example 1
Input

4
1 2 3 4
Output

4 3 2 1
Constraints
1 <= n <= 1000

0 <= arr[i] <= 1000
Approach 1:

We need to print all the elements of array in reverse order, using recursion, we do this by identifying the base case and subproblem. Base Case: We are traversed all the elements, i == n SubProblem: Print the current element and make a recursive call to print rest of the array.

Using these we make our Recursive solution, by making a recursive call for remaining elements first and then printing the current element, if iterator reaches the end of array, we return.

Time Complexity: O(n), since we are basically doing array traversal of size n

Space Complexity: O(n), the size of function call stack is based on input size.

Below is the implementation of the above idea:

1. Java*/


import java.util.*; // Import the Scanner class and other utility classes

public class PrintReverseArrayRecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        
        int n = sc.nextInt(); // Read an integer n (size of the array)
        int[] arr = new int[n]; // Create an integer array of size n

        // Read n integers from the user and store them in the array
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Call the method to print the array in reverse order
        PrintReverseArray(arr, n);
    }

    // This method serves as a wrapper to start the recursive function
    public static void PrintReverseArray(int[] arr, int n) {
        PrintReverseArrayRecursive(arr, 0, n); // Start recursion from index 0
    }

    // Recursive method to print the array in reverse order
    private static void PrintReverseArrayRecursive(int[] arr, int i, int n) {
        if(i == n) // Base case: if index reaches the end of the array, stop recursion
            return;

        // Recursive call with the next index
        PrintReverseArrayRecursive(arr, i+1, n);

        // After returning from the deeper recursive call, print the current element
        // This ensures elements are printed in reverse order
        System.out.print(arr[i] + " ");
    }
}
