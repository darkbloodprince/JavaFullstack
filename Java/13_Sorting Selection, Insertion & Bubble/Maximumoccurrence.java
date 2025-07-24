/*Maximum occurrence
You are given an array arr of length n. Your task is to print the element which has maximum occurrences in the array. If two elements have the same occurrence then print the smaller element

Input Format
The first line of input contains an integer n, size of the array.

The next line contains n space seperated integers denoting the elements of the array.

Output Format
Print single integer denoting the maximum occurring element in the array.

Example 1
Input

8
7 7 6 4 8 7 3 1
Output

7
Explanation

We have arr = [7 7 6 4 8 7 3 1]

As 7 is occurring 3

Example 2
Input

7
9 8 1 1 2 2 3
Output

1
Explanation

1 and 2 have smae occurrence that is 2 so print smaller element i.e. 1.

Constraints
1 <= n <= 10^6

1 <= arr[i] <= 10^9
Approach 1: Using sorting
Sort the array and count the frequency of each element and update accordingly.

Algorithm:

Sort the array.
Maintain temp_count, max_count and ans which stores the frequency of the current element, maximum frequency occured till now and the element with maximum respectively.

Time Complexity

O(nlogn) as we are sorting the array.

Space Complexity

O(1) as no extra data structure is used.

Below is the implementation of above idea:

1. Java*/
import java.util.*;
// Importing utility package; used here for Arrays.sort() and Scanner
public class Maximumoccurrence {
    // Main class
static int maximum_occurrence(int arr[], int n) {
    // This function finds the element with the maximum occurrences in a sorted array
    Arrays.sort(arr);
    // First, sort the array so that equal elements are grouped together
    int temp_count = 0, max_count = 0, ans = arr[0];
    // temp_count tracks current streak of identical numbers
    // max_count tracks the highest frequency found so far
    // ans stores the element with the maximum frequency (initially first element)
    for (int i = 0; i < n - 1; i++) {
        if (arr[i] == arr[i + 1]) {
            temp_count++;
            // If current and next element are same, increment temp_count
        } else {
            if (temp_count > max_count) {
                max_count = temp_count;
                ans = arr[i];
                // If current streak is greater than max_count, update result
            }
            temp_count = 0;
            // Reset temp_count when sequence breaks
        }
    }
// After the loop, we need to check the last group
if (temp_count > max_count) {
    ans = arr[n - 1];
}
    return ans;
    // Return the most frequent element (smallest one in case of tie is handled by sorting)
}
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // Create Scanner object for user input
    int n = sc.nextInt();
    // Read the size of the array

    int[] arr = new int[n];
    // Declare an integer array of size 'n'
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    // Read n elements into the array from the user
    System.out.print(maximum_occurrence(arr, n));
    // Call the function and print the result
}
