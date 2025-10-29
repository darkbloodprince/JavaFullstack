/*String Encodings
You have given string str of digits.

You are required to encode the str as per the following rules

    1 -> a
    2 -> b
    3 -> c
    ..
    25 -> y
    26 -> z
Your task is to calculate all the possible encodings and print them in new line. If no encoding is possible, print nothing.

Note: print all the possible encodings in lexographical manner.

Input Format
First line contains the string str

Output Format
Print the various encodings in new line.

Example 1
Input

123
Output

abc
aw
lc
Explanation

We have three encoding, abc => {1,2,3}, aw => {1, 23}, lc => {12, 3}

Example 2
Input

013
Output

Explanation

String starts with 0, which makes it invalid.

Example 3
Input

303
Output

Explanation

We have no encoding as we can split str as {3, 0, 3}, {30, 3}, or {3, 03}. In {3, 0, 3} we dont have a character for 0. In {30, 3} we dont have a character for 30. In {3, 03}, 03 is invalid.

Constraints
0 <= str.length <= 10
Hint 3
Try identifying the base case

Approach 1:

We need to find the various encoding that can be derived from our given string str. For doing this, we use recursion.

Base Case: if length of str is 0, then no more encodings can be taken from it, so our ans string will have a possible encoding, so we add it to our bank array, which stores all the encodings. Recursive Subproblem: At any instance, we do two things,

we take out the first digit from str, and append it's encoded character to ans, and call recursive function on the remaining str and new ans.
we check the first two digits of str and see if they have a encoded character or not, if they do, then we add the encoded character to ans, and call recursive function on the remaining str and new ans.
Both of the above two processes can be skipped if the first digit is 0, as in that case we dont have a encoded character.

Time Complexity : O(2^n)

Space Complexity : O(2^n)

Below is the implementation of the above idea:

1. Java*/
import java.util.*;

public class StringEncodings {
	public static void printEncodingsHelper(String str, String ans, ArrayList<String> bank) {
        int len = str.length();
        if (len == 0) {
            bank.add(ans);
            return;
        }

        int num = str.charAt(0) - '0';
        if(num > 0)
            printEncodingsHelper(str.substring(1), ans + (char)('a' + (num-1)), bank);

        if(len == 1  ||  num == 0)
            return;

        num = Integer.parseInt(str.substring(0, 2));
        if(num <= 26)
            printEncodingsHelper(str.substring(2), ans + (char)('a' + (num-1)), bank);
    }

    public static void printEncodings(String str) {
        ArrayList<String> bank = new ArrayList<>();
        printEncodingsHelper(str, "", bank);
        for(String s : bank) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str);
    }
}