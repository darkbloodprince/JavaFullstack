/*Print between X & Y
Write a recursive program to print all the numbers between the range X to Y (X<=Y). Take input of X and Y from the user and print all the integers between the range X to Y using a recursive function.

Input Format
First line contains an integer X (X>0)

Second line contains an integer Y (Y>0)

Output Format
Print the numbers between X and Y, each separated by a single space.

Example 1
Input

5
8
Output

5 6 7 8
Explanation

The numbers between 5 to 8 included are 5,6,7 and 8.

Example 2
Input

15
15
Output

15
Explanation

The numbers between 15 to 15 included is 15.

Constraints
1 <= X <= Y <= 10^6
Hint 2
Think of a base condition

Approach:
Declare a recursive function printXY(X,Y) with two parameters.

The recurrence step is that we print the current X value and call printXY(X+1,Y).

We keep doing this until we hit the base case of X>Y. Once this is true we return.

Time Complexity

O(Y-X)

Space Complexity

O(Y-X) (call stack is used)

Below is the implementation of the algorithm

1. JAVA*/
import java.io.*;
import java.util.*;

class PrintbetweenXY
{
	public static void printXY(int x,int y){
        // Code here
        if(x>y)
                return;

            System.out.print(x+" ");
            printXY(x+1,y);
    }
    public static void main(String args[])throws IOException
    {
        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        printXY(x,y);     
    }
}