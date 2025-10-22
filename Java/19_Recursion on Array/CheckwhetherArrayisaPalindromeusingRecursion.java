/*Check whether Array is a Palindrome using Recursion
Given an array arr of length n, you have to find whether the given array is a palindrome using recursion.

Note: A palindrome is an array which reads the same both forwards and backwards.

Input Format
First line consists of an integer n, the number of elements in the array

Second line consists of n spaced inetegrs, representing the array arr.

Output Format
Print true if the array is a palindrome else print false.

Example 1
Input

4
4 3 2 10
Output

false
Explanation

Backwards, it reads 10, 2, 3, 4 which is not the same

Example 2
Input

5
1 2 3 2 1
Output

true
Explanation

Backwards it reads 1, 2, 3, 2 1 which is the same.

Constraints
1 <= n <= 10^3

-10^4 <= arr[i] <= 10^4
Hint 1
Recurse the array and compare the indices at the current location and from he same distance from the end.

Approach: Recursive

Base case: If array has only one element i.e. begin == end then return 1, also if begin>end which means the array is palindrome then also return 1.

If the first and the last elements are equal then recursively call the function again but increment begin by 1 and decrement end by 1.

If the first and last element is not equal then return 0.

Time Complexity: O(n)

Space Complexity: O(n)

Below is the implementation of the above approach:

1. Java*/
import java.util.*;

public class CheckwhetherArrayisaPalindromeusingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read array size
        int n = sc.nextInt();
        
        // Declare array of size n
        int[] arr = new int[n];
        
        // Read n elements into the array
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        sc.close();
       
        // Call isPalindrome to check if array is palindrome
        System.out.println(isPalindrome(arr, n));
    }

    // Wrapper function: takes array and its size 'n'
    public static boolean isPalindrome(int[] arr, int n) {
        // Call helper function with start index = 0 and end index = n-1
        int res = isPalindromic(arr, 0, n - 1);
        
        // If helper returns 1 → palindrome, else not
        if (res == 1)
            return true;
        return false;
    }

    // Recursive helper function that checks if array[begin..end] is palindrome
    public static int isPalindromic(int[] arr, int begin, int end) {
        // Base case: if pointers cross or meet, it means all checks passed
        if (begin >= end) {
            return 1; // 1 means true (palindrome so far)
        }
        
        // If current elements match, move inward (recursion)
        if (arr[begin] == arr[end]) {
            return isPalindromic(arr, begin + 1, end - 1);
        } else {
            // If mismatch found, return 0 (false)
            return 0;
        }
    }
}
