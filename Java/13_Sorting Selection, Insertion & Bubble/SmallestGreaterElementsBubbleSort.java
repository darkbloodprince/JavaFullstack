/*Smallest Greater Elements - Bubble Sort
Given an array arr of size n. You are required to find Smallest greater elements for all elements in arr. If there is no such element for some element in arr then put its smallest greater element as -10000000.

Note: You have to do this question using Bubble Sort

Input Format
First line contains an integer n which is the size of the array.

Second line contains n space separated integers of array arr

Output Format
Return an array of n elements which contains smallest greater elements of each of the n elements of arr

Example 1
Input

4
13 6 17 12
Output

17 12 -10000000 13
Example 2
Input

9
6 3 9 8 10 2 1 15 7
Output

7 6 10 9 15 3 2 -10000000 8
Constraints
1 <= n <= 10000

-106 <= arr[i] <= 106
Approach 1:
We need to find an array ans which contains next greater element of that element in given array arr. So if we sort the given array arr, and then iterate to right side we will find the required net greater element(if any).

So first we sort the array using Bubble Sort and store it in array sortedArr.

Then for each element in given array, we first find that element in sortedArray, and then iterate to find the next greater element. If we are at the biggest element we won't find any next greater element, so we just mark its ans as -10000000.

Time Complexity:

O(n^2) ,since bubble sort has this time complexity

Space Complexity:

O(n) ,since we are declaring arrays whose size is dependent on the input size.

Below is the implementation of the above idea:

1. Java*/
import java.util.*;
// Importing java.util package for Scanner and Arrays
public class SmallestGreaterElementsBubbleSort {
    // Main class definition
static int[] bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++)
        for (int j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1]) {
                // Swap if current element is greater than next
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
    return arr;
}
public static int[] SmallestGreaterElements(int[] arr) {
    int len = arr.length;

    int[] originalArr = Arrays.copyOf(arr, len);
    // Copy the original array to preserve input order

    int[] sortedArr = bubbleSort(arr);
    // Sort the array using bubble sort

    int[] ans = new int[len];
    // Output array to store the result
    for(int j = 0; j < len; j++) {
        // Loop through each element in the original array
        for(int i = 0; i < len; i++) {
            // Search the index of originalArr[j] in the sorted array
            if(sortedArr[i] == originalArr[j]) {
                while(i < len && sortedArr[i] == originalArr[j]) {
                    i++;
                    // Skip all duplicates
                }

                if(i < len)
                    ans[j] = sortedArr[i];
                    // Found a greater element → store it
                else
                    ans[j] = -10000000;
                    // No greater element found → use sentinel value
            }
        }
    }

    return ans;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // Read number of elements
    int[] arr = new int[n];
    for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
    // Input array elements
    int[] ans = SmallestGreaterElements(arr);
    // Call the function to get result

    for(int a : ans) {
        System.out.print(a + " ");
    }
    // Print the answer array
}
