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

1 <= N <= 500000*/
import java.io.*;
import java.util.*;

public class StrangeString {
    static String strangeString(int n) {
        Deque<Character> deque = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            char ch = (char) ('a' + (i % 26));
            if (i % 2 == 0) {
                deque.addFirst(ch);
            } else {
                deque.addLast(ch);
            }
        }

        StringBuilder result = new StringBuilder(n);
        for (char c : deque) {
            result.append(c);
        }

        return result.toString();
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0){
            int n = input.nextInt();
            System.out.println(strangeString(n));
        }
    }
}
