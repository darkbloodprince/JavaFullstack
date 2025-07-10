/*Transpose of Matrix
Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.

Expected Time Complexity: O(N * N)

Expected Space Complexity: Inplace

Input Format
The first line contains an integer N.

The next N lines contains N spaced integers each, elements of matrix.

Output Format
Print the transposed matrix.

Example 1
Input

4
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
Output

1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
Explanation

The rows and columns are switched.
Example 2
Input

5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15 
16 17 18 19 20
21 22 23 24 25
Output

1 6 11 16 21
2 7 12 17 22
3 8 13 18 23
4 9 14 19 24
5 10 15 20 25
Explanation

The rows and columns are switched. For example: 6 was at position 0, 1 in original matrix. In the transposed matrix, it is at position 1, 0.
Constraints
1 <= N <= 100

-10^3 <= mat[i][j] <= 10^3

Approach :

The transpose of a matrix A with dimensions R x C is a matrix ans with dimensions C x R for which ans[c][r] = A[r][c].

Let's initialize a new matrix ans representing the answer. Then, we'll copy each entry of the matrix as appropriate.

Time Complexity : O(N*M) . We are traversing the the matrix.

Space Complexity : O(1) We are using only constant space of memory.

Below is the implementation of above idea:*/

import java.util.*;     // Importing utility classes including Scanner
import java.io.*;       // Importing IO classes (not directly used here but common in templates)

class Solution {
    // Method to transpose a square matrix of size n x n
    public int[][] matrixTranspose(int[][] mat, int n) {

        // Transposing in-place by swapping elements across the diagonal
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap mat[i][j] with mat[j][i]
                int temp = mat[i][j]; 
                mat[i][j] = mat[j][i]; 
                mat[j][i] = temp; 
            }
        }

        // Return the transposed matrix
        return mat; 
    }
}

public class TransposeofMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner for input
        
        int n;
        n = sc.nextInt();  // Read size of matrix (n x n)

        int[][] matrix = new int[n][n];  // Declare a 2D array of size n x n

        // Read elements of the matrix
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();  // Fill matrix[i][j] with input

        Solution Obj = new Solution();  // Create an object of Solution class

        int[][] ans = Obj.matrixTranspose(matrix, n);  // Call the transpose method

        // Print the transposed matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");  // Print each element with space
            }
            System.out.println("");  // Newline after each row
        }

        sc.close();  // Close the Scanner to prevent memory leaks
    }
}
