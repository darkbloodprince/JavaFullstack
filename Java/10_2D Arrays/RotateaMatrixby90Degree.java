/*Rotate a Matrix by 90 Degree
You are given a n x n 2-D matrix representing an image, rotate the image by 90 degrees (clockwise).

Input Format
The first line will contain two integers n and n again.

The next n lines contain n integers each representing the matrix.

Output Format
Return a matrix that is rotated by 90 degrees in the clockwise direction.

Example 1
Input

2 2 
1 2
2 3 
Output

2 1 
3 2
Explanation

We do a 90 degree clockwise rotation of the matrix.

Example 2
Input

3 3
7  2  3 
2  3  4 
5  6  1 
Output

5 2 7
6 3 2
1 4 3
Explanation

We do a 90 degree clockwise rotation of the matrix.

Constraints
1 <= n <= 100

Inplace solution

Approach 1:

The Approach is to rotate the given matrix two times, first time with respect to the Main diagonal, next time rotate the resultant matrix with respect to the middle column, Consider the following illustration to have a clear insight into it.

Algorithm:

Rotate the matrix first along the main diagonal, i.e by using nested for loops, the first loop going from 0 to n and the second loop traversing from 0 to i.
Rotate the resultant matrix with repect to the middle column, i.e using a nested loop where first for loop is from 0 to n and second for loop is from 0 to n/2.
Print the resultant array after the second rotation
Time Complexity: O(n*n) as we are traversing the matrix.

Space Complexity: O(n*n) for storing the result (worst case).

Below is the implementation of the above idea:*/
import java.util.*;
import java.io.*;
class Solution {
    public void rotateBy90(int[][] arr) {
        int n = arr.length; // Number of rows/columns (assuming it's a square matrix)
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                // Swap elements across the diagonal (transpose)
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n / 2; ++j) {
                // Reverse each row after transpose
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(arr[i][j] + " "); // Print rotated matrix
            }
            System.out.println();
        }
    }
}
public class RotateaMatrixby90Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt(); // Number of rows
        m = sc.nextInt(); // Number of columns
        int[][] mat = new int[n][m]; // Declare the matrix

        // Read matrix values from input
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }
        Solution Obj = new Solution(); // Create object of Solution class

        Obj.rotateBy90(mat); // Call rotateBy90 to rotate and print the matrix

        System.out.println('\n'); // Print a newline at the end
    }
}
