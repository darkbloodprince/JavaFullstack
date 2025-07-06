/*Sum of upper and lower triangles
Given a square matrix of size n*n, print the sum of upper and lower triangular elements.

Upper Triangle consists of elements on the diagonal and above it.

Lower triangle consists of elements on the diagonal and below it.

Note

Diagonal here refers to the primary diagonal (starting at upper left corner and ending at bottom right corner).

Your task is to complete the function triangleSums which receives n and input matrix as parameters and prints the sum of upper and lower triangles separated by space.

Input Format
First line contains the value 'n'.

Next 'n' of each lines contain 'n' spaced integers.

Output Format
Print space separated sum of upper triangle followed by lower triangle.

Example 1
Input

3
1 2 3
1 5 3
4 5 6
Output

20 22
Explanation

Sum of lower triangle is 1+5+6+1+5+4 = 22 and upper triangle is 1+5+6+2+3+3 = 20

Example 2
Input

2
1 2
5 6
Output

9 12
Explanation

Sum of lower triangle is 1+6+5= 12 and upper triangle is 1+6+2 = 9

Constraints
1 <= n <= 10^3

1 <= mat[i][j] <=10^3
Approach 1:
Iterate over the entire matrix and keep two variables to store the sum. If j>=i that means we are in upper half otherwise if j<=i it means we are in the lower half.

Algorithm:

Iterate over the entire matrix and keep two variables to store the sum.
If j>=i upper+=matrix[i][j], If j<=i lower+=matrix[i][j].

Time Complexity

O(n^2) we go over the entire matrix.

Space Complexity

O(1) constant space used.

Below is the implementation of the above idea:

1. Java*/
import java.util.*;

public class Sumofupperandlowertriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input
        int n;
        n = sc.nextInt(); // Read size of the matrix (n x n)

        // Declare and initialize the matrix
        int[][] matrix = new int[n][n];
        
        // Read matrix elements
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        // Call the function to calculate triangle sums
        triangleSums(n, matrix);

        sc.close(); // Close the scanner
    }

    // Function to calculate upper and lower triangle sums
    public static void triangleSums(int n, int[][] matrix) {
        int lower = 0, upper = 0;

        // Loop through the entire matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // If element is in the upper triangle (j >= i)
                if (j >= i)
                    upper += matrix[i][j];

                // If element is in the lower triangle (j <= i)
                if (j <= i)
                    lower += matrix[i][j];
            }
        }

        // Print the sums in format: upper lower
        System.out.println(upper + " " + lower);
    }
}
