/*2nd Largest from array
Given an unsorted array of size N find the 2nd largest element from the array without sorting the array.

Input Format
The first line contains a single integer N.

The second line consists of N integers of the array.

Output Format
Print the second largest number in the new line.

Example 1
Input

6
3 2 1 5 6 4
Output

5
Explanation

5 is the second largest element of the array.

Example 2
Input

9
10 1 7 2 5 6 8 9 3
Output

9
Explanation

9 is the Second largest element in the array

Constraints:
2 <= N <= 10^5

-10^5 <= N <= 10^5

Approach:
The idea is to sort the array in descending order and then return the second element which is not equal to the largest element from the sorted array.
Better Approach:
The approach is to traverse the array twice.
In the first traversal find the maximum element.
In the second traversal find the greatest element in the remaining excluding the previous greatest.

Time Complexity

O(n).

Space Complexity

O(1).

n is the number of elements in the array.

Best Approach:
In one traversal, find the maximum and second maximum element of the array by storing the current maximum and second maximum.
Whenever the maximum is encountered, change the previous maximum to second maximum.

Time Complexity

O(n).

Space Complexity

O(n).

n is the number of elements in the array..

Solution:*/
import java.io.*;   // Not used here but generally used for input/output operations
import java.util.*; // Required for Scanner and other utilities

public class ndLargestfromarray {

    // Function to find the second largest element in an array
    public static void SecondLargest(int[] arr, int n) {
        int max1, max2;  // max1 is the largest, max2 is the second largest

        // Step 1: Initialize max1 and max2 with first two elements
        if (arr[0] >= arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }

        // Step 2: Traverse the rest of the array
        for (int i = 1; i < n; i++) {
            // If current element is greater than both max1 and max2
            if (arr[i] > max1 && arr[i] > max2) {
                max2 = max1;     // Promote previous max1 to max2
                max1 = arr[i];   // Update max1
            } 
            // If current element is between max1 and max2, update max2
            else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        // Print the second largest value
        System.out.println(max2); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        int n = sc.nextInt();

        // Create array of size n
        int[] arr = new int[n];

        // Read n integers into array
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
            
        // Call function to compute second largest
        SecondLargest(arr, n);
        
        sc.close();  // Close scanner
    }
}