/*Maxima Minima
Given an n*n matrix mat find an element such that it is the smallest in a row and largest in a column, if such an element does not exist return -1.

Input Format
First line contains the values n.

Next n lines contain n spaced integers.

Output Format
Return the element that is smallest in a row and largest in a column if not found return -1.

Example 1
Input

2
1 3
6 5
Output

5
Explanation

Row 2 contains minimum element 5 that is largest in the 2nd column.

Example 2
Input

3
1 2 3
4 5 6
7 8 9
Output

7
Explanation

Here the minimum value is 7 in the third row and the largest value in the 1st column.

Constraints
1 <= n <= 10^3

1 <= mat[i][j] <=10^5*/
import java.util.*;

public class MaximaMinima {
    public static int maximaMinima(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            // Find the minimum in the row
            int minInRow = mat[i][0];
            int colIndex = 0;
            for (int j = 1; j < n; j++) {
                if (mat[i][j] < minInRow) {
                    minInRow = mat[i][j];
                    colIndex = j;
                }
            }

            // Check if this is the maximum in its column
            boolean isMaxInCol = true;
            for (int k = 0; k < n; k++) {
                if (mat[k][colIndex] > minInRow) {
                    isMaxInCol = false;
                    break;
                }
            }

            if (isMaxInCol) {
                return minInRow;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima(matrix);
        System.out.println(result);
        sc.close();
    }
}
