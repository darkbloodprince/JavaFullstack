/*Find The Way
You are given a binary matrix of dimensions m*n. A mouse enters the matrix at cell (0,0) in left to right direction.

He goes in the same direction if he encounters a 0 and he takes a right turn when he encounters a 1, and changes that specific 1 to 0. Otherwise he may get stuck in a cycle!

You have to find the co-ordinates from where this mouse will exit the matrix.

Input Format
First line contains the values m and n.

Next m lines contain n spaced integers.

Output Format
Return the co-ordinates from where this mouse will exit the matrix separated by space.

Example 1
Input

1 2
0 0
Output

0 1
Explanation

The mouse will enter at (0,0) and keep going ahead and come out of (0,1).

Example 2
Input

3 3
0 1 0
0 1 0
1 0 1
Output

1 0
Explanation

We enter the matrix at (0,0) we move to (0,1) and encounter a 1 so we change it to 0 and move right to (1,1), we again encounter 1 and turn right.

Then we leave the matrix from (1,0). Thus the output is 1 0.

Constraints
1 <= m,n <= 100

matrix[i][j] is 0, 1*/
import java.util.*;

public class FindTheWay {
    public static int[] findTheWay(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0, j = 0; // start at (0, 0)
        int dir = 0; // 0: right, 1: down, 2: left, 3: up

        // Directions:      Right     Down      Left     Up
        int[] dx = {0, 1, 0, -1}; 
        int[] dy = {1, 0, -1, 0}; 

        while (i >= 0 && i < m && j >= 0 && j < n) {
            if (matrix[i][j] == 1) {
                matrix[i][j] = 0;
                dir = (dir + 1) % 4; // Turn right
            }
            i += dx[dir];
            j += dy[dir];
        }

        // Step back to last valid cell
        i -= dx[dir];
        j -= dy[dir];

        return new int[]{i, j};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        int[] result = findTheWay(matrix);
        System.out.println(result[0] + " " + result[1]);

        sc.close();
    }
}
