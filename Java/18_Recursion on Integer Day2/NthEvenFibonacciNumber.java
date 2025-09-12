/*Nth Even Fibonacci Number
Given a positive integer N, find the Nth Even Fibonacci number.

Fibonacci Series is a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.

Note:

Since the answer could be very large, use long datatype in JAVA to store the answer. Similarly, use long long in C++.

Return the answer in modulo 109 + 7

Input Format
First line contains the positive integer N.

Output Format
Return the required number.

Example 1
Input

1
Output

2
Explanation

2 is the first even number in the Fibonacci series. (1 1 "2" 3 ....)

Example 2

Input

2
Output

8
Explanation

8 is the second even number in the fibonacci series. (1 1 2 3 5 "8")

Constraints

1 <= n <= 20
Hint 2
Think Recursively

Approach 1:
The Fibonacci sequence for even numbers is 0, 2, 8, 34, 144, 610, and 2584. We must locate the nth number in this series. Every third number in the Fibonacci sequence is an even number, and the even numbers follows the recursive formula given below, as can be seen if we look at the sequence more closely. EFn = 4EFn-1 + EFn-2, where EF0 = 0, EF1 = 2

Derivation:
Fn = Fn-1 + Fn-2 [Expanding both terms]
   = Fn-2 + Fn-3 + Fn-3 + Fn-4
   = Fn-2 + 2Fn-3 + Fn-4 [Expanding first term]
   = Fn-3 + Fn-4 + 2Fn-3 + Fn-4
   = 3Fn-3 + 2Fn-4  [Expanding one Fn-4]
   = 3Fn-3 + Fn-4 + Fn-5 + Fn-6 [Combing Fn-4 and Fn-5]
   = 4Fn-3 + Fn-6
Because every third Fibonacci number is an even number, if Fn is an even number, then Fn-3 and Fn-6 are also even numbers. If Fn is the xth even element, then designate it as EFx. If Fn is EFx, then EFx-1 is the previous even number, and EFx-2 is the previous to EFx-1. So  Fn = 4Fn-3 + Fn-6 which means,  EFx = 4EFx-1 + EFx-2

Below is the implementation of the above idea:

1. Java*/
import java.util.*;

public class NthEvenFibonacciNumber {
	static long NthEvenFibonacci(long n) {
        if (n < 1)
            return n;
        if (n == 1)
            return 2;
        return ((4 * NthEvenFibonacci(n-1))%1000000007 + NthEvenFibonacci(n-2)%1000000007)%1000000007;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(NthEvenFibonacci(n));
    }
}