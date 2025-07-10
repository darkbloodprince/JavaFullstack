/*Count Digits
Write a program to find the total number of digits in a single input number n.

Your task is to complete the function numDigits which receives n as the parameter and returns the number of digits in n.

Input Format
First line contains an integer number n.

Output Format
Print the count of digits in first line.

Example 1
Input

13472
Output

5
Explanation

The number has 5 digits

Example 2
Input

123456
Output

6
Explanation

The number has 6 digits

Constraints
1 <= n <= 10^9

Approach 1
We use the concept that if a number is divided by 10 and stored in an integer it loses one digit from the back

as 1234/10 = 123.4 which when stored in an integer variable is 123

We execute a loop to keep dividing by 10 until the number becomes 0, The number of iterations is the count of digits in the number

Time Complexity

As the loop is running for the number of digits in the number we can say that the time complexity of the program is O(n) where n is the number of digits in the number

Space Complexity

As we are only storing constant integers the space complexity is O(1).*/

import java.util.*;

public class Main {

    // Function to count number of digits in a given integer
    static int numDigits(int num){
        int count = 0;

        // Loop until all digits are processed
        while (num > 0) {
            num = num / 10;     // Remove the last digit
            count = count + 1;  // Increment digit count
        }

        return count; // Return the total digit count
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Read an integer input from the user

        // Print the number of digits in the input number
        System.out.println(numDigits(n));
    }
}

/*Time: O(log₁₀N)
Space: O(1)*/