/*Switch Case Problem 3
Write a program using switch cases in which two positive integers a and b will be taken as inputs.

If (a%b) is 0 then output will be "Remainder is too small",

If (a%b) is 1 then output will be "Remainder is small",

If (a%b) is 2 then output will be "Remainder is large",

In any other cases output will be "Remainder is too large".

The output should not contain quotation marks.

Input Format
First line contains two integers a and b

Output Format
Any one of the mentioned strings will be printed as per the value of (a%b)

Example 1
Input

19 6
Output

Remainder is small
Explanation

Modulus operator calculates the remainder of the given values.

19%6 will be 1 corresponding to the switch case 1 therefore printing Remainder is small

Example 2
Input

19 5
Output

Remainder is too large
Explanation

19%5 will be 4 as it does not match any of the switch cases it will go to the

Default switch case therefore printing Remainder is too large

Constraints
0 <= a, b <= 10^8
Approach:

The simplest approach to solve this question is my making different cases of switch as mentioned in statement i.e.

Algorithm:

The first step is to calculate the value of a%b and stored in a variable.
Use this variable to in the switch so that the cases are executed based on the value of this variable.
Define the cases as follows case [value to be matched]: 1. So therefore we have cases like case 1, case 2.
What happens is the value next to the case is matched to the value in the variable and the case is executed accordingly.
We use break statement after every conditioned statement because the switch will start comparing the following statements also if break is not there. In the end we have the case which denotes that if no conditions are matched. which is implemented through default.

Time Complexity: O(n) for n cases.

Space Complexity: O(1) constant space used.

Java*/
import java.util.*;
// Imports all classes from the java.util package, used here for Scanner
public class SwitchCaseProblem3 {
  // Declares the main class named 'Main'
  public static void main(String[] args) throws Throwable {
    // Entry point of the program
    // 'throws Throwable' means this method can throw any type of exception or error
    Scanner sc = new Scanner(System.in);
    // Creates a Scanner object to take input from the user

    int a = sc.nextInt();
    int b = sc.nextInt();
    // Reads two integers from the user and stores them in variables 'a' and 'b'
    int c = a % b;
    // Calculates the remainder when 'a' is divided by 'b' and stores it in variable 'c'
    switch (c) {
      // Begins a switch-case statement based on the value of 'c' (remainder)
      case 0:
        // If remainder is 0
        System.out.println("Remainder is too small");
        break; // Exit the switch after this case
      case 1:
        // If remainder is 1
        System.out.println("Remainder is small");
        break;
      case 2:
        // If remainder is 2
        System.out.println("Remainder is large");
        break;
      default:
        // If remainder is not 0, 1, or 2 (i.e., 3 or more)
        System.out.println("Remainder is too large");
    }
  }
}
