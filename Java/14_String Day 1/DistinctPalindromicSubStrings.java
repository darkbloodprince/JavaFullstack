/*Distinct Palindromic SubStrings
Given a string s, print all the substrings of s that are palindromic. Print all the required substrings in lexicographical order.

A substring is a subset or part of another string, or it is a contiguous sequence of characters within a string.

A lexicographic order is an arrangement of characters, words, or numbers in alphabetical order, that is, the letters are sorted from A-Z.

Input Format
First line contains a string s.

Output Format
Print various strings according to the question, each string should be in a new line

Example 1
Input

abc
Output

a
b
c
Example 2
Input

abccbc
Output

a
b
bccb
c
cbc
cc
Constraints
1 <= s.size() <= 1000
Approach 1:
The algorithm is as follows:

Initialize a variable "n" to the size of the input string
Create a 2D vector "dp" with dimensions "n"x"n" and initialize all elements to false
Use a for loop to iterate through the input string, setting dp[i][i] to true for each character
Use another for loop to check for substrings of length 2 and set dp[i][i+1] to true if the characters are the same
Use another for loop to check for substrings of length greater than 2, setting dp[i][i+(len-1)] to true if the characters at the start and end of the substring match and the substring between them is a palindrome
Create a vector "kmp" with length "n" and initialize all elements to 0
Use a for loop to iterate through the input string and apply the KMP algorithm to each substring starting from index i
Use another for loop to iterate through the input string and add any substrings that are palindrome and not already added to the list
Sort the list and print out the distinct substrings, one by one.
Time Complexity: O(n^2)

Space Complexity: O(n^2)

Below is the implementation of the above idea:

1. Java*/
import java.util.*;

public class DistinctPalindromicSubStrings {

    // This method finds and prints all distinct palindromic substrings of a string `s`
    static void palindromeSubStrs(String s) {
        int n = s.length();

        // Step 1: Dynamic Programming table to store if s[i..j] is a palindrome
        boolean[][] dp = new boolean[n][n];

        // Initialize: All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;

            // Substrings of length 2 are palindromes if both characters are same
            if (i < n - 1 && s.charAt(i) == s.charAt(i + 1))
                dp[i][i + 1] = true;
        }

        // Step 2: Fill dp table for substrings of length >= 3
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                // Check if the first and last characters match and the inner substring is a palindrome
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1])
                    dp[i][j] = true;
            }
        }

        // Step 3: KMP-like adjustment (Unusual use — looks like an attempt to remove duplicates or overlaps)
        int[] kmp = new int[n];
        for (int i = 0; i < n; i++) {
            int j = 0, k = 1;
            while (k + i < n) {
                if (s.charAt(j + i) == s.charAt(k + i)) {
                    dp[k + i - j][k + i] = false; // Remove overlapping?
                    kmp[k++] = ++j;
                } else if (j > 0) {
                    j = kmp[j - 1];
                } else {
                    kmp[k++] = 0;
                }
            }
        }

        // Step 4: Collect all palindromic substrings
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = "";
            for (int j = i; j < n; j++) {
                str += s.charAt(j); // Building substring manually (could be optimized)
                if (dp[i][j])       // If s[i..j] is a palindrome
                    ans.add(str);  // Add to the list
            }
        }

        // Step 5: Sort substrings lexicographically
        Collections.sort(ans);

        // Step 6: Print unique palindromic substrings
        if (ans.size() != 0)
            System.out.println(ans.get(0)); // Print the first one

        for (int i = 1; i < ans.size(); i++) {
            // Skip duplicates
            if (!Objects.equals(ans.get(i - 1), ans.get(i))) {
                System.out.println(ans.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // Read input string

        palindromeSubStrs(s);     // Process and print all palindromic substrings
    }
}
