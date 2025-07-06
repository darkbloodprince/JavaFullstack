/*Spirally traversing a matrix
Given a matrix of size r*c, where r is number of rows and c is number of columns. Traverse the matrix in spiral form.

Input Format
Input consists of two lines

The first line contains two integers r and c which denotes number of rows and columns respectively.

The next r lines contains c spaced integers, which are the elements of the matrix.

Output Format
Print the spiral matrix.

Example 1
Input

4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Output

1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Explanation:

We iterate spirally and print each element.

Example 2
Input

3 4  
1 2 3 4
5 6 7 8
9 10 11 12
Output

1 2 3 4 8 12 11 10 9 5 6 7
Explanation:

We iterate spirally and print each element.

Constraints
1 <= r, c <= 100

0 <= matrix[i][j] <= 100
Approach 1:

Traverse the matrix in a spiral fashion. This means, first row -> last column -> end row -> first column and keep doing it till we reach the center of the matrix.

Algorithm:

Keep four pointers, StartCol, StartRow, EndCol, EndRow. Initialize them to 0.
In order, traverse the StartRow, and then increment it. Traverse the EndCol and decrement it. Traverse EndRow and decrement it and lastly, traverse the StartCol and increment it.
Keep doing it till StartRow is less than or equal to EndRow and StartCol is less than equal to EndCol.
Time Complexity : O(r*c) as we are traversing the matrix. Space Complexity : O(1) .

Below is the implementation of the above idea:

1. Java*/
import java.io.*;
import java.util.*;

public class Spirallytraversingamatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading the dimensions of the matrix
        int n, m;
        n = sc.nextInt(); // number of rows
        m = sc.nextInt(); // number of columns

        // Declaring and reading the matrix
        int [][]mat = new int[n][m];
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                mat[i][j] = sc.nextInt(); // reading matrix elements
            }
        }

        // Call to function to print spiral traversal
        spirallyTraverse(mat);     

        // Print newline after output
        System.out.println('\n');
    }

    // Function to print elements of the matrix in spiral order
    public static void spirallyTraverse(int [][]mat) {
        int n = mat.length;     // number of rows
        int m = mat[0].length;  // number of columns

        // Define the boundaries of the matrix
        int sr = 0;         // starting row
        int sc = 0;         // starting column
        int er = n - 1;     // ending row
        int ec = m - 1;     // ending column

        // Loop while the starting indices are less than or equal to ending ones
        while(sr <= er && sc <= ec){

            // Traverse the top row from left to right
            for(int i = sc; i <= ec; ++i){
                System.out.print(mat[sr][i] + " ");
            }
            sr++; // move down to next row

            // Traverse the right column from top to bottom
            for(int i = sr; i <= er; ++i){
                System.out.print(mat[i][ec] + " ");
            }
            ec--; // move left to previous column

            // Check if bottom row is left to process
            if(sr <= er){
                // Traverse the bottom row from right to left
                for(int i = ec; i >= sc; --i){
                    System.out.print(mat[er][i] + " ");
                }
                er--; // move up to previous row
            }

            // Check if left column is left to process
            if(sc <= ec){
                // Traverse the left column from bottom to top
                for(int i = er; i >= sr; --i){
                    System.out.print(mat[i][sc] + " ");
                }
                sc++; // move right to next column
            }
        }
    }
}
