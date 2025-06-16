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
1 <= s.size() <= 1000*/
import java.util.*;

public class DistinctPalindromicSubStrings {

    // Function to check if a given string is a palindrome
    static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }

    static void palindromeSubStrs(String s) {
        Set<String> result = new TreeSet<>(); // TreeSet to maintain sorted unique values

        int n = s.length();

        // Generate all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(s, i, j)) {
                    result.add(s.substring(i, j + 1));
                }
            }
        }

        // Print each palindrome in lexicographic order
        for (String str : result) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        palindromeSubStrs(s);
    }
}
