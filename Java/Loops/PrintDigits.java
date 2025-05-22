/*Print Digits
Given the number n, print its digits starting from most significant digit to least significant digit.

Input Format
Input consists of single line which has the integer n.

Output Format
print the digits of number one line at a time.

Example 1
Input

1256
Output

1
2
5
6
Explanation

Here, the digits are, 1,2,5,6.

Example 2
Input

12345
Output

1
2
3
4
5
Explanation

Here the digits are 1,2,3,4,5.

Constraints
1 <= n <= 10^9*/
import java.util.*;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Convert the number to a string to easily access each digit in order
        String numStr = Integer.toString(n);
        
        for (int i = 0; i < numStr.length(); i++) {
            System.out.println(numStr.charAt(i));
        }
    }
}
