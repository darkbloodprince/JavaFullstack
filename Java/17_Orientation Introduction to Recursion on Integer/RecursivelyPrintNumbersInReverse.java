/*Recursively Print Numbers In Reverse
Write a recursive program to print all numbers starting from N till 1. Print numbers in descending order from N till you reach 1.

Input Format
Input consists of a single integer N

Output Format
Print the numbers between N and 1 in descending order, each separated by a single space.

Example 1
Input

5
Output

5 4 3 2 1
Example 2
Input

10
Output

10 9 8 7 6 5 4 3 2 1
Constraints
1 <= N <= 1000
Hint 1
Think about the base case.


Time Complexity : O(N)

Space Complexity : O(N) , due to recursion stack calls

Java*/
import java.util.*; // Importing utility classes like Scanner

public class RecursivelyPrintNumbersInReverse {

    // Recursive function to print numbers from N down to 1
	public static void printtillN(int N) {
        // Base case: when N becomes 0, stop recursion
	    if (N == 0)
			return;

        // Print the current number followed by a space
	    System.out.print(N + " ");

        // Recursive call with N-1 (reducing problem size each time)
	    printtillN(N - 1);
    }
	
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        int N; // Variable to store the number
        N = sc.nextInt(); // Read an integer from user

        // Call the recursive function to print numbers from N to 1
        printtillN(N);

        // Close the Scanner to free resources
        sc.close();
    }
}
