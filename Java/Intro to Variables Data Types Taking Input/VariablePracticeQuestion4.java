/*Variable Practice Question 4
Declare two variables as a and b. Initialize the values to those variables as 1042 and 7 respectively.

Declare another two variables quo and rem that will store the quotient and remainder of these numbers taking a as dividend and b as divisor.

Print quo and rem in a line separated by a space.

Input Format
No input. User has to declare the variables themselves.

Output Format
Print the quotient and remainder of these numbers by taking a as dividend and b as divisor.

Output:

148 6 */
import java.io.*;
import java.util.*;

public class VariablePracticeQuestion4 {
    public static void main(String[] args) {
        int a = 1042;
        int b = 7;
        
        int quo = a / b;
        int rem = a % b;
        
        System.out.println(quo + " " + rem);
    }
}
