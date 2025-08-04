/*Reverse String Word Wise
You are given a string S containing several space-separated words. You need to reverse the order of appearence of the words.

NOTE

You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format:
The first line contains the number of test cases.

For each test case: The first line has the string S.

Output Format
For each test case return the new reversed string.

Example 1
Input

1
how are you
Output

you are how
Explanation

We reverse the order of appearence.

Example 2
Input

1
gear fifth
Output

fifth gear
Explanation

We reverse the order of appearence.

Constraints
1 <= T <= 10

1 <= |S| <= 10000
Approach: Go through the string and reverse each word in the string, then, in the end, reverse the whole string.

Algorithm:

Take the required inputs.
Iterate over the string. Keep pointers to mark the start and end of a word.
You find an end if the pointer reaches the end of the string or encounters a space.
Reverse the words using swaps.
After all the words have been reversed, reverse the complete string.
Print the answer.
Time Complexity: O(|S|). We iterate over the string.

Space Complexity: O(1)

Below is the implementation of above idea:

Java:*/
import java.util.*;
import java.lang.*;
import java.io.*;
class ReverseStringWordWise {
    public static StringBuilder swap(StringBuilder str, int i, int j) {
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
        return str;
    }
    public static String reverseWords(String s) {
        int left = 0, i = 0, n = s.length();
        StringBuilder st = new StringBuilder(s);
        while (i < n) {
            if (i + 1 == n || st.charAt(i) == ' ') {
                int j = i - 1;
                if (i + 1 == n)
                    j++;  // Fix for the last character

                while (left < j)
                    st = swap(st, left++, j--);  // Reverse the word from left to j
                left = i + 1;  // Move to the start of the next word
            }

            if (i > left && st.charAt(left) == ' ')
                left = i;  // Skip extra spaces (if any)

            i++;
        }
        String t = st.reverse().toString();  // Finally reverse the whole sentence
        return t;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Read number of test cases
        String p = sc.nextLine();  // Consume leftover newline
        while (t > 0) {
            String s = sc.nextLine();  // Read the input string
            System.out.println(reverseWords(s));  // Call the method and print result
            t--;
        }
    }
}
