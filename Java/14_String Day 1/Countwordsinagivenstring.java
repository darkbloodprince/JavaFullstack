/*Count words in a given string
You are given a string containing some space-separated words. You need to count the number of words in the string.

NOTE

You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format
The first line contains the number of test cases.

For each test case: The first line has the string S.

Output Format
For each test case return the number of words.

Example 1
Input:

1
  this is  a sample   string  
Output

5
Explanation

There are five words which are 'this' , 'is' , 'a' , 'sample' , 'string'.

Example 2
Input

1
gear five
Output

2
Explanation

The two words that are present here are 'gear', and 'five'.

Constraints:
1 <= T <= 10
1 <= |S| <= 10000
Approach
Iterate over the string and check for spaces. If a space is present check if the previous character was an alphabet or not. Update count.

Algorithm:

Take the required inputs.
Iterate over the strings.
On encountering a space, if the previous character is a space, skip. If the previous character is an alphabet, update count.
Check for edge case of the last word. Dont forget to include it, as the string might not end with a space.
Print the answer.
Time Complexity

O(|S|) as we run a single loop.

Space Complexity

O(1) as no extra space is required.

Below is the implementation of above idea:

1. Java*/
import java.io.*;      // For I/O operations (not used here)
import java.lang.*;    // For language classes (optional import, not needed)
import java.util.*;    // For Scanner and other utility classes
class Countwordsinagivenstring {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);       // Create scanner for input

    int t = sc.nextInt();                      // Read the number of test cases (lines of input)
    String p = sc.nextLine();                  // Read the leftover newline after reading integer

    // Process each test case
    while (t > 0) {
      String s = sc.nextLine();                // Read the input line (string)
      System.out.println(countWords(s));       // Print word count for the line
      t--;                                     // Decrease test case counter
    }
  }

  // Function to count the number of words in a string
  public static int countWords(String s) {
    int n = s.length();                        // Get length of the string
    int count = 0;                             // Initialize word count
    char prev = ' ';                           // Initialize previous character as space

    for (int i = 0; i < n; i++) {
      // If current character is a space and previous was not a space,
      // it means a word just ended
      if (s.charAt(i) == ' ' && prev != ' ') {
        count++;
      }

      // Special case: if it's the last character and it's not a space,
      // then there's one more word
      if (i == n - 1 && s.charAt(i) != ' ') {
        count++;
      }

      // Update previous character for next iteration
      prev = s.charAt(i);
    }

    return count;     // Return the total number of words
  }
}
