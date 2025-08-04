/*Lower or Upper
Given a character ch, check if it is an Uppercase letter or Lowercase letter. Return U if ch is an Uppercase letter and L if ch is Lowercase letter.

Input Format
First line contains a character ch

Output Format
Return the character L or U according to the question.

Example 1
Input

k
Output

L
Example 2
Input

K
Output

U
Constraints
ch is a lowercase letter or uppercase letter only.
Approach 1:

We need to check if the given character ch is Upper case or Lower case, so for this we check if ch lies in range A to z, ie if 'A' <= ch && ch <= 'Z'

If ch lies in this range we return 'U', as ch is upper case letter Else we return 'L'.

Time Complexity : O(1) Space Complexity : O(1)

Below is the implementation of the above idea:

1. Java*/
import java.util.*; // Importing all classes from the java.util package, including Scanner

public class LowerorUpper {
    
    // Method to determine if a character is uppercase or lowercase
    public static char LowerUpper(char ch) {
        // Check if the character is in the range 'A' to 'Z' (i.e., an uppercase letter)
        if('A' <= ch && ch <= 'Z')
            return 'U'; // Return 'U' for Uppercase
        else
            return 'L'; // Return 'L' for Lowercase
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from user

        char ch = sc.next().charAt(0); // Read a string token and extract the first character

        System.out.println(LowerUpper(ch)); // Call the method and print 'U' or 'L' depending on case
    }
}
