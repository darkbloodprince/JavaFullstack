/*Pangrams
A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.

Input Format
The first line inputs a string, S.

Output Format
In a new line, print "pangram" if string contains every letter of the alphabet else "not pangram".

Example 1
Input

We promptly judged antique ivory buckles for the next prize
Output

pangram
Explanation All of the letters of the alphabet are present in the string.

Example 2
Input

We promptly judged antique ivory buckles for the prize
Output

not pangram
Explanation

The string lacks an x.

Constraints:
0 < length of s <= 1000\

Each character of s, s[i]∈{a-z,A-Z,space}*/
import java.util.*;
import java.io.*;

public class Pangrams {
     public static void isPangram(String s) {
    s = s.toLowerCase();
    Set<Character> set = new HashSet<>();

    for (char ch : s.toCharArray()) {
        if (ch >= 'a' && ch <= 'z') {
            set.add(ch);
        }
    }

    if (set.size() == 26) {
        System.out.println("pangram");
    } else {
        System.out.println("not pangram");
    }
}

    public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);
        
    }
}