/*Maximum of Array
You are given an array arr of length n. You have to find the maximum element of the array.

Note

You have to use Recursion.

Input Format
The first line of input contains an integer n, size of the array.

The next line contains n space seperated integers denoting the elements of the array.

Output Format
Print single integer representing maximum of the given array

Example 1
Input

3
2 3 10
Output

10
Explanation

10 is maximum among 2,3 and 10.

Example 2
Input

4
1 3 5 7
Output

7
Explanation

7 is maximum among 1,3,5 and 7.

Constraints
0 <= nums.length <= 100

0 <= nums[i] <= 100000
Hint 1
The key to solving a problem recursively is to recognize that it can be broken down into a collection of smaller sub-problems, to each of which that same general solving procedure that we are seeking applies, and the total solution is then found in some simple way from those sub-problems' solutions. Each of thus created sub-problems being smaller guarantees that the base case(s) will eventually be reached.

Approach :
The idea is to represent a problem in terms of one or more smaller problems, and add one or more base conditions that stop the recursion. For example, in this case for i=n-1, the base case will hit and for that case we will simply return the ith element.

Time Complexity

O(N).

Space Complexity

O(N), considering the recursive calls.

Below is the implementation of above idea:

1. Java*/
import java.io.*;
import java.util.Scanner;

public class MaximumofArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object to take input

        int n = sc.nextInt();  // Read size of the array
        int[] nums = new int[n];  // Declare an array of size n

        // Read n integers from input into nums[]
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call maxElement() to find the maximum element in the array
        int result = maxElement(nums);

        // Print the result (maximum value)
        System.out.print(result);
    }


    // Recursive function to find the maximum element in an array
    public static int recursiveFuntion(int arr[], int n, int i) {
        // Base case: If we reach the last element of the array
        if (i == n - 1) {
            return arr[i];   // Return the last element
        } else {
            // Recursively call function to find max from the remaining elements
            int recMax = recursiveFuntion(arr, n, i + 1);

            // Compare current element arr[i] with the max from the rest of the array
            return Math.max(recMax, arr[i]);
        }
    }

    // Wrapper function that starts the recursion
    public static int maxElement(int[] arr) {
        int n = arr.length;
        // Start recursion from index 0
        return recursiveFuntion(arr, n, 0);
    }
}
