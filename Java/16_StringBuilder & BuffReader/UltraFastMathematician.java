/*Ultra Fast Mathematician
Bob is given 2 numbers a and b, each of them contains only 0 and 1. Your task is to find a number c, such that if the ith digit of number a and b differ then the ith digit of c is 1, 0 in rest of the cases.

Input Format
The first line of input contains a number a.

The second line of input contains a number b.

Output Format
You need to find such a number c, such that if the ith character of a and b are different then the ith position of string c is 1, else 0 in any other case.

Example 1
Input

000
111
Output

111
Explanation

As the both the numbers have different digits in the ith position so the number c is 111.

Example 2
Input

01110
01100
Output

00010
Explanation

only the number at 4th position differs, so the number c has 4th digit as 1.

Constraints
1 <= a,b <= 10100

a,b - {0,1}
Hint 1
append 0 when ith digit is same
Approach 1 : Brute Force
In this question we just need to take input in the form of string or string builder and just, append 1 when the ith digit of number a and b differ else append 0.

Time Complexity

O(N), where N is the number of digits in the number

Space Complexity

O(N), where N is the number of digits in the number

Below is the implementation of the above idea:

1. Java*/
import java.util.*;  // Importing utility classes, including Scanner
public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Scanner to read input

        String A = scn.nextLine(); // Read the first binary string
        String B = scn.nextLine(); // Read the second binary string

        // Convert both strings into StringBuilder (optional here, since we are only reading characters)
        StringBuilder a = new StringBuilder(A);
        StringBuilder b = new StringBuilder(B);

        // Solve the problem and get the result string
        StringBuilder c = solve(a, b);

        // Print the resulting string
        System.out.println(c);
    }
    // Function to compute the bitwise XOR result between two binary strings
    static StringBuilder solve(StringBuilder a, StringBuilder b) {
        int s = a.length(); // Length of both strings (assumed to be equal)
        StringBuilder c = new StringBuilder(); // Resulting string builder for output

        // Loop over each character
        for (int i = 0; i < s; i++) {
            char a1 = a.charAt(i); // Character from first string at position i
            char b1 = b.charAt(i); // Character from second string at position i

            if (a1 == b1)
                c.append('0'); // If characters are same, append '0'
            else
                c.append('1'); // If characters are different, append '1'
        }

        return c; // Return the final XORed string
    }
}
