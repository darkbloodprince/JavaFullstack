/*AJ Number
Deepak and Gautam are having a discussion on a new type of number that they call AccioJob Number or AJ Number. They use following criteria to define a AJ Number.

0 and 1 are not a AJ number.

2,3,5,7,11,13,17,19,23,29 are AJ numbers.

Any number not divisible by the numbers in point 2( Given above) are also AJ numbers.

Deepak said he loved AJ numbers.Hearing it, Gautam throws a challenge to him.

Gautam will give Deepak a string of digits. Deepak's task is to find the number of AJ numbers in the string.

AJ number once detected should not be sub-string or super-string of any other AJ number.

Ex- In 4991, both 499 and 991 are AJ numbers but you can choose either 499 or 991, not both.

Further, the AJ number formed can only be a sub-string of the string.

Ex - In 481, you can not take 41 as AJ number because 41 is not a sub-string of 481.

As there can be multiple solutions, Gautam asks Deepak to find the maximum number of AJ numbers that can be formed from the given string.

Deepak has to take class of Launchpad students. Help him by solving Gautam's challenge.

Input Format
The first line of input contains n, the size of string.

The second line of input contains a string of digits str.

Output Format
Maximum number of AJ numbers that can be formed.

Example 1
Input

5
81615
Output

2
Explanation

61 and 5 are two AJ numbers.

Example 2
Input

2
10
Output

0
Explanation

There is 0 AJ number in this string of numbers.

Constraints
1 <= N <= 17
Hint 1
make use of all the substrings

Approach 1 : Brute Force
Here we just traverse through all the subsets in the string and check with the help of visited and check_aj, we have been visited before or not, or the number in the substring is a Accio number or not.

Time Complexity

O(N), where N is the length of the string.

Space Complexity

O(1) ,

Below is the implementation of the above idea:

1. Java*/
import java.util.*;
public class AJNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // Reading the length of the input string
        input.nextLine(); // Consumes newline character left after reading n

        StringBuilder str = new StringBuilder(input.nextLine()); // Reading the actual string of digits
        
        solve(str, n); // Calling the main logic function

        input.close(); // Closing the scanner to prevent resource leak
    }

    // Helper function to check if a number is an AJ number
    static boolean check_aj(long num) {
        if (num == 0 || num == 1)
            return false; // 0 and 1 are NOT AJ numbers

        int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}; // Prime AJ base numbers

        // If number is in the predefined list, it's AJ number
        for (int i = 0; i < 10; i++)
            if (arr[i] == num)
                return true;

        // If number is divisible by any base prime, it's NOT AJ number
        for (int i = 0; i < 10; i++)
            if (num % arr[i] == 0)
                return false;

        // Else it's an AJ number
        return true;
    }

    // Helper function to check if the characters in range [start, end) are not visited (i.e., free to use)
    static boolean isVisted(boolean visited[], int start, int end) {
        for (int i = start; i < end; i++)
            if (visited[i])
                return false; // If even one character is already used, return false

        return true; // All characters are unvisited
    }

    public static void solve(StringBuilder str, int n) {
        boolean visited[] = new boolean[100]; // Track used digits' positions (could be size n instead of 100)

        int count = 0; // To store number of AJ numbers found

        // Outer loop controls length of substrings (1 to n)
        for (int i = 1; i <= n; i++) {
            // Inner loop goes over all substrings of length i
            for (int j = 0; j <= n - i; j++) {
                String sub = str.substring(j, j + i);

                // Prevent leading zeros like "007"
                if (sub.length() > 1 && sub.charAt(0) == '0')
                    continue;

                long val = Long.parseLong(sub); // Convert substring to number

                // Check if it's AJ number and not overlapping with previously used indices
                if (check_aj(val) && isVisted(visited, j, j + i)) {
                    count++; // Valid AJ number found
                    for (int k = j; k < j + i; k++)
                        visited[k] = true; // Mark these positions as used
                }
            }
        }

        System.out.println(count); // Output the final result
    }
}
