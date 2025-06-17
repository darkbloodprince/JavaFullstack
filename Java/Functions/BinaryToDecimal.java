/*Binary To Decimal
Given binary representation of a number , convert it to decimal representation.

Note : You just need to complete binaryToDecimal function.

Input Format
Single line consisting of an integer n.

Output Format
Print decimal representation of the number

EXAMPLE 1
Input:

111

Output::

7

EXPLANATION:


111 is the binary representation of 7

EXAMPLE 2
Input:


11011
Output::

27

EXPLANATION:


11011 is the binary representation of 27 

CONSTRAINTS
1 <= n <= 10^9*/
import java.util.Scanner;

public class BinaryToDecimal {
    public static long binaryToDecimal(long binaryNumber) {
        long decimal = 0;
        long base = 1; // 2^0

        while (binaryNumber > 0) {
            long lastDigit = binaryNumber % 10;
            decimal += lastDigit * base;
            base *= 2;
            binaryNumber /= 10;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long binaryNumber = scanner.nextLong();
        System.out.println(binaryToDecimal(binaryNumber));
        scanner.close();
    }
}
