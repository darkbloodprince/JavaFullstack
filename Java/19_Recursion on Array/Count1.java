/*Count 1
Given a number N, your task is to find the number of occurrences of the digit 1 in the number. Do it recursively.

Input Format
The first line contains an integer N denoting the number.

Output Format
For each test case return a number, denoting the number of occurrences of the digit 1 in the given number.

Example 1
Input

21121
Output

3
Explanation

There are 3 occurrences of the digit 1 in the number.

Example 2
Input

11245
Output

2
Explanation

There are 2 occurrences of the digit 1 in the number.

Constraints
1 <= N <= 10^9
Hint 1
Traverse the number using recursion and check the last digit at each step.

Approach :

The idea is to traverse the number and if at each step, the last digit is 1, then add 1 to the ans and call the recursive function for the rest of the number.

Algorithm:

if (n % 10 == 1) return 1 + func7(n / 10)
else return func7(n / 10);
Also, the base case would be if n equals 0, the result is 0.

Time Complexity : O(no. of digits in n)

Space Complexity : O(1)

Below is the implementation of the above approach:

1. Java*/


import java.util.*;
// Importing the java.util package to use the Scanner class for taking input.
public class Count1 {
    // The main class named 'Main' which contains the main method and one helper method.
    static int count1(int n) {
        // Recursive method to count how many times the digit '1' appears in a given number 'n'.
        if (n == 0)
            return 0;
        // Base case:
        // When the number becomes 0, there are no more digits left to check.
        // So, return 0 (no '1' found beyond this point).
        if (n % 10 == 1)
            return 1 + count1(n / 10);
        // If the last digit (n % 10) is '1',
        // count it (add 1), and then recursively call the function
        // for the remaining digits (n / 10 removes the last digit).
        return count1(n / 10);
        // If the last digit is not '1',
        // skip it and move to the next digit by dividing the number by 10.
    }
    public static void main(String[] args) {
        // The main method — execution starts here.
        Scanner sc = new Scanner(System.in);
        // Create a Scanner object to read user input from the console.
        int n = sc.nextInt();
        // Read an integer input 'n' from the user.
        System.out.println(count1(n));
        // Call the count1() function with input 'n'
        // and print how many times the digit '1' appears in that number.
        sc.close();
        // Close the Scanner object to prevent resource leaks.
    }
}
