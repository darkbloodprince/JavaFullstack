/*Palindrome String
Given a string str, determine if it is a palindrome, considering only alphabetic characters and ignoring the upper or lower case. Return 0 if it is not a palindrome, else return 1.

Input Format
Input consists of one line

The first line given is a string str.

Output Format
Returns 0 if it is not a palindrome, else return 1 if it is a palindrome

Example 1
Input

race a car
Output

0
Explanation

Not a palindrome

Example 2
Input

a man, a plan, a canal Panama
Output

1
Explanation

It is a palindrome.

Constraints
1 <= str.length <= 10000
Approach 1:
Check from the start and the end of the string. If both the elements are equal, decrease the end and increase the start. We can do this by placing 2 pointers, one in the beginning of the string and one at the end of the string.

Algorithm:

Convert the entire string to uppercase to take into account the lowercase letters in the string.
Place two pointers, one in the beginning of the string (start) and one at the end of the string (end).
If element at start is equal to element at end pointer, increment start pointer and decrement end pointer.
Keep doing this while start is greater than end.

Time Complexity

O(n) as we are traversing the string once.

Space Complexity

O(1) to return a bollean value.

Below is the implementation of the above idea:

1. Java*/
import java.io.*;
import java.util.*;

public class PalindromeString {

    // Method to check if a string is a palindrome (ignoring case and non-alphabetic characters)
    static int isPalindrome(String str) {
        // Convert the string to uppercase to make the comparison case-insensitive
        String S = str.toUpperCase();

        // Initialize two pointers: one at the beginning, one at the end of the string
        int l = 0;
        int r = S.length() - 1;

        // Loop until the two pointers meet or cross
        while (l < r) {

            // Skip characters at the left pointer if they are not alphabetic
            if (!((S.charAt(l) >= 'a' && S.charAt(l) <= 'z') || (S.charAt(l) >= 'A' && S.charAt(l) <= 'Z'))) {
                l++;
                continue; // Skip this iteration and move to the next character
            }

            // Skip characters at the right pointer if they are not alphabetic
            if (!((S.charAt(r) >= 'a' && S.charAt(r) <= 'z') || (S.charAt(r) >= 'A' && S.charAt(r) <= 'Z'))) {
                r--;
                continue; // Skip this iteration and move to the previous character
            }

            // Compare characters at the left and right pointers
            if (S.charAt(l) != S.charAt(r)) {
                return 0; // Not a palindrome
            }

            // Move both pointers closer to the center
            l++;
            r--;
        }

        return 1; // If loop completes, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to read input
        String str = sc.nextLine();           // Read a full line of input from the user

        int result = isPalindrome(str);       // Call the palindrome-checking function
        System.out.println(result);           // Print 1 if palindrome, 0 otherwise
    }
}
