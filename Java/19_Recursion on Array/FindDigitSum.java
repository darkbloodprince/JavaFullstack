/*Find Digit Sum
Given the number n, find out and return the sum of digits present in a number recursively.

Input Format
Input consists of single line which has the integer n.

Output Format
Return the sum of digits present in n.

Example 1
Input

1256
Output

14
Explanation

Here the sum is 1+2+5+6 = 14.

Example 2
Input

12345
Output

15
Explanation

Here the sum is 1+2+3+4+5 = 15.

Constraints
1 <= n <= 10^9
Hint 1
Think about the base case and the recurrence relation.

Approach 1:

We set the base case as if(n==0) return 0; as when there is no digit left in the number of if the number is 0 then the sum would be 0.

The recurrence relation will be n%10 + f(n/10) as we will add the last digit in the number using the %(modulo) operation

and then remove that last digit by diving current i/p by 10 and passing it as the new i/p to the same function.

Time Complexity : O(logn) Space Complexity : O(logn)

1. Java*/


import java.util.*; // Import utility classes, including Scanner for input

public class FindDigitSum {

    // Recursive function to calculate the sum of digits of a number
    static int sumOfDigi(int n) {
        if (n == 0) // Base case: if the number becomes 0, there are no digits left to add
            return 0;

        // Recursive case:
        // 1. n % 10 gives the last digit of the number
        // 2. sumOfDigi(n / 10) calculates the sum of digits of the remaining number
        // 3. Add the last digit to the sum returned by the recursive call
        return n % 10 + sumOfDigi(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input
        
        int n = sc.nextInt(); // Read the input number
        
        int result = sumOfDigi(n); // Call the recursive function to calculate digit sum
        
        System.out.println(result); // Print the result
        
        sc.close(); // Close the Scanner object
    }
}
