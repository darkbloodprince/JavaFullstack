/*Verify Cube
Take two positive integers from the user. Verify if (a+b)^3 = a^3 + b^3 + 3a^2b + 3ab^2.

Calculate the Left hand side (LHS) and the right hand side (RHS) of the equation. Print the (LHS) and the (RHS).

Print VERIFIED in uppercase if they are equal, otherwise print NOT VERIFIED.

Input Format
The first line contains two integers A and B.

Output Format
Print two integers, the LHS and RHS in separate lines.

Then print "VERIFIED" (without quotes and in uppercase) if they are equal, else print "NOT VERIFIED".

Example 1
Input:

4 5
Output:

729
729
VERIFIED
Explanation:

We have A = 4 and B = 5.

Since, LHS = 729 and RHS = 729, our equation is Verified.

Example 2
Input:

1 2
Output:

27
27
VERIFIED
Explanation:

We have A = 1 and B = 2.

Since, LHS = 27 and RHS = 27, our equation is Verified.

Constraints
1 <= A <= 100000

1 <= B <= 100000*/
import java.util.*;

public class VerifyCube {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();

        // Compute LHS = (a + b)^3
        long sum = a + b;
        long lhs = sum * sum * sum;

        // Compute RHS = a^3 + b^3 + 3a^2b + 3ab^2
        long a3 = a * a * a;
        long b3 = b * b * b;
        long term1 = 3 * a * a * b;  // 3a^2b
        long term2 = 3 * a * b * b;  // 3ab^2
        long rhs = a3 + b3 + term1 + term2;

        // Print results
        System.out.println(lhs);
        System.out.println(rhs);

        if (lhs == rhs) {
            System.out.println("VERIFIED");
        } else {
            System.out.println("NOT VERIFIED");
        }
    }
}
