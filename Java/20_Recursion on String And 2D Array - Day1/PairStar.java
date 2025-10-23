/*PairStar
Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

Input Format
The first line contains the string.

Output Format
Return the desired output string where there is a * between consecutive same characters.

Example 1
Input

hello
Output

hel*lo
Example 2
Input

xxyy
Output

x*xy*y
Constraints
1 <= s.size() <= 1000
Hint 1
Compare adjacent characters

Approach 1:
If there is an empty string then simply return. This forms our base condition. Check if the first two characters are identical. If yes, then insert ” * ” between them. As we have now checked for identical characters at the first two positions of the string so we now make a recursive call without the first character of the string.

Time Complexity

O(N)

Space Complexity

O(N) to store the answer.

Below is the implementation of the above idea:

1. Java*/
import java.util.*;

public class PairStar {

    // Recursive function that inserts a '*' between identical consecutive characters in a string
    static String PairStar(String str) {

        // Base case 1: if the string is empty, return an empty string
        if (str.length() == 0)
            return "";

        // Base case 2: if there’s only one character left, just return it (no adjacent pair possible)
        if (str.length() == 1)
            return str.charAt(0) + "";

        // Recursive case: check if the first two characters are the same
        if (str.charAt(0) == str.charAt(1))
            // If they are equal, insert '*' between them
            // and call the function recursively for the rest of the string (starting from index 1)
            return str.charAt(0) + "*" + PairStar(str.substring(1));

        // If the first two characters are different,
        // keep the first character as it is and call recursion on the remaining substring
        return str.charAt(0) + PairStar(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string from user
        String s = sc.nextLine();

        // Print the result after inserting '*' between consecutive duplicate characters
        System.out.println(PairStar(s));
    }
}
