/*Armstrong Number
Write a program to print out all Armstrong numbers between 1 and N.

A number is called an Armstrong number if the sum of cubes of each digit of the number is equal to the number itself.

For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

Input Format
The input contains a single integer representing N.

Output Format
Print all the Armstrong numbers from 1 to N in separate lines.

Example 1
Input

200
Output

1
153
Explanation

1 and 153 are only Armstrong numbers between 1 to 200.

Example 2
Input

1000
Output

1
153
370
371
407
Explanation

1, 153, 370, 371, 407 are only Armstrong numbers between 1 to 1000.

Constraints
1 <= N <= 10^6*/
import java.util.Scanner;

public class ArmstrongNumber {
    // Precompute cubes of 0–9
    private static final int[] CUBE = new int[10];
    static {
        for (int d = 0; d < 10; d++) {
            CUBE[d] = d * d * d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        for (int i = 1; i <= N; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Returns true if sum of cubes of digits equals the number itself
    private static boolean isArmstrong(int x) {
        int sum = 0, m = x;
        while (m > 0) {
            sum += CUBE[m % 10];
            m /= 10;
        }
        return sum == x;
    }
}
