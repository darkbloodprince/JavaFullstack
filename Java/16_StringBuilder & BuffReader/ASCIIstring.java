/*ASCII string
You are given a string str that contains only lowercase alphabets.

You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.

Note Complete the given function. The input and output would be handled by the driver code.

Input Format
The only line contains the string str.

Output Format
Print the new string.

Example 1
Input

abecd
Output

a1b3e-2c1d
Explanation

'b' - 'a' = 1
'e' - 'b' = 3
'c' - 'e' = -2
'd' - 'c' = 1
Example 2
Input

abc
Output

a1b1c
Explanation

'b' - 'a' = 1
'c' - 'b' = 1
Constraints
1 <= |str| <= 1000
Hint 1
Use StringBuilder.
Approach:

Use String Builder.
To get the difference in the ASCII values we can just simply subtract the characters.
Implicitly all the characters are represented by their ASCII value.
so while subtracting it is their ASCII value that gets subtracted.
Append both the difference and the current character.
Algorithm:

Use String Builder.
Append first character.
Run a loop from the next character.
Take difference from the previuos character. Append the difference.
Append the character and move to the next character of the string.
Time Complexity : O(n)

Space Complexity : O(n)

Below is the implementation of above idea:

1. Java*/
import java.io.*;   // For standard I/O (optional here)
import java.util.*; // For Scanner class

public class ASCIIstring {

  // Function to construct the required ASCII difference string
  public static String solution(String str) {
    StringBuilder sb = new StringBuilder(); // Efficient string manipulation

    sb.append(str.charAt(0)); // Start the result with the first character of input

    // Loop through the string from the second character
    for (int i = 1; i < str.length(); i++) {
      char curr = str.charAt(i);       // Current character
      char prev = str.charAt(i - 1);   // Previous character

      int gap = curr - prev;           // ASCII difference between current and previous characters

      sb.append(gap);  // Append the difference
      sb.append(curr); // Append the current character
    }

    return sb.toString(); // Return the final constructed string
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); // Scanner to read input

    String str = scn.next(); // Read input string from user (only lowercase letters)

    System.out.println(solution(str)); // Call the solution and print the result
  }
}
