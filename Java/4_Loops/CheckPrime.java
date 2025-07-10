/*Check Prime
Write a program that inputs a positive integer N. It should then output a message indicating whether the number is a prime number or not.

Input Format
A single line containing the integer N

Output Format
Print a string, either "N is a prime number" or "N is not a prime number" (without quotes), depending on whether N is prime or not.

Example 1
Input

5
Output

5 is a prime number
Explanation

5 is only divisible by itself and 1, hence it's a prime number.

Example 2
Input

10
Output

10 is not a prime number
Explanation

1,2,5 & 10 are factors of 10, hence it is not a prime number.

Constraints
1 <= n <= 10^9*/
import java.util.*;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    // Returns true if n >= 2 and has no divisors other than 1 and itself
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n % 2 == 0) {
            return n == 2;
        }
        int limit = (int)Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
