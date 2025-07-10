/*AS Basic DataTypes 1
Take user input of 3 integer numbers (x,y,z) to perform following operations using them.

Op1 = x+y+z

Op2 = x*y-z

Store the values of these operations in 2 different variables of integer type (Op1,Op2) and simply print them in the same order in separate lines.

Input Format
First line contains input of x, y, z separated by a space

Output Format
First line contains Op1

Second line contains Op2

Example 1
Input

2 3 4
Output

9
2
Explanation

Op1=2+3+4 = 9 & Op2= 2*3-4=2

Example 2
Input

5 8 9
Output

21
31
Explanation

Op1=5+8+9 = 21 & Op2= 5*8-9=31

Required Time Complexity: O(1)

Required Space Complexity: O(1)

Constraints
-10^6<=x<=10^6

-10^6<=y<=10^6

-10^6<=z<=10^6

Approach 1
Simple approach for this question is to initialize Op1 and Op2 and then write the given equation and print the output in each line

Algorithm:

Declare or Initialize Op1 and Op2.
Write the given relation for Op1 and Op2.
Print the result per line.
Time complexity

O(1) , since we only need to create 5 variables for this question- 3 variables to store values of x y z and 2 variables to store the operations Op1 and Op2. Hence every time a constant amount of time is required to execute code.

Space Complexity

O(1), since we take the same amount of input/space to implement without using any extra spaces.

Below is the implementation of the above idea:*/

import java.util.*;

public class Main {

    // Function to perform and print two arithmetic operations
    static void printOperations(int x, int y, int z) {
        int Op1 = 0, Op2 = 0;

        // Operation 1: Sum of all three numbers
        Op1 = x + y + z;

        // Operation 2: Product of first two, then subtract third
        Op2 = x * y - z;

        // Print the results
        System.out.println(Op1);
        System.out.println(Op2);
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);

        // Read 3 integers from the user
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        // Call the function to perform operations and print results
        printOperations(x, y, z);
    }
}

/*Time: O(1)
Space: O(1)*/