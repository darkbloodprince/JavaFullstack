/*Print Array Recursively
You are given an array arr of n elements, you are required to print all the n elements in a single line.

Note: Print the elements using a Recursive approach and not using loops(for, while, etc).

Input Format
First line contains an integer n which is the number of elements.

Second line contains n space separated integers.

Output Format
Print all the n elements space-separated in a single line

Example 1
Input

4
1 2 3 4
Output

1 2 3 4
Constraints
1 <= n <= 1000

0 <= arr[i] <= 1000
Hint 2
Identify the base condition

Approach 1:

We need to print all the elements of array using recursion, we do this by identifying the base case and subproblem. Base Case: We are traversed all the elements, i == n SubProblem: Print the current element and make a recursive call to print rest of the array.

Using these we make our Recursive solution, by printing the current element and making a recursive call for remaining elements, if iterator reaches the end of array, we return.

Time Complexity : O(n) , since we are basically doing array traversal of size n

Space Complexity : O(n) , the size of function call stack is based on input size.

Below is the implementation of the above idea:

1. Java*/
import java.util.*;


public class PrintArrayRecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintArray(arr, n);
    }

	public static void PrintArray(int[] arr, int n) {
       PrintArrayRecursive(arr, 0, n);
    }

    private static void PrintArrayRecursive(int[] arr, int i, int n) {
        if(i == n)
            return;
        System.out.print(arr[i] + " ");
        PrintArrayRecursive(arr, i+1, n);
    }
}