/*Insertion Sort
Implement insertion sort.

Input Format
The first line  contains one space separated integer N denoting the number of elements.

The Second line  contains N space separated integers denoting the elements of the array.

You need to complete insertionSort function which contains a array of size n and print the final sorted array in this function only.

Output Format
Print the array in sorted fashion in sorted fashion.

Example 1
Input

 6
 7 6 8 5 4 9
Output

 4 5 6 7 8 9
Explanation

Printed sorted array.

Example 2
Input

 5
 11 5 12 6 13
Output

5 6 11 12 13
Explanation

Printed sorted array.

Constraints
0 <= nums.length <= 10^4

-10^9 <= nums[i] <= 10^9
Approach 1:
It is a sorting Algorithm that works similar to sorting cards. The array is split into sorted and unsorted part. Pick values from the unsorted part and place it at the correct position in the sorted part.
Algorithm:

Iterate from arr[1] to arr[N] over the array.
Compare the current element to its predecessor.
If the key element is smaller than its predecessor, compare it to the elements before.
Move the greater elements one position up to make space for the swapped element.
Time Complexity : O(N^2) where N is the size of array. It takes maximum time for reverse sorted array as every element need to be compared with every other element. The minimum time is taken in case of an already sorted array: O(N).

Space Complexty: O(1).

Below is the implementation of above idea:

1. Java*/
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int n = sc.nextInt();

        // Create an array of size n
        int array[] = new int[n];

        // Read n elements into the array
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Call insertionSort method to sort the array
        insertionSort(array, n);
    }

    // Method to perform insertion sort
    static void insertionSort(int a[], int n) {
        // Start from the second element since the first is considered sorted
        for (int i = 1; i < n; ++i) {
            int key = a[i];   // The element to be inserted into the sorted part
            int j = i - 1;    // Index of the last element in the sorted part

            // Shift elements of a[0..i-1] that are greater than key to one position ahead
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];  // Shift the element right
                j = j - 1;        // Move left in the sorted part
            }

            // Place the key at its correct sorted position
            a[j + 1] = key;
        }

        // Print the sorted array
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();  // Print newline
    }
}
