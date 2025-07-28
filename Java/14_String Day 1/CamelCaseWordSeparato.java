/*Camel Case Word Separato
One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code, developers write function and variable names in Camel Case.

You are given a string S, written in Camel Case. Find All The Words Contained In It.

Note Complete the given function. The input would be handled by the driver code. You only have to print the answer.

Input Format
The only line contains the string S.

Output Format
Print each word in a new line

Example 1
Input

IAmAJavaProgrammer
Output

I
Am
A
Java
Programmer
Explanation

We separate each word and print them in a new line.

Example 2
Input

OnePiece
Output

One
Piece
Explanation

We separate each word and print them in a new line.

Constraints
1 <= |str| <= 10000
Approach: Print the first character of the string. Now start iterating from the second character. Print an empty line whenever you encounter an uppercase.

Algorithm:

Print the first character.
Iterate from the second character.
Check if a character is uppercase or not.
If it is uppercase print an endline before printint the character.
Print the character, and move to next one.
Below is the implementation of above idea:

1. Java*/
import java.io.*;
import java.util.*;

public class CamelCaseWordSeparato {
  
  // Method to split a CamelCase string into words and print each word on a new line
  public static void solution(String str) {
    int n = str.length(); // Get the length of the input string

    // Print the first character without a newline (since it's the start of the first word)
    System.out.print(str.charAt(0));

    // Loop through the rest of the string
    for (int i = 1; i < n; i++) {
        // If the current character is an uppercase letter (start of a new word)
        if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
            System.out.println(); // Move to a new line before printing the new word
        }

        // Print the current character (it could be a new word's first letter or a part of the current word)
        System.out.print(str.charAt(i));
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); // Create a scanner to read input
    String str = scn.next();              // Read the CamelCase string
    solution(str);                        // Call the solution method
  }
}
