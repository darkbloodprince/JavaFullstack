/*Switch Case Problem 2
You are given a positive integer N. Write a program using switch case such that :

if user enters 12 , print "I am even",

if user enters 13 , print "I am prime",

if user enters 25 , print "I am odd",

Otherwise , print "I am just a number".

Input Format
First line contains an integer N.

Output Format
Print the sentence related to the integer as per description.

Example 1
Input

25
Output

I am odd
Example 2
Input

87
Output

I am just a number
Constraints
1 <= N <= 10^6
Approach 1: Brute Force
We need to first take the input as integer N. Then using switch case we need to make three different cases for N=12, 13, 25 and last condition in default then finally output the sentence mentioned for particular cases.

Time Complexity: O(n) for n cases.

Space Complexity: O(1) constant space used.

Below is the implementation of the above idea:

1. Java*/
import java.util.*; 
// Imports all utility classes, including Scanner for taking input

public class SwitchCaseProblem2 {
  // Defines the main class 'Main'

  public static void main(String[] args) throws Throwable {
    // Entry point of the program
    // 'throws Throwable' is used to indicate that any exception/error might be thrown

    Scanner sc = new Scanner(System.in); 
    // Creates a Scanner object 'sc' to read input from the user

    int N = sc.nextInt(); 
    // Reads an integer input from the user and stores it in variable 'N'

    switch (N) {
      // Switch-case statement checks the value of 'N' and executes the corresponding case

      case 12:
        // If the input is 12, this block is executed
        System.out.println("I am even");
        break; // Exit the switch-case after executing this block

      case 13:
        // If the input is 13, this block is executed
        System.out.println("I am prime");
        break;

      case 25:
        // If the input is 25, this block is executed
        System.out.println("I am odd");
        break;

      default:
        // If input does not match any of the above cases, this block is executed
        System.out.println("I am just a number");
    }
  }
}
