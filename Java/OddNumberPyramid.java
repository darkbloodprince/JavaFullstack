/*Odd Number Pyramid
Take input of N from the user and write a program to print the Full Pyramid Number pattern as follows (N=4) :

Pattern Image

Input Format
Input consists of the integer N.

Output Format
Print the pattern for value N.

Example 1
Input

4
Output

   1   
  333  
 55555 
7777777
Explanation

Input is 4 means we have 4 lines, and each line has odd numbers which keep on increasing with every row.

Example 2
Input

3
Output

  1   
 333  
55555 
Explanation

Input is 3 means we have 3 lines, and each line has odd numbers which keep on increasing with every row.

Constraints
1 <= N <= 100*/
import java.util.*;

public class OddNumberPyramid {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int row_size = cs.nextInt();
        cs.close();
        printPattern(row_size);
    }

    public static void printPattern(int row_size) {
        // Total width of each line is (2*row_size - 1)
        for (int i = 1; i <= row_size; i++) {
            int num = 2 * i - 1;            // the odd number for this row
            int count = num;                // how many times to print it
            int spaces = row_size - i;      // leading (and trailing) spaces

            // leading spaces
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            // the odd number repeated
            for (int j = 0; j < count; j++) {
                System.out.print(num);
            }
            // trailing spaces (optional, for strict centering)
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            // next line
            System.out.println();
        }
    }
}
