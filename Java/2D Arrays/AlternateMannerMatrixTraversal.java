/*Alternate Manner Matrix Traversal
Given a 2D matrix mat of M rows and N columns , the task is to print the 2D matrix in an alternate manner.

Alternate manner denotes that the elements of the odd rows (first row, third row, etc) will be printed from left to right, and the elements of the even rows(second row, fourth row, etc.) will be printed from right to left.

For example, if M=3, then the first line will contain all the elements of the first row of the matrix from left to right. The second line will contain all the elements of the second row from right to left. The third line will contain all the elements of the third row from left to right.

Input Format
The first line contains two integers, M and N, representing the number of rows and columns, respectively.

The next M lines contain N space-separated integers, denoting the matrix.

Output Format
There will be 1 line with all the elements of the matrix after performing the alternate traversal. The elements will be separated by space.

Examples
Input

2 2
1 2
2 3
Output

1 2 3 2
Explanation

There are 2 rows in the matrix. In the first row from left to right the elements are :- 1 2. As this is an odd row, they will be printed from left to right. In the second row, from left to right the elements are :- 2 3. As this is an even row, elements will be printed from right to left.

Input

3 3
7 2 3
2 3 4
5 6 1
Output

7 2 3 4 3 2 5 6 1
Explanation

There are 3 rows in the matrix. In the first row from left to right the elements are :- 7 2 3. As this is an odd row, they will printed from left to right. In the second row from left to right the elements are :- 2 3 4. As this is an even row elements, will be printed from right to left. In the third row, from left to right the elements are :- 5 6 1. As this is an odd row they will printed from left to right.

Constraints
1<=M<=300

1<=N<=300

Approach 1:
First iterate from the first row and as it is an odd row so its elements will be printed from left to right. Next, iterate the second row, and as it is an even row, its elements will be printed from right to left. Like this, from 1 to M, every row will be iterated and elements will be printed as based on odd row or even row.

Algorithm:

Iterate every row from 1 till M.
For each row check if it is an even row or an odd row.
If it is an odd row then elements will be printed from left to right.
If it is an even row then elements will be printed from right to left.

Time Complexity:

O(M*N): we go over the entire 2D Matrix.

Space Complexity:

O(1): constant space used.

Below is the implementation of the above idea:*/

import java.util.*; // Import utility package for Scanner

// Class containing logic to print elements alternately
class Solution {
    public void printElementsAlternately(int[][] mat, int m, int n) {
        // Traverse through each row
        for (int i = 0; i < m; i++) {
            // For odd-indexed rows, print from right to left
            if (i % 2 != 0) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            // For even-indexed rows, print from left to right
            else {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}

public class AlternateMannerMatrixTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        int m, n;
        m = sc.nextInt(); // Read number of rows
        n = sc.nextInt(); // Read number of columns

        int[][] mat = new int[m][n]; // Declare a 2D array (matrix) of size m x n

        // Read the matrix elements row-wise
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        // Create Solution object and call the method to print elements alternately
        Solution Obj = new Solution();
        Obj.printElementsAlternately(mat, m, n);

        sc.close(); // Close scanner
    }
}

/*Time: O(m × n)
Space: O(1)*/