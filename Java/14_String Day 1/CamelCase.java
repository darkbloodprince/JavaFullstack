/*Camel Case
You are given a string consisting of different words separated by underscores _. You have to convert the string to camel case. The first letter of the entire case should be lowercase.

eg: app_dsd_sdda to appDsdSdda

Input Format
The first line contains the number of test cases.

For each test case: The first line contains the string S.

Output Format
For each test case print the final formed string in a new line.

Example 1
Input:

1
abb_b_cc_d
Output:

abbBCcD
Explanation:

We remove the underscores and convert the next character to uppercase.

Example 2
Input:

1
how_are_you
Output:

howAreYou

Explanation:

We remove the underscores and convert the next character to uppercase.

Constraints
1 <= T <= 10

1 <= |S| <= 100000
Approach 1

Whenever we see an underscore, Increase the counter, and convert it to upper case.

Algorithm:

1, Traverse the string. 2. Make an empty string, if the current element is underscore, increase the counter and add it to the string after making it uppercase. 3. Else add it to the string as it is.

Time Complexity : O(n) as we are traversing the string. Space Complexity : O(n) as we are making a new string

1. JAVA*/
import java.util.*;  // Import all utility classes, especially Scanner for input

class CamelCase {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);  // Create Scanner object to read input
    int t = sc.nextInt();                 // Read number of test cases

    while (t-- > 0) {                     // Loop through each test case
      String s = sc.next();              // Read one word/string in snake_case
      String ans = camelCase(s);         // Convert it to camelCase using helper method
      System.out.println(ans);           // Print the result
    }
  }

  // Function to convert snake_case string to camelCase
  static String camelCase(String s) {
    StringBuilder ans = new StringBuilder();  // Used to build the result string

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '_') {               // If current char is '_'
        i++;                                  // Move to next character
        // Convert next character to uppercase and append
        ans.append(Character.toUpperCase(s.charAt(i)));
      } else {
        ans.append(s.charAt(i));              // Otherwise, just append the character
      }
    }

    return ans.toString();                    // Return the final camelCase string
  }
}
