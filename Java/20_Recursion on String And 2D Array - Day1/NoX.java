/*No X
Given a string, compute recursively a new string where all the x chars have been removed.

Input Format
Only line contains the string S.

Output Format
Print the string with no x.

Example 1
Input

xaaax
Output

aaa
Explanation

Remove the x at the start and the end.

Example 2
Input

xaxb
Output

ab
Explanation

Remove the x at 0th and 2nd position.

Example 3
Input

xxx
Output

Explanation

Remove all the x so the string becomes empty.

Constraints
1 <= s.length() <= 10 ^ 4
Hint 1
For each character, check whether it is x or not. If it is, then recurse the function for the rest of the string else add the character to the new string and then recurse the function.

Approach 1:
We are given a string s from which we want to remove all the occurrences of char 'x' from string s.

So, At each instance(each char a in string s), if a == 'x', we should skip a from the answer.

else we should have a in answer and append the remains s after removing 'x' form s.

For doing this, we check if starting of the string is char 'x' or not. If it is we skip it by using substring function to call noX() function in the substring after removing the current 'x' character.

If our current char is not 'x', we call noX on substring and append it to our current char and return the final string.

Time Complexity:

O(n)

Space Complexity:

O(n)

Below is the implementation of the above idea:

1. Java*/
import java.util.*;

public class NoX {
    static String noX(String s) {
        // Write your code here
        if(s.length() == 0)
            return "";
        if(s.charAt(0)=='x')
            return noX(s.substring(1));

        return s.charAt(0) + noX(s.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(noX(s));
    }
}