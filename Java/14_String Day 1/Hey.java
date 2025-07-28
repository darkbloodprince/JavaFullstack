/*Hey!
Now that Snapchat and Slingshot are soooo 2018, the teenagers of the world have all switched to the new hot app called BAPC (Bidirectional and Private Communication).

This app has some stricter social rules than previous iterations.

For example, if someone says goodbye using Later!, the other person is expected to reply with Alligator!. You can not keep track of all these social conventions and decide to automate any necessary responses, starting with the most important one: the greetings.

When your conversational partner opens with he…ey, you have to respond with hee…eey as well, but using twice as many e’s!

Given a string of the form he…ey of length at most 1000, print the greeting you will respond with, containing twice as many e’s.

Input Format
Input consists of one line

The input consists of one line containing a single string s as specified, of length at least 3 and at most 1000.

Output Format
Output the required string with twice as many e's

Example 1
Input

hey
Output

heey
Explanation

Doubling the number of e's.

Example 2
Input

heeeeey
Output

heeeeeeeeeey
Explanation

Doubling the number of e's

Constraints
1 <= n <= 10 ^ 3

where n is the size of the string.
Approach 1:
Calculate the number of e's and double them, print the new string.

Algorithm:

1. Calculate the size of the string.
2. Subtract 2 from the size, because in each string, number of e's is equal to (size of string - 2). 'h' and 'y' are removed, which is the reason we subtract 2.
3. Double the number of e's.
4. Print the the new string by printing 'h', then twice the number of e's, and then 'y'.
Time Complexity:

O(n)

Space Complexity:

O(n)

Below is the implementation of the above idea:

1. Java*/
import java.io.*;
import java.util.*;

public class Hey {

    // This method generates the response string based on input like "heeeey"
    static String hey(String str) {
        String result = "";

        // The number of 'e' characters in the input string is (length - 2),
        // because the first and last characters are 'h' and 'y' respectively.
        int ct = str.length() - 2;

        // As per the problem, we need to double the number of e's
        ct = ct * 2;

        // Start building the output string with 'h'
        result += "h";

        // Add 2 × number of 'e's
        for (int i = 0; i < ct; ++i) {
            result += "e";
        }

        // End the output string with 'y'
        result += "y";

        // Return the result string
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input string, e.g., "heeeeey"
        String str = sc.next();

        // Create object (not really needed since 'hey' is static, but okay)
        Main Obj = new Main();

        // Call the hey method and get the result
        String result = Obj.hey(str);

        // Print the result
        System.out.print(result);        
        System.out.println('\n'); // Add newline for cleaner output
    }
}
