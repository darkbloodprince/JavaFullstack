/*Count X in a string
Count recursively the total number of character x that appear in the given string.

Input Format
Only line contains the string in which we have to count character x.

Output Format
Print the number of x in string in a single line.

Example 1
Input

abcxxabc
Output

2 
Explanation

2 'x' are there in the given string.

Example 2
Input

addthe
Output

0
Explanation

No x is there in the given string.

Constraints
1 <= Len(str) <= 1000
string contains lowercase letter only.
Hint 1
check if the starting index is equal to X, then move the starting index

Approach: We can solve it by linearly traversing the array, but since we have to use recursion, we need to define a base case and find the recursion. If we find the first letter is X or not, and let the recursive function calculate the number of Xs in rest of the string, we can get total number of X by countX(rest of the string) + 1(if first letter is X) or countX(rest of the string) if first letter is not x.

Algorithm:

Check for base case, in this case, if the current index is more than last index then return 0.
else, check if the current index(start index for this function) is 'x', if it is increment count.
find the count of x of rest of the string, add it to count of this function.
return count.
Time Complexity: O(n) where n is the size of string.

Space Complexity: O(n) because of recursion stack space used.

Below is the code implementation of the above algorithm.

1. Java*/
import java.util.Scanner;

public class CountXinastring {

    // Recursive function to count how many times 'x' appears in the string
    static int countX(String str, int i, int n) {
        // Base case: when the index reaches the end of the string, stop recursion
        if (i == n)
            return 0;

        else {
            int count = 0;

            // If the current character is 'x', increment count
            if (str.charAt(i) == 'x')
                count++;

            // Recursive call to check the next character
            // Add the result from the recursive call to the current count
            count += countX(str, i + 1, n);

            // Return total count so far
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string from user
        String str = sc.nextLine();

        // Find the length of the string
        int n = str.length();

        // Call the recursive function starting from index 0
        // Print how many times 'x' appears in the string
        System.out.println(countX(str, 0, n));
    }
}
