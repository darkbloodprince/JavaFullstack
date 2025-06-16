/*Array Adding
You have given a number n1, representing the size of array arr1. You have given n1 numbers, representing elements of array arr1. You have given a number n2, representing the size of array arr2.You have given n2 numbers, representing elements of array arr2. The two arrays represent the digits of two numbers.

You are required to add the numbers represented by two arrays and return the resultant arrays. n1 and n2 are of diferent size

Input Format
First line consists of an integer n1

Second line consists of n1 spaced integers, representing elements of arr1

Third line consists of an integer n2

Fourth line consists of n2 spaced integers, representing elements of arr2

Output Format
Add the two numbers and return the resultant array

Example 1
Input

3
1 2 3
3
3 2 1
Output

4
4
4
Explanation

Adding corresponding elements gives 4 at each index -> 1 + 3 = 2 + 2 = 3 + 1 = 4

Example 2
Input

2
2 1
4
1 2 3 4
Output

1
2
5
5
Explanation

1234 + 21 = 1255

Constraints
0 <= a1[i], a2[i] < 10*/
import java.util.*;

public class ArrayAdding {

    static int[] calSum(int a[], int b[], int n, int m) {
        int maxLen = Math.max(n, m);
        int[] result = new int[maxLen + 1]; // Extra space for carry
        int i = n - 1;
        int j = m - 1;
        int k = maxLen;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a[i] : 0;
            int digitB = (j >= 0) ? b[j] : 0;

            int sum = digitA + digitB + carry;
            result[k] = sum % 10;
            carry = sum / 10;

            i--;
            j--;
            k--;
        }

        // If leading digit is 0, skip it
        if (result[0] == 0) {
            return Arrays.copyOfRange(result, 1, result.length);
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        sc.close();

        int[] res = calSum(arr1, arr2, n1, n2);
        for (int i : res) System.out.println(i);
    }
}
