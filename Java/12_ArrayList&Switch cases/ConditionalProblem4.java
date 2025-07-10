/*Conditional Problem 4
You are given a letter of English alphabets. Write a program using switch case to print the following outputs for different inputs as :

If input is 'A' , print "I am the first letter", 
If input is 'B' , print "I am the second letter", 
If input is 'C' , print "I am the third letter",
If input is 'D' , print "I am the fourth letter", 
If input is 'E' , print "I am the fifth letter",
For any other input character, print "I don't belong here". 
Note that, Input characters will only be Capital Letters.

Input Format
First line contains a character

Output Format
Return the sentence related to the character as per description.

Example1
Input

A
Output

I am the first letter
Example 2
Input

G
Output

I don't belong here
Constraints
character c is always uppercase English letter.
Approach 1: Brute Force
We need to first take the input character. Then using switch case and its syntax we need to make 6 cases for the given conditions in the question.
Then finally print the sentence corresponding to particular english alphabet letter.

Time Complexity

O(n): for n cases.

Space Complexity

O(1): constant space used.

Below is the implementation of the above idea:

1. Java*/
import java.util.*; // Import utility package (for Scanner class)

public class ConditionalProblem4 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        // Read a single character from input
        // sc.next() returns a String; charAt(0) extracts the first character of that String
        char c = sc.next().charAt(0);

        // Use a switch statement to handle different cases based on character `c`
        switch (c) {
            case 'A': // If c is 'A'
                System.out.println("I am the first letter");
                break; // Exit the switch after matching case

            case 'B': // If c is 'B'
                System.out.println("I am the second letter");
                break;

            case 'C': // If c is 'C'
                System.out.println("I am the third letter");
                break;

            case 'D': // If c is 'D'
                System.out.println("I am the fourth letter");
                break;

            case 'E': // If c is 'E'
                System.out.println("I am the fifth letter");
                break;

            default: // If c is none of the above (A–E)
                System.out.println("I don't belong here");
        }
    }
}
