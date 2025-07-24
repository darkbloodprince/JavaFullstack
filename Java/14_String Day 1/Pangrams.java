/*Pangrams
A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.

Input Format
The first line inputs a string, S.

Output Format
In a new line, print "pangram" if string contains every letter of the alphabet else "not pangram".

Example 1
Input

We promptly judged antique ivory buckles for the next prize
Output

pangram
Explanation All of the letters of the alphabet are present in the string.

Example 2
Input

We promptly judged antique ivory buckles for the prize
Output

not pangram
Explanation

The string lacks an x.

Constraints:
0 < length of s <= 1000\

Each character of s, s[i]∈{a-z,A-Z,space}
Approach:
This approach is based on Hashing. Algorithm

A Hashing data structure of boolean type is created of size 26, such that index 0 represents the character ‘a’, 1 represents the character ‘b’ and so on.
Traverse the string character by character and mark the particular character as present in the Hash.
After complete traversal and marking of the string, traverse the Hash and see if all characters are present, i.e. every index has true. If all are marked, then it is a pangram otherwise it is not.

Time Complexity

O(n) as the length of string.

Space Complexity

O(26) as there are 26 letters in english.

Below is the implementation of the above idea:

1. Java*/
import java.util.*; // Importing all utility classes (like Scanner)
import java.io.*;    // Importing IO classes (not used directly here)

public class Pangrams {

    // Method to check if a given string is a pangram
    public static void isPangram(String s) {
        // A pangram contains every letter of the English alphabet at least once
        // This array keeps track of which letters have appeared
        boolean[] present = new boolean[26]; // 26 letters in English alphabet

        int idx = -1; // To hold the index of each letter found (0 to 25)

        // Iterate through each character of the input string
        for (int i = 0; i < s.length(); i++) {
            // If character is a lowercase letter
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                idx = s.charAt(i) - 'a'; // 'a' = 0, 'b' = 1, ..., 'z' = 25
            }
            // If character is an uppercase letter
            else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                idx = s.charAt(i) - 'A'; // Convert to 0–25 using 'A' as base
            }

            // If a valid letter was found, mark it as present
            if (idx != -1) {
                present[idx] = true;
            }
        }

        // Check if any letter was absent
        boolean absent = false;
        for (int i = 0; i < 26; i++) {
            if (present[i] == false) {
                absent = true; // If any letter not found, it's not a pangram
            }
        }

        // Print result based on whether all letters were present
        if (absent == false) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }

    public static void main(String args[]) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Read a line of text from user
        String s = input.nextLine();

        // Call the function to check if input is a pangram
        isPangram(s);
    }
}
