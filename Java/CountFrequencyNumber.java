/*CountFrequencyNumber
Given a number N and a digit D. Write a program to find how many times the digit D appears in the number N.

Input Format
A single line containing the integers N and D.

Output Format
Return a single integer representing the number of times the digit D appears in the number N.

Example 1
Input

1111221 1
Output

5
Explanation

1 occur 5 times in 1111221.

Example 2
Input

554 4
Output

1
Explanation

4 occur 1 time in 554.

Constraints
1 <= |n| <= 10^9

1 <= |d| <= 9*/
import java.util.*;

public class CountFrequencyNumber {

    static int countFreqDigit(int n, int d) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == d) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(countFreqDigit(n, d));
    }
}
