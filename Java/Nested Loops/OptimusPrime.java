/*Optimus Prime
Given an integer n, print all prime numbers between 1 and n (both inclusive).

Example:

If n = 8, your program should output all prime numbers between 1 and 8. Thus, it should output:

2
3
5
7
Input Format
The first line of the input contains one integer n.

Output Format
Your code should output all integers between 1 and n that are prime (both inclusive).

Example 1
Input:

8
Output:

2
3
5
7
Example 2
Input:

13
Output:

2
3
5
7
11
13
Constraints
1 <= n <= 10^5*/
import java.util.*;

public class OptimusPrime {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        if (n < 2) return;  // no primes less than 2
        
        // Boolean array, isPrime[i] will be true if i is prime
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        // Sieve
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }
        
        // Print all primes
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
