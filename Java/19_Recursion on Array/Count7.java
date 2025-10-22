/*Count 7
Given a number N, your task is to find the number of occurrences of the digit 7 in the number.

Input Format
The first line contains an integer N denoting the number.

Output Format
For each test case return a number, denoting the number of occurrences of the digit 7 in the given number.

Example 1
Input

27727
Output

3
Explanation

There are 3 occurrences of the digit 7 in the number.

Example 2
Input

17245
Output

1
Explanation

There is 1 occurrence of the digit 7 in the number.

Constraints
1 <= N <= 10^9
Hint 1
Traverse the number using recursion and check the last digit at each step.

Approach :
The idea is to traverse the number and if at each step, the last digit is 7,

then add 1 to the ans and call the recursive function for the rest of the number.

Algorithm:

if (n % 10 == 7) return 1 + func7(n / 10)
else return func7(n / 10);
Also, the base case would be if n equals 0, the result is 0.

Time Complexity:

O(no. of digits in n)

Space Complexity:

O(1)

Below is the implementation of the above approach:

1. Java*/

import java.util.*;
// Importing the java.util package to use the Scanner class for user input.
public class Count7 {
    // Main class named 'Main' — execution of the program starts here.
    public static void main(String[] args) {
        // The main() method — entry point of the program.
        Scanner sc = new Scanner(System.in);
        // Creating a Scanner object to take input from the user.
        int n = sc.nextInt();
        // Reading an integer number 'n' from the user.
        System.out.println(count7(n));
        // Calling the recursive method 'count7' with 'n' as input.
        // It returns the count of digit '7' in the given number, which we print here.
        sc.close();
        // Closing the Scanner object to prevent memory/resource leaks.
    }
    public static int count7(int n) {
        // Recursive method to count how many times the digit '7' appears in a number 'n'.
        if (n == 0)
            return 0;
        // Base case:
        // When 'n' becomes 0, there are no digits left to check.
        // So, return 0 (end of recursion).
        if (n % 10 == 7)
            return 1 + count7(n / 10);
        // Check the last digit of the number using (n % 10):
        // If the last digit is 7, count it (add 1) and
        // recursively call 'count7' for the remaining digits (n / 10 removes the last digit).
        return count7(n / 10);
        // If the last digit is not 7, skip it and
        // call 'count7' again with the number divided by 10 (to check the next digit).
    }
}
