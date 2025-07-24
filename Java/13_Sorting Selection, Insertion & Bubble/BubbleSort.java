/*Bubble Sort
Given an Integer N and a list arr. Sort the array using bubble sort algorithm.. First take input of size of the array i.e. N, followed by N numbers which represent the array elements.

Note: Use of inbuilt sort function is not permitted.

Time complexity: There are N elements in the array and for every element we make N iterations , hence N*N iterations which gives us a Time complexity of O(N^2) in the worst case.

Space Complexity: Since this algorithm works without the use of any additional storage space apart from the input, we can say that the Space Complexity will be O(1)

Input Format
First line contains integer N denoting the size of array arr[]

Second line contains N array integers each separated by a space denoting elements of arr[]

Output Format
Output N integers of the sorted array separated by a space in a single line

Example 1
Input

5
1 4 3 7 2
Output

1 2 3 4 7
Explanation

1<2<3<4<7

Example 2
Input

6
5 2 1 4 6 3 
Output

1 2 3 4 5 6
Explanation

1<2<3<4<5<6

Constraints
1 <= n <= 1000

1 <= arr[i] <= 1000
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

Consider an array arr[] = {5, 1, 4, 2, 8}

First Pass:

Bubble sort starts with very first two elements, comparing them to check which one is greater.

( 5 1 4 2 8 ) --> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.

( 1 5 4 2 8 ) --> ( 1 4 5 2 8 ), Swap since 5 > 4

( 1 4 5 2 8 ) --> ( 1 4 2 5 8 ), Swap since 5 > 2

( 1 4 2 5 8 ) --> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

Second Pass:

Now, during second iteration it should look like this:

( 1 4 2 5 8 ) --> ( 1 4 2 5 8 )

( 1 4 2 5 8 ) --> ( 1 2 4 5 8 ), Swap since 4 > 2

( 1 2 4 5 8 ) --> ( 1 2 4 5 8 )

( 1 2 4 5 8 ) --> ( 1 2 4 5 8 )

Third Pass:

Now, the array is already sorted, but our algorithm does not know if it is completed.

The algorithm needs one whole pass without any swap to know it is sorted.

( 1 2 4 5 8 ) --> ( 1 2 4 5 8 )

( 1 2 4 5 8 ) --> ( 1 2 4 5 8 )

( 1 2 4 5 8 ) --> ( 1 2 4 5 8 )

( 1 2 4 5 8 ) --> ( 1 2 4 5 8 )

Time Complexity

O(n ^ 2)

Space Complexity

O(1)

Below is the implementation of the above approach:

1. Java*/
import java.util.*;
// Importing all classes from java.util package, used here for Scanner
public class BubbleSort {
    // Main class declaration
    public static void main(String[] args) {
        // Main method - entry point of the program
        Scanner sc = new Scanner(System.in);
        // Creating Scanner object to read input from the user
        int N = sc.nextInt();
        // Reading the size of the array from user input and storing it in variable N
        int arr[] = new int[N];
        // Declaring an integer array of size N
        // Input of array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // Loop to take N integers as input and store them in the array 'arr'
        // bubble sort in descending order
        bubbleSort(N, arr);
        // Calling bubbleSort function to sort the array
        // printing array elements
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        // Loop to print the sorted array elements, space-separated
    }
    public static void bubbleSort(int N, int[] arr) {
        // A method to perform bubble sort on an integer array
        for (int i = 0; i < N - 1; i++) {
            // Outer loop for number of passes needed in bubble sort
            for (int j = 0; j < N - 1 - i; j++) {
                // Inner loop to compare and swap adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // If the current element is greater than the next element (for ascending sort)
                    int temp = arr[j];      // Store arr[j] in temp
                    arr[j] = arr[j + 1];    // Copy arr[j+1] to arr[j]
                    arr[j + 1] = temp;      // Copy temp (old arr[j]) to arr[j+1]
                }
            }
        }
    }
}
