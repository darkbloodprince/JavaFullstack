/*Implementing Selection Sort
Given an array arr of size n, containing positive integers. You need to sort the elements of array using the Selection Sort algorithm.

Input Format
First line contains an integer n which is the size of array arr

Second line contains n space separated integers of arr

Output Format
Return the sorted array

Example 1
Input

5
4 1 3 9 7
Output

1 3 4 7 9
Explanation

The array after performing Selection sort: 1 3 4 7 9.

Example 2
Input

10
10 9 8 7 6 5 4 3 2 1
Output

1 2 3 4 5 6 7 8 9 10
Constraints
1 <= n <= 104

-106 <= A[i] <= 106
Approach 1:

Selection sort is a sorting algorithm in which for iteration we find the minimum element in the unsorted part of the array, and place it in the starting of the unsorted array, reducing the size of unsorted part.

Algorithm:

Set the first element as minimum.
Compare minimum with the second element. If the second element is smaller than minimum, assign the second element as minimum. Compare minimum with the third element. Again, if the third element is smaller, then assign minimum to the third element otherwise do nothing. The process goes on until the last element.
After each iteration, minimum is placed in the front of the unsorted list.
For each iteration, indexing starts from the first unsorted element. Step 1 to 3 are repeated until all the elements are placed at their correct positions.
Time Complexity: O(n^2) Space Complexity: O(1)

Below is the implementation of the above idea:

Java*/
import java.util.*;
// Importing the java.util package to use the Scanner class for user input
public class ImplementingSelectionSort {
    // Declaring the Main class which contains the sorting logic and the main method
public static int[] SelectionSort(int[] arr) {
    // This method sorts the array 'arr' using Selection Sort and returns the sorted array

    int n = arr.length;
    // Get the length of the array
    for (int i = 0; i < n - 1; i++) {
        // Outer loop: iterates over each index of the array except the last
        int min_idx = i;
        // Assume the current index 'i' is the index of the smallest element
        for (int j = i + 1; j < n; j++) {
            // Inner loop: checks elements to the right of 'i' to find the minimum element
            if (arr[j] < arr[min_idx])
                min_idx = j;
                // If a smaller element is found, update 'min_idx'
        }
        // Swap the found minimum element with the element at index 'i'
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
    }
    return arr;
    // Return the sorted array
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Create a Scanner object to take input from the user
    int n = sc.nextInt();
    // Read the number of elements (size of array)

    int[] arr = new int[n];
    // Declare an integer array of size 'n'
    for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
    // Read 'n' integers from the user and store them in the array
    int[] ans = SelectionSort(arr);
    // Call the SelectionSort method and store the sorted array in 'ans'
    for(int a : ans)
        System.out.print(a + " ");
    // Print each element of the sorted array using an enhanced for loop
}
