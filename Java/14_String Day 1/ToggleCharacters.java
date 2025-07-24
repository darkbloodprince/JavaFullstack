/*Toggle Characters
Given a string of length N, toggle the case of all the characters in the string, i.e. You should set all lowercase characters to uppercase and vice versa.

Please note that the string may contain numbers or special characters as well.

Input Format
The input consists of two lines.

The first line of the input contains one integer N, denoting the size of the string.

The second line of the input contains the string S.

Output Format
Your code should output the string S with its characters toggled.

Example 1
Input

8
helloABC
Output

HELLOabc
Explanation

All the lower case alphabets got converted into upper case and vice versa.

Example 2
Input

4
aBC1
Output

Abc1
Explanation

All the lower case alphabets got converted into upper case and vice versa.

Constraints
`1 <= N <= 2*10^5``

where n is the size of the string.
Approach 1:

Traverse the string to check the alphabets only. Ignore the special characters and convert lower case to upper case alphabets and vice versa.

Algorithm:

Iterate through the whole string.
Skip if a character is not alphabet.
Toggle the characters only if they are alphabets.
Time Complexity : O(N) , as we need to iterate through the whole string.

Space Complexity : O(1) , as we do not need any extra memory.

Below is the implementation of the above idea:

1. Java*/
import java.util.*; 
// Importing the utility package to use Scanner for input

public class ToggleCharacters {
  // Main class definition

  public static void main(String[] args) throws Throwable {
    // Main method – entry point of the program
    Scanner sc = new Scanner(System.in);
    // Creating Scanner object to read input

    int n = sc.nextInt();
    // Reading an integer n – length of the string

    sc.nextLine();
    // Consuming the leftover newline character from the input buffer

    String str = sc.nextLine();
    // Reading the actual string from the user

    toggleCase(n, str);
    // Calling the toggleCase method to process the string
  }

  static void toggleCase(int n, String str) {
    // Method to toggle case of each character in the string

    char[] arr = str.toCharArray();
    // Converting the string into a character array for easier manipulation

    for (int i = 0; i < n; i++) {
      // Looping through each character of the string

      char ch = str.charAt(i);
      // Getting the character at index i

      if (ch >= 'a' && ch <= 'z') {
        // If the character is lowercase
        arr[i] = (char) (ch - 'a' + 'A');
        // Convert to uppercase by shifting ASCII value
      } else if (ch >= 'A' && ch <= 'Z') {
        // If the character is uppercase
        arr[i] = (char) (ch - 'A' + 'a');
        // Convert to lowercase by shifting ASCII value
      }
      // Non-alphabetic characters remain unchanged
    }

    String ans = String.valueOf(arr);
    // Convert the modified character array back to a string

    System.out.println(ans);
    // Print the result
  }
}
