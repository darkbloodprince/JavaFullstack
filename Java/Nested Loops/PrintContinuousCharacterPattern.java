/*Print Continuous Character Pattern
Given an integer n that denotes the number of rows to be printed, print the pattern in which each row starts with its corresponding alphabet and has a length equal to the row number. (See the examples for a better understanding).

Note: You can take the alphabet to be cyclic. On reaching Z, you will cycle back to A, then B, and so on.

Input Format
First line contains the value n representing the number of rows.

Output Format
Print the pattern.

Example 1
Input

5
Output



Example 2
Input

8
Output



Constraints
1 <= n <= 26*/
import java.util.*;

public class PrintContinuousCharacterPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i); // Starting character for the row
            for (int j = 0; j <= i; j++) {
                // Cycle back to 'A' after 'Z' if needed
                char current = (char) ('A' + (ch - 'A' + j) % 26);
                System.out.print(current);
            }
            System.out.println(); // Move to next line
        }
    }
}
