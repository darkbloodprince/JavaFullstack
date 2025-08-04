/*Strange String
You are given an integer 'N' and an empty string 'S'. You need to modify the string using the given operations to make it of length 'N'.

Insert the first character in the beginning of string, the second in the end, the third in the beginning, fourth in the end, and so on.

The first character should be a, followed by b, c, and so on. z will be followed by a.

Note: StringBuilder in Java represents a mutable sequence of characters.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains a single integer 'N'.

Output Format
For each test case print the string 'S' of length 'N' in a new line.

Example 1
Input:

1
3
Output:

cab
Explanation:

The first character to be inserted in the beginning is 'a', second is 'b' which is inserted at the end making our string as 'ab', third character 'c', is inserted in the beginning which makes our string 'cab'.

Example 2
Input:

1
4
Output:

cabd
Explanation:

The first character to be inserted in the beginning is 'a', second is 'b' which is inserted at the end making our string as 'ab',

third character 'c', is inserted in the beginning which makes our string 'cab', the fourth character 'd' is inserted in the end making our stirng as cabd.

Constraints
1 <= T <= 10

1 <= N <= 500000
Hint 1
Observe the pattern of inserting characters: a, b, c, ..., z, a, b, c, ..., z. Recognize that after inserting 'a' at the beginning, the characters follow the alphabetical order and repeat. This pattern can guide you in efficiently generating the required string.
Approach 1: Deque Approach
We use a deque to solve this problem. Initialize a character c to 'a', and then iterate i from 0 to n-1. For each i, if i is odd, we add c to the end of the deque, else we add it to the front. Then we increment c by 1. If c exceeds 'z', we set it to 'a'.

Time Complexity: O(n)

Space Complexity: O(n)

Below is the implementation of the above approach:

Java*/
import java.io.*;
import java.util.*;

public class StrangeString {

    // Function to generate a strange string of length n
    static String strangeString(int n) {
        Deque<Character> deque = new ArrayDeque<>(); // Double-ended queue to allow insertions at both ends
        char c = 'a'; // Start from character 'a'

        // Loop n times to build the string
        for (int i = 0; i < n; i++) {
            if(i % 2 == 1) {
                deque.addLast(c); // If index is odd, add character to the end (right)
            } else {
                deque.addFirst(c); // If index is even, add character to the front (left)
            }

            c++; // Move to next character in the alphabet

            // If character goes beyond 'z', wrap around back to 'a'
            if(c > 'z') c = 'a';
        }

        // Now convert deque to string
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.removeFirst()); // Take characters from left to right
        }

        return sb.toString(); // Return the final strange string
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // Read input
        int t = input.nextInt(); // Number of test cases

        // Run the function for each test case
        while (t-- > 0){
            int n = input.nextInt(); // Read n for this test case
            System.out.println(strangeString(n)); // Print the strange string
        }
    }
}
