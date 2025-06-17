/*Array Subtracting
You have given a number n1, representing the size of array arr1. You have given n1 numbers, representing elements of array arr1. You have given a number n2, representing the size of array arr2.You have given n2 numbers, representing elements of array arr2. The two arrays represent digits of two numbers.

You are required to subtract the numbers represented by two arrays and print the arrays. n1 and n2 can be of different sizes

Input Format
First line consists of an integer n1

Second line consists of n1 spaced integers, representing elements of arr1

Third line consists of an integer n2

Fourth line consists of n2 spaced integers, representing elements of arr2

Output Format
Subtract the two numbers and print the array

Example 1
Input

3
3 2 1
3
1 2 3
Output

1
9
8
Explanation

321 - 123 = 198

Example 2
Input

4
1 2 3 4
2
2 1
Output

1
2
1
3
Explanation

1234 - 21 = 1213

Constraints
1 <= n1, n2 <= 10

0 <= a1[i], a2[i] < 10
Approach:

The idea is to start traversing both the array simultaneously from the end until we reach the 0th index of either of the array.
While traversing each elements of array, subtract element of both the array and carry from the previous sum.
Now store the unit digit of the sum and forward carry for the next index sum.
While subtracting 0th index element if the carry left, then append it to beginning of the number.
Time Complexity : O(n1 + n2)

Space Complexity: O(max(n, m))

Below is the implementation of the above approach:*/
import java.util.*;

public class ArraySubtracting {

  // Function to subtract n2 from n1 (n1 - n2)
  static int[] subtract(int[] n1, int[] n2) {
    List<Integer> sub = new ArrayList<>();  // List to store result digits

    int i = n1.length - 1, j = n2.length - 1;  // Indices starting from end
    int c = 0; // 'c' is borrow (or carry, in subtraction)

    // Process from right to left (least significant digit to most)
    while (i >= 0 || j >= 0) {
      int a = i < 0 ? 0 : n1[i--];  // Take digit from n1 or 0 if index out of bounds
      int b = j < 0 ? 0 : n2[j--];  // Take digit from n2 or 0 if index out of bounds

      int sum = a - b + c; // subtract with borrow (c)

      if (sum < 0) {
        c = -1;         // need to borrow from next digit
        sum += 10;      // adjust result (e.g. 2 - 5 → 2 + 10 - 5 = 7)
      } else {
        c = 0;          // no borrow needed
      }

      sub.add(sum);     // store result digit in list
    }

    // If borrow still remains, it means n2 > n1, so swap them and subtract again
    if (c < 0) {
      int[] tmp = subtract(n2, n1);  // subtract n1 from n2
      tmp[0] *= -1;  // Mark result as negative (negate the first digit)
      return tmp;
    }

    Collections.reverse(sub);  // reverse to make the most significant digit first

    // Remove leading zeros from the result
    int start = 0;
    while (sub.get(start) == 0 && start < sub.size() - 1) start++;

    int[] ans = new int[sub.size() - start];  // final result array without leading zeros
    for (int k = 0; k + start < sub.size(); k++) {
      ans[k] = sub.get(start + k);
    }

    return ans;  // return result array
  }

  // Main method: read input, call subtract(), print result
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Read size and digits of first number
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    // Read size and digits of second number
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

    sc.close();

    // Subtract arrays
    int[] res = subtract(arr1, arr2);

    // Print result
    for (int i : res) System.out.println(i);
  }
}