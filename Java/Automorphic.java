/*Automorphic Number or Not
Write a Java program check whether a number is an Automorphic number or not.

In mathematics, an automorphic number is a number whose square "ends" in the same digits as the number itself. For example, 5^2 = 25, 6^2 = 36, 76^2 = 5776, and 890625^2 = 793212890625, so 5, 6, 76 and 890625 are all automorphic numbers.

Input Format
Any integer value.

Output Format
Return whether number is an "Automorphic Number" or "Not an Automorphic Number".

Example 1
Input

10
Output

Not an Automorphic Number
Example 2
Input

76
Output

Automorphic Number
Explanation

65 * 80 = 5200

Constraints
1 < = N < = 10^9*/
import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        int num = sc.nextInt();
        long square = (long) num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        if (squareStr.endsWith(numStr)) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }
    }
}
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
