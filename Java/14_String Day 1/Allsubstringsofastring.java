/*All substrings of a string
Given a string str, print all possible non-empty substrings of str, in order of occurrence in the string.

Input Format
Input consists of a single line of string.

Output Format
Print all the substrings of a string in order of occurrence in the string in different lines.

Example 1
Input

abc
Output

a
ab
abc
b
bc
c
Explanation:

These are the possible non-empty substrings.

Example 2
Input

abcd
Output

a
ab
abc
abcd
b
bc
bcd
c
cd
d
Explanation:

These are the possible non-empty substrings.

Constraints
0 <= str.length() <= 280
Approach 1:
Take two pointers to make substrings in a nested loop and print them as we make them.

Algorithm:

Take two pointers to denote a substring.
In a nested loop, for each value of the first pointer, move the second pointer to add all the values till the end of the string. After all the values have been added, update the first pointer.
While shifting the second pointer, keep adding characters to make the substring between the first pointer and the second pointer and keep printing the substring.

Time Complexity

O(N^2): as we need a nested loop to cover all subarrays.

Space Complexity

O(1): as we do not need any extra memory.

Below is the implementation of the above idea:

1. Java*/
import java.util.*; // Importing utility package for Scanner class

public class Allsubstringsofastring {

    // Method to print all substrings of a given string
    static void SubString(String str) {
        // Outer loop controls the starting index of the substring
        for (int i = 0; i < str.length(); i++) {
            String subStr = ""; // Initialize an empty string to build the substring
            // Inner loop controls the ending index of the substring
            for (int j = i; j < str.length(); j++) {
                // Append the current character to subStr
                subStr += str.charAt(j);
                // Print the current substring
                System.out.println(subStr);
            }
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        // Read the full line input (could include spaces)
        String str = sc.nextLine();
        // Call the SubString method to print all substrings
        SubString(str);
    }
}
