/*Print Even Numbers
You are given an integer N. Your task to print all the even numbers from 0 to N.

Input Format
The input contains a single integer N.

Output Format
Output all the even numbers from 0 to N.

Example 1
Input:

8
Output:

0 2 4 6 8
Example 2
Input:

7
Output:

0 2 4 6*/
import java.util.*;

class PrintEvenNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i <= N; i += 2) {
            System.out.print(i + " ");
        }
    }
}
