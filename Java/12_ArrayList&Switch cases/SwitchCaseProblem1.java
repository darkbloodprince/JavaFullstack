/*Switch Case Problem 1
You are given a positive integer N. Write a program using switch case to print the following output such that :

If the case is 55 , print "Study is important" ,

Otherwise , print "No value" .

Input Format
First line contains an integer N.

Output Format
Print the sentence related to the integer as per description.

Example 1
Input

55
Output

Study is important
Example 2
Input

24
Output

No value
Constraints
1 <= N <= 10^6
Approach:
We need to first take the input as integer N. Then using switch case and its syntax we need to make case for N=55 and then finally output the sentence mentioned for case 55.

Time Complexity

O(n) for n cases

Space Complexity

O(1) as No extra space.

Below is the implementation of the above idea:

1. Java:*/
import java.io.*; // Imports all classes from the java.io package (not used here but commonly included).
import java.util.*; // Imports all classes from the java.util package, used here for Scanner.

public class SwitchCaseProblem1 { // Declares the main class named 'Main'
    
    public static void main(String[] args) throws java.lang.Exception {
        // Main method: entry point of the Java program
        // 'throws Exception' is used to handle any unexpected exceptions that might occur

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take input from the user

        int N = sc.nextInt(); // Reads an integer input from the user and stores it in variable N

        // Using switch-case to check the value of N
        switch(N)
        {
            case 55:
                // If the input value is exactly 55, this block gets executed
                System.out.println("Study is important");
                break; // Exits the switch after executing the case

            default:
                // If the input doesn't match any defined case (in this case, only 55), this block runs
                System.out.println("No value");
        }
    }
}
