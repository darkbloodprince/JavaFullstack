/*Count String Encodings
You have given string str of digits.

You are required to encode the str as per the following rules

    1 -> a
    2 -> b
    3 -> c
    ..
    25 -> y
    26 -> z
Your task is to calculate all the possible encodings and print the total number of them. If no encoding is possible, print 0.

Input Format
First line contains the string str

Output Format
Print the total number of encodings of the string str

Example 1
Input

123
Output

3
Explanation

We have three encoding, abc => {1,2,3}, aw => {1, 23}, lc => {12, 3}

Example 2
Input

013
Output

0
Explanation

String starts with 0, which makes it invalid.

Example 3
Input

303
Output

0
Explanation

We have no encoding as we can split str as {3, 0, 3}, {30, 3}, or {3, 03}. In {3, 0, 3} we dont have a character for 0. In {30, 3} we dont have a character for 30. In {3, 03}, 03 is invalid.

Constraints
0 <= str.length <= 10
Hint 3
Try identifying the base case

Approach 1
We need to find the various encoding that can be derived from our given string str. For doing this, we use recursion.

Base Case: if length of str is 0, then no more encodings can be taken from it, so our ans string will have a possible encoding, so we add it to our bank array, which stores all the encodings. Recursive Subproblem: At any instance, we do two things,

we take out the first digit from str, and append it's encoded character to ans, and call recursive function on the remaining str and new ans.
we check the first two digits of str and see if they have a encoded character or not, if they do, then we add the encoded character to ans, and call recursive function on the remaining str and new ans.
Both of the above two processes can be skipped if the first digit is 0, as in that case we dont have a encoded character.

Time Complexity

O(2^n)

Space Complexity

O(2^n)

Below is the implementation of above approach:

1. Java*/
import java.util.*;

public class CountStringEncodings {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();  // take input string (digits only)
    sc.close();
    System.out.println(countEncodings(str));  // print total number of valid encodings
  }

  // ----------------------------------------------------------------
  // Recursive helper function to generate all valid encodings
  // ----------------------------------------------------------------
  public static void printEncodingsHelper(String str, String ans, ArrayList<String> bank) {
    int len = str.length();

    // ✅ BASE CASE 1:
    // If the string becomes empty, that means we have found one valid encoding
    if (len == 0) {
      bank.add(ans);  // store the encoded string in 'bank'
      return;
    }

    // Take first character and convert it to a number
    int num = str.charAt(0) - '0';

    // ✅ CASE 1: Single character encoding (1 to 9)
    // '0' is invalid (no mapping for it)
    if (num > 0) {
      // Convert number to its corresponding character
      // Example: 1 -> 'a', 2 -> 'b', etc.
      printEncodingsHelper(
        str.substring(1),                     // process remaining string
        ans + (char) ('a' + (num - 1)),       // append mapped character
        bank
      );
    }

    // If the string has only one digit or starts with 0, we cannot form two-digit number
    if (len == 1 || num == 0) return;

    // ✅ CASE 2: Two-character encoding (10 to 26)
    // Convert first two characters to a number
    num = Integer.parseInt(str.substring(0, 2));

    // Check if this number is within valid alphabet range
    if (num <= 26) {
      printEncodingsHelper(
        str.substring(2),                     // skip first two digits
        ans + (char) ('a' + (num - 1)),       // append corresponding alphabet
        bank
      );
    }
  }

  // ----------------------------------------------------------------
  // This function initiates recursion and returns total count
  // ----------------------------------------------------------------
  public static int countEncodings(String str) {
    ArrayList<String> bank = new ArrayList<>();    // list to store all valid encodings
    printEncodingsHelper(str, "", bank);           // generate all possible encodings
    return bank.size();                            // return total number of encodings
  }
}
