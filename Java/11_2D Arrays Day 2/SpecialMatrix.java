/*Special Matrix
A square matrix is called special matrix if all the non-diagonal elements of the matrix are zero and the diagonal elements are non-zero.

You are given a square matrix with N rows and columns. You have to check whether the given matrix is special or not. If the given matrix is special, true will be printed, else false.

NOTE: You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format:
The first line contains the number of test cases t.

For each test case: The first line contains N.

The next N lines contain N integers each representing the elements of the matrix.

Output Format:
For each test case in t, output t lines true if the matrix is special else false

Example 1:
Input:

1
3
1 0 2
0 2 0
3 0 1
Output:

true
Explanation:

The diagonal elements are non-zero and non-diagonal elements are zero.

Example 2:
Input:

1
3
1 0 1
1 2 0
2 0 3
Output:

false
Explanation:

The non-diagonal element in second row of first column is non-zero.

Constraints:
1 <= T <= 10

1 <= N <= 200

0 <= A[i] <=1000000
Approach 1:

The logic is simple. You need to print 1 in those positions where row is equal to the column of a matrix and make all other positions as 0.

Algorithm:

Traverse over the row and column.
As we are checking for special matrix or identity matrix, check whether the diagonal element is 1 or 0.
If (i==j) and then if(matrix[i][j]==0) return false else return true.
Similarly, for elements other than diagonal element, check if(matrix[i][j]!=0) return false else return true;
Time Complexity : O(N * N)
Space Complexity : O(1)

Below is the implementation of the above idea:

1. Java*/
import java.io.*;
import java.util.*;

class Solution {
    // Method to check whether a matrix is "special"
    static boolean special(int matrix[][], int n) {
        // Loop through every element of the matrix using 2 nested loops
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                // Check if the element is on the primary or secondary diagonal
                // Primary diagonal: i == j
                // Secondary diagonal: i + j == n - 1 (same as matrix.length - 1)
                if ((i == j) || (i + j) == (matrix.length - 1)) {
                    // Diagonal element must be non-zero
                    if (matrix[i][j] == 0)
                        return false;
                } else {
                    // Non-diagonal elements must be zero
                    if (matrix[i][j] != 0)
                        return false;
                }
            }
        }
        // If all elements passed the check, return true
        return true;
    }
}
class SpecialMatrix {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Read number of test cases
        int t = sc.nextInt();

        // Run the loop for each test case
        while (t-- > 0) {
            int n = sc.nextInt(); // Read matrix size (n x n)

            int matrix[][] = new int[n][n]; // Declare the matrix

            // Read the matrix elements from input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    matrix[i][j] = sc.nextInt();
            }

            // Create a Solution object and call the special() method
            Solution ob = new Solution();
            boolean ans = ob.special(matrix, n); // Get the result

            // Print the result for this test case
            System.out.println(ans);
        }
    }
}
