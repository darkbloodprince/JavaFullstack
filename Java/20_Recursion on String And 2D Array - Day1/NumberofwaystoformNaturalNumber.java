/*Number of ways to form Natural Number
Find number of ways an integer N can be represented as a sum of unique natural numbers.

Input Format
First line contains a single integer N.

Output Format
Print a single integer containing number of ways.

Example 1
Input

6
Output

4
Explaination

6 can be represented as (1, 2, 3), (1, 5), (2, 4), (6)

Example 2
Input

7
Output

5
Explaination

7 can be represented as (1, 2, 4), (1, 6), (2, 5), (3, 4), (7)

Constraints
0 <= N <= 120
Hint 1
Ensure than numbers in a group are not repeated by only adding incremental values in a group.

Approach
In order to ensure that the numbers in a group forming the number N are not repeated, we take them in an increasing order, and to create different paths (i.e. groups of numbers) resulting in the sum N, we try every number less than or equal to N in incremental order and create a recursive function which calls itself twice.

Time Complexity:

O(2N)

Space Complexity:

O(1)

1. JAVA*/
import java.io.*;
import java.util.*;
public class NumberofwaystoformNaturalNumber {
    public static long ways(int n, int i){
        if(i > n)
            return 0;
        if(n == i)
            return 1;

        return ways(n - i, i + 1) + ways(n, i + 1);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(ways(n, 1));
    }
}