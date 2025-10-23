/*String Palindrome
A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left. So given a string str, determine whether it is a palindrome or not.

Input Format
The first line of input contains string str.

Output Format
Print YES or NO.

EXAMPLE 1
Input

abba
Output

YES
Explanation

abba is a palindromic string.

Example 2
Input

geeks
Output

NO
Explanation

geeks is not a palindromic string.

Constraints
0 <= |str| <=10000
Hint 1
Use a two pointer recursion method

Approach :
The approach is very simple. Just like the two-pointer approach, we will check the first and the last value of the string but this time it will be through recursion.

Algorithm
We will take two pointers i pointing to the start of the string and j pointing to the end of the string.
Keep incrementing i and decrementing j while i < j and at every step
Check whether the characters at these pointers are the same or not. We are doing this through recursion – (i+1, j-1)
If all the characters are the same on the ith and jth index till i>=j condition satisfies, print true else false
Time Complexity

O(N).

Space Complexity

O(N), considering the recursive calls.

Below is the implementation of above idea:

1. Java*/
import java.io.*;
import java.util.Scanner;

public class StringPalindrome {

    // Recursive function to check if a substring of A from index i to j is a palindrome
    static boolean recursiveFuntion(String A, int i, int j) {
        // Base case: if the left index crosses or meets the right index, it means we checked all characters
        // and found no mismatch — so it's a palindrome.
        if (i >= j) {
            return true;
        }

        // If characters at the current ends don't match, it's not a palindrome
        if (A.charAt(i) != A.charAt(j)) {
            return false;
        }

        // Recursive case: move inward — check the next pair of characters
        return recursiveFuntion(A, i + 1, j - 1);
    }

    // Wrapper function that starts the recursion for the whole string
    static boolean isPalindrome(String str) {
        int n = str.length();
        // Call the recursive function with full string range (0 to n-1)
        return recursiveFuntion(str, 0, n - 1);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read a string from the user
        String str = sc.nextLine();

        // Check if the string is a palindrome
        boolean result = isPalindrome(str);

        // Print result based on boolean value
        if (result)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
