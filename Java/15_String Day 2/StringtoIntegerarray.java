/*String to Integer array
You are given a string S, consisting of , separated positive integers. You need to form an array by extracting these integers from the given string.

It is guaranteed that the formed integers will fit in 32-bit signed integer.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains the string S

Output Format
For each test case print the final formed array.

Example 1
Input

1
1321,3213,424,124
Output

[1321 , 3213 ,  424 , 124]
Explanation

The first integer is 1321 which is separated from 3213 by ','. 3213 is separated from 424 which is further separated from 124.

Example 2
Input

1
89,82,21
Output

[89 , 82 , 21]

Explanation

The first integer is 89 which is separated from 82 by ','. 82 is separated from 21.

Constraints
1 <= T <= 10

1 <= |S| <= 100000
Approach 1:

Straightforward Approach
We process the string left to right.
Take an empty string, and keep adding characters to it until you encounter a ','.
Once you encounter a comma, convert the string to a number and add it to the array.
Repeat this for all numbers.
Time Complexity : O(n)

Space Complexity: O(n)

Below is the implementation of this approach:

1. Java*/
import java.io.*;
import java.util.*;

public class StringtoIntegerarray {

    static ArrayList<Integer> arrayGenerator(String s){
        String str = "";
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ','){
                list.add(Integer.parseInt(str));
                str = "";
            }
            else{
                str += s.charAt(i);
            }
        }
        list.add(Integer.parseInt(str));
        return list;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String s = input.nextLine();
            ArrayList<Integer> ans = arrayGenerator(s);
            System.out.print("[");
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i));
                if (i != ans.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        
    }
}