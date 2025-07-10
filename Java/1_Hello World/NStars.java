/*N Stars
In this task, you have to print n stars * vertically and n horizontally.

Input Format
The first line of input contains n.

Output Format
print the stars in horizontal and vertical direction.

Example 1
Input

3
Output

* * * 
*
*
*
Exaplantion

We print the 3 stars in horizontal and 3 stars vertical direction.

Example 2
Input

5
Output

* * * * * 
*
*
*
*
*
Exaplantion

We print the 5 stars in horizontal and 5 stars vertical direction.

Constraints
1<= n <= 100*/
import java.io.*;
import java.util.*;

class NStars
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        // Write your code here
        for(int i = 1; i<=n*2;i++){
            if(i<n){
                System.out.print("* ");
            }
            else{
                System.out.println("*");
            }
        }
       
    }
}
