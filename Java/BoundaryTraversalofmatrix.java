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

1 <= mat[i][j] <=10^5*/
import java.util.*;

public class BoundaryTraversalofmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        boundaryTraversal(m, n, matrix);
        sc.close();
    }

    public static void boundaryTraversal(int m, int n, int[][] matrix) {
        // Top row
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[0][i] + " ");
        }

        // Right column
        for (int i = 1; i < m; i++) {
            System.out.print(matrix[i][n - 1] + " ");
        }

        // Bottom row (only if more than 1 row)
        if (m > 1) {
            for (int i = n - 2; i >= 0; i--) {
                System.out.print(matrix[m - 1][i] + " ");
            }
        }

        // Left column (only if more than 1 column)
        if (n > 1) {
            for (int i = m - 2; i >= 1; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }
    }
}
