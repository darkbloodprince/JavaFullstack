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

public class Staircase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int i = 1; i <= n; i++) {
            // print (n - i) spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // print i '#' characters
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            // move to next line
            System.out.println();
        }
        
        scn.close();
    }
}
