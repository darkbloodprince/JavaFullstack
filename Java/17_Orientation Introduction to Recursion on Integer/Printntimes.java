/*Print n times
Write a recursive program to print the word "AccioSchool" N times. Take an integer input, N, from the user and create a recursive function to print "AccioSchool" N times.

Input Format
A single line containing the integer N

Output Format
Print the word "AccioSchool" N number of times, each time in the next line.

Example 1
Input

5
Output

AccioSchool
AccioSchool
AccioSchool
AccioSchool
AccioSchool
Explanation

We print AccioSchool 5 times.

Example 2
Input

3
Output

AccioSchool
AccioSchool
AccioSchool
Explanation

We print AccioSchool 3 times.

Constraints
1 <= |N| <= 10^4
Hint 1
It is similar to printing number from 1 to N using recursion.
Approach:
It is similar to printing numbers from N to 1 using recursion, but instead of printing numbers, we print the required word in each recursive function.

In each recursive call, we print the word once, and call the same function again with N-1 as it's argument and trust that the function will print N-1 times, combined with our 1 print, it will be N.

Similarly for N-1, it would pass N-2 as argument and print it once. This will continue till N becomes 0. Then we can stop printing. In the meantime, we would have printed N-1 times.

Algorithm:

Declare a function that takes single argument N, => func(N).
If (N<=0) we can stop printing and simply return.
else, we print the word "AccioSchool", and call the function recusively with argument as N-1. => func(N-1).

Time Complexity

O(N).

Space Complexity

O(N) because of recursion stack.

Below is the implementation of the algorithm

1. Java*/
import java.util.*;  // Import the Java utility package, needed for Scanner

public class Printntimes {
    
    // Recursive method to print "AccioSchool" N times
    static void printword(int N) {
        // Base case: stop recursion when N is 0 or negative
        if (N <= 0) {
            return;  // Exit the function
        }
        
        // Print the word "AccioSchool" on a new line
        System.out.println("AccioSchool");
        
        // Recursive call: reduce N by 1 and call the function again
        printword(N - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to take input from user
        
        int n = sc.nextInt();  // Read an integer N from the user
        printword(n);          // Call recursive function to print "AccioSchool" N times
    }
}
