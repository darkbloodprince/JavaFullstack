/*Number Rotation
Given two numbers n and k, you need to rotate n, k times to the right. If k is negative, rotate n, k times to the left.

Note:

Rotating right means removing rightmost digit from n and adding it to the start.

Rotating left means removing leftmost digit from n and adding it to the end.

Assume that the number of rotations will not result in leading 0's, i.e. n=1203, k =2 such that 0312 is the answer, such test cases will not be given.

k can be bigger than n.

Input Format
First line which has two integer n and k.

Output Format
Print the rotated number in a single line.

Example 1
Input

1256 1
Output

6125
Explanation

since k=1, right rotating the number one time leads to 6125.

Example 2
Input

1256 -1
Output

2561
Explanation

since k=1, left rotating the number one time leads to 2561.

Constraints
1 <= n,k <= 10^9*/

/*Approach 1:
Instead of rotating k times, we break the number in two parts. One that has last k elements and one that has rest of the elements. If k is bigger than number of digits or is negative, we use (k+n)%n to find the positive less than n equivalent k.

Now, we simply combine the two numbers such that last k elements come before the rest of the elements. This will be exactly the same result as rotating it k times to the right.

Algorithm:

Count total number of digits in the number.

Turn k into equivalent less than n positive value using k=(k+n)%n.

Find last k numbers using n % (10^k).

Find rest of the number using n/(10^k).

Since we need to add last k before rest of the number, we multiply last k digit with 10 ^(n-k) so that we have trailing 0s to add rest of the number.

Print answer.

Time Complexity: O(log(n)) as we are dividing the number by 10 each time while counting the digit.

Space Complexity: O(1).

Below is the implementation of the above idea:*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object for reading input
        Scanner sc = new Scanner(System.in);

        // Read two integers from input: n (the number) and k (rotation count)
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();

        int r = 0; // r will store the result after rotation

        int temp = n;
        int count = 0;

        // Step 1: Count the number of digits in n
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Step 2: Adjust k to be within bounds of digit length
        k = k % count; // to ensure k doesn't exceed digit length
        if (k < 0) {
            k = count + k; // convert negative rotation to equivalent right rotation
        }

        // Step 3: Perform the rotation
        // Get the last 'k' digits (rightmost part)
        // Multiply it by 10^(count-k) to move those digits to the front
        r += ((n % ((int) Math.pow(10, k))) * ((int) Math.pow(10, (count - k))));

        // Add the remaining digits (leftmost part) to the right of the rotated part
        r += ((n / ((int) Math.pow(10, k))));

        // Step 4: Output the rotated number
        System.out.println(r);

        sc.close(); // Close the scanner
    }
}