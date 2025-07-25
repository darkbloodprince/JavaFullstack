/*Factorial with loop
Factorial of any given number n is represented as n! = n * n-1 * n-2 .....* 1. Write a program to calculate the factorial of a given number.

Note: Factorial of 0 is 1.

Input Format
The first line consists of a single integer denoting n.

Output Format
Output is a single line containing factorial of n.

Example 1
Input:

5
Output:

120
Explanation:

5! = 5*4*3*2*1 = 120.
Example 2
Input:

4
Output:

24
Explanation:

4! = 4*3*2*1 = 24.
Constraints
0 <= n <= 20*/
import java.util.*;

public class Factorialwithloop {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
