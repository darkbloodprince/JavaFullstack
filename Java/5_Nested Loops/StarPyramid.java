/*Star Pyramid
Given an integer n, print a pyramid full of stars with height equal to n.

Input Format
The first line of input contains the integer n.

Output Format
The output should contain a pyramid filled with stars with height equal to n.

Example 1
Input

3
Output:

Pattern Image

Example 2
Input

7
Output

Pattern Image

Constraints
1 <= n <= 200*/
import java.util.*;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        //Write your code here and print the required output
        int m = n-1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            m--;
        }

    }
}