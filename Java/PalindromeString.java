/*Palindrome String
Given a string str, determine if it is a palindrome, considering only alphabetic characters and ignoring the upper or lower case. Return 0 if it is not a palindrome, else return 1.

Input Format
Input consists of one line

The first line given is a string str.

Output Format
Returns 0 if it is not a palindrome, else return 1 if it is a palindrome

Example 1
Input

race a car
Output

0
Explanation

Not a palindrome

Example 2
Input

a man, a plan, a canal Panama
Output

1
Explanation

It is a palindrome.

Constraints
1 <= str.length <= 10000*/
import java.io.*;
import java.util.*;

public class PalindromeString {
	static int isPalindrome(String str) {
    StringBuilder sb = new StringBuilder();

    // Filter only alphabetic characters and convert to lowercase
    for (char ch : str.toCharArray()) {
        if (Character.isLetter(ch)) {
            sb.append(Character.toLowerCase(ch));
        }
    }

    String filtered = sb.toString();
    String reversed = sb.reverse().toString();

    // Check if the filtered string is equal to its reverse
    if (filtered.equals(reversed)) {
        return 1;
    } else {
        return 0;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);        
    }
}