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

-10^6<=z<=10^6*/
import java.util.*;

public class ASBasicDataTypes1 {
    static void printOperations(int x, int y, int z){
        // Performing the operations
        int Op1 = x + y + z;
        int Op2 = x * y - z;

        // Printing results
        System.out.println(Op1);
        System.out.println(Op2);
    }
	
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        printOperations(x, y, z);
    }
}
