/*Bubble Sort Problem
Consider the following version of Bubble Sort:

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
            swap(a[j], a[j + 1]);
        }
    }
}
Print three values in separate lines:

Number of swaps it took to sort the array using the above algorithm.

First element in the array after sorting the array.

Last element in the array after sorting the array.

Input Format
The first line contains an integer, n, the size of the array a.

The second line contains n space-separated integers representing array a .

Output Format
Print the required three values.

Example 1
Input

3
6 4 1
Output

3
1
6
Explanation

[6,4,1]

swap    a       
0       [6,4,1]
1       [4,6,1]
2       [4,1,6]
3       [1,4,6]

The steps of the bubble sort are shown above. It took 3 swaps to sort the array.

Example 2
Input

3
1 2 3
Output

0
1
3
Explanation

Array is sorted in 0 swaps.

First Element: 1

Last Element: 3

Constraints
2 <= n <= 600

1 <= a[i] <= 2*10^6
Approach
Algorithm:

Apply the given algorithm on the array.
Keep a count variable and update it everytime you make a swap.

Time Complexity

O(n^2), as we are using nested loops

Space Complexity

O(1)

Solution:

1. Java*/
import java.io.*;
import java.util.*;
// Importing required classes: java.util for Scanner, java.io is not used but included
public class BubbleSortProblem {
    // Main class
static void bubbleSort(int a[], int n)
{
    // This method performs bubble sort on array 'a' of size 'n'
    int cnt = 0;
    // Variable to count the number of swaps made during sorting
    for(int i = 0; i < n; i++){
        // Outer loop for passes over the array (n times)
        for(int j = 0; j < n - 1; j++){
            // Inner loop for comparing adjacent elements
            if(a[j] > a[j + 1]){
                // If the left element is greater than the right, swap them
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
                cnt++; // Increment the swap counter
            }
        }
    }
    System.out.println(cnt);
    // Print the number of swaps made

    System.out.println(a[0]);
    // Print the first (minimum) element after sorting

    System.out.println(a[n - 1]);
    // Print the last (maximum) element after sorting
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Create a Scanner object to read input

    int n;
    n = sc.nextInt();
    // Read the size of the array
    int arr1[] = new int[n];
    // Declare an array of size n

    for(int i = 0; i < n; i++)
        arr1[i] = sc.nextInt();
    // Read n integers into the array from user input
    bubbleSort(arr1, n);
    // Call the bubbleSort method to sort the array and print swap count, min, and max
}
