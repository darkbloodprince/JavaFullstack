/*Boundary Traversal of matrix
Given an m*n matrix, print the boundary traversal of the matrix in clockwise order.

Input Format
First line contains the values m and n.

Next m lines contain n-spaced integers.

Output Format
Print the boundary traversal of the matrix in clockwise order.

Example 1
Input

2 3
1 2 3
1 5 3
Output

1 2 3 3 5 1
Explanation

We can see that while traversing in a clockwise fashion we go in the order of 1, 2, 3, 3, 5, 1.

Example 2
Input

3 4
5 4 6 3
1 4 3 5
5 1 9 6
Output

5 4 6 3 5 6 9 1 5 1
Explanation

We can see that while traversing in a clockwise fashion we go in the order of 5, 4, 6, 3, 5, 6, 9, 1, 5, 1.

Constraints
1 <= n <= 10^3

1 <= m <= 10^3

1 <= mat[i][j] <=10^5

Approach 1:
Simply follow the matrix from left to right, top to bottom, right to left and bottom to top at the boundary. Lookout for edge cases when row = 1 or column = 1.

Algorithm

Check for edge cases when m==1 or n==1.
If edge case present then just print a single row or column.
Else on the boundary of the matrix iterate from left to right, then from top to bottom, right to left and then bottom to top.
Time Complexity

O(n+m)

Space Complexity

O(1)

Below is the implementation of the above idea:*/
import java.util.*;

public class BoundaryTraversalofmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading number of rows (m) and columns (n)
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Creating a matrix of size m x n
        int[][] matrix = new int[m][n];

        // Reading the elements of the matrix
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        // Calling the function to print boundary traversal
        boundaryTraversal(m, n, matrix);

        sc.close();
    }

    // Function to print boundary traversal of the matrix
    public static void boundaryTraversal(int m, int n, int[][] matrix) {
        // Special case 1: If there is only one row
        if (m == 1) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[0][j] + " ");
            }
            System.out.println();
        }
        // Special case 2: If there is only one column
        else if (n == 1) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][0] + " ");
            }
            System.out.println();
        }
        // General case: matrix with more than one row and column
        else {
            // 1. Top row (left to right)
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[0][j] + " ");
            }

            // 2. Rightmost column (top to bottom), starting from row 1
            for (int i = 1; i < m; i++) {
                System.out.print(matrix[i][n - 1] + " ");
            }

            // 3. Bottom row (right to left), starting from second-last column
            for (int j = n - 2; j >= 0; j--) {
                System.out.print(matrix[m - 1][j] + " ");
            }

            // 4. Leftmost column (bottom to top), starting from second-last row upwards (excluding top row)
            for (int i = m - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
            }

            System.out.println();  // Move to next line after traversal
        }
    }
}

