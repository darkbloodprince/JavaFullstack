/*Function Problem 1
Write a function such that a function fun will be called and "I am another function" will be printed.

Input Format
none

Output Format
"I am another function" is to be printed without quotations as below

Example 1
Input

Output

I am another function*/
import java.util.*;
import static java.lang.Math.ceil;

public class FunctionProblem1 {

    // Function that prints the required message
    public static void fun() {
        System.out.println("I am another function");
    }

    public static void main(String[] args) {
        fun(); // Call the function
    }
}
