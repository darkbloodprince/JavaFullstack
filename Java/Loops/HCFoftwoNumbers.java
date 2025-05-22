/*HCF of two Numbers
Given two number a and b, find their HCF.

What Is HCF?

HCF or Highest Common Factor is the greatest common divisor between two numbers.

Input Format
The first line of input contains the integers a and b.

Output Format
The output should be the hcf of a and b.

Example 1
Input

75 90
Output:

15
Explanation

75 = 3 * 5 * 5 and 90 = 2 * 3 * 3 * 5. So the common factors are 3*5 = 15.

Example 2
Input

25 50
Output

25
Explanation

25 = 5 * 5 and 50 = 2 * 5 * 5. So the common factors are 5*5 = 25.

Constraints
1 <= n <= 10^9*/
import java.util.*;

public class HCFoftwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int hcf = findHCF(a, b);
        System.out.println(hcf);
    }

    // Euclidean Algorithm for HCF
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
