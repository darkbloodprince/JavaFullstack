/*Keypad combination
You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone. The following list is the key to characters map

0 -> .;
1 -> abc 
2 -> def 
3 -> ghi 
4 -> jkl 
5 -> mno 
6 -> pqrs 
7 -> tu 
8 -> vwx 
9 -> yz 
Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.

Use sample input and output to take idea about output

Input Format
Input consists of one line.

First line contains a string str.

Output Format
Words that can be produced by pressed keys indictated by str in order hinted by Sample output

Example 1
Input

78
Output

tv
tw
tx
uv
uw
ux
Explanation

These are the strings that can be formed.

tv, tw, tx, uv, uw, ux

Example 2
Input

1
Output

a
b
c
Explanation

These are the strings that can be formed.

a, b, c

Constraints
0 <= str.length <= 10

str contains numbers only
Hint 2
Think about using recursion.

Approach 1:
Use recursion to solve the problem. Write a helper function having two parameters inputString and output.

Algorithm:

Using recursion, for the input string, always seperate out the 0th index element.
Iterate over the remaining string and add all the codes mapped to the seperated element to the output string.
Call recursion for the remaining string and the updated output string.

Time Complexity

O(4^NN): where N, is the length of input string. 4^N for building every possible string combination and N to form the string by joining each character.. Here, 4 is chosen assuming the worst case where each digit will be 7 or 9 and we would have 4444 total string combinations.

Space Complexity

The max recursion depth will be N, where N is the length of input string. If the space required for ans is considered as well, the complexity will be O(4^N)

1. Java*/
import java.io.*;
import java.util.*;

public class Keypadcombination {

    // Recursive helper function to generate all possible keypad combinations
    static void printKPCHelper(String ques, String ans) {

        // Mapping of digits (0–9) to corresponding characters (like old mobile keypads)
        // 0 -> ".;", 1 -> "abc", 2 -> "def", ...
        String[] codes = {
            ".;",   // 0
            "abc",  // 1
            "def",  // 2
            "ghi",  // 3
            "jkl",  // 4
            "mno",  // 5
            "pqrs", // 6
            "tu",   // 7
            "vwx",  // 8
            "yz"    // 9
        };

        // Base case: when input string (ques) becomes empty,
        // print the accumulated answer (ans)
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Take the first character (digit) of the input string
        char ch = ques.charAt(0);

        // roq (rest of question) → remaining digits after the first one
        String roq = ques.substring(1);

        // Get the corresponding code (letters) for the current digit
        // 'ch - 48' converts ASCII digit character ('0'-'9') to its integer value (0–9)
        for (char chcode : codes[ch - 48].toCharArray()) {
            // Append each possible letter to the answer
            // and recursively process the remaining digits
            printKPCHelper(roq, ans + chcode);
        }
    }

    // Wrapper function to start recursion with an empty answer string
    static void printKPC(String ques) {
        printKPCHelper(ques, "");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Read numeric string input from user (like "23")
        String str = sc.nextLine();

        // Print all possible letter combinations for this keypad number
        printKPC(str);
    }
}
