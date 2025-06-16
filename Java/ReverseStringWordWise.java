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

1 <= |S| <= 10000*/
import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseStringWordWise {
    public static String reverseWords(String s) {
        // Split the string by spaces (handle multiple spaces by regex "\\s+")
        String[] words = s.trim().split("\\s+");
        
        // Use StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();
        
        // Iterate from the last word to the first
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  // consume newline after integer
        
        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(reverseWords(s));
            t--;
        }
    }
}
