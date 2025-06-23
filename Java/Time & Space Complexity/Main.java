/*Natural Sum
Write a program to calculate the sum of first N natural numbers.

Note: Natural numbers are the numbers that start from 1 and end at infinity.

Input Format
First line contains an integer N

You need to complete printSum function which contains N natural number and return sum of final summation upto N.

Output Format
Print the sum in first line

Example 1
Input

10
Output

55
Explanation

Here, sum is 55 i.e. 1+2+3+4+....+9+10 = 55.

Example 2
Input

20
Output

210
Explanation

Here, sum is 210 i.e. 1+2+3+4+....+19+20 = 210.

Constraints
1 <= N <= 10^3

Approach 1
The sum of first N natural numbers is given by (n*(n+1))/2.

Algorithm:

Simply return the value n*(n+1)/2.
Time complexity

O(1) will be the time complexity because we can find the sum using simple formula.

Space Complexity

O(1) ,since we take the same amount of input/space to implement.

Below is the implementation of the above idea:*/

import java.util.*; // Importing the utility package for Scanner class

public class Main {

    // Function to calculate the sum of first N natural numbers
    static int printSum(int N){
        // Using the formula: Sum = N * (N + 1) / 2
        return N * (N + 1) / 2;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take input
        int N = sc.nextInt(); // Read an integer N from the user
        System.out.println(printSum(N)); // Call printSum() and print the result
    }
}

/*Time: O(1)
Space: O(1)*/
