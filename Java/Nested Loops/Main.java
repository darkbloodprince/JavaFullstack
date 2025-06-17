/*Staircase
In this question, you need to write a program that prints a staircase of size N.

This is a staircase of size n=4:

   #
  ##
 ###
####
Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Input Format
A single integer, n, denotes the size of the staircase.

Output Format
Print a staircase of size n using # symbols and spaces.

Note: The last line must not have spaces in it.

Example 1
Input

6
Output

     #
    ##
   ###
  ####
 #####
######
Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6.

You might notice, first line has 5 spaces (n-1) followed by 1 # and the last line has 0 spaces (n-n) and 6 # (n)

Example 2
Input

5
Output

    #
   ##
  ###
 ####
#####
Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=5.

You might notice, first line has 4 spaces (n-1) followed by 1 # and the last line has 0 spaces (n-n) and 5 # (n)

Constraints
1 <= n < 100*/
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Create a Scanner object for input
        int n = scn.nextInt(); // Read the number of rows (height of the staircase)

        int space = n - 1;  // Initial number of spaces before the first #
        int hst = 1;        // Initial number of '#' symbols in the first row

        // Loop through each row from 1 to n
        for (int row = 1; row <= n; row++) {

            // Print the required number of spaces for the current row
            for (int sp = 1; sp <= space; sp++) {
                System.out.print(" "); // Print a space without newline
            }

            // Print the required number of '#' for the current row
            for (int ht = 1; ht <= hst; ht++) {
                System.out.print("#"); // Print # without newline
            }

            // Move to the next line after one row is printed
            System.out.println();

            // Decrease the space count and increase the # count for the next row
            space = space - 1;
            hst = hst + 1;
        }
    }
}
