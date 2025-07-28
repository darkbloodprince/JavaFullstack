/*Compressed Strings
You are given a string 'S'. You need to compress it using the following algorithms:

Take an empty string res. For every block of consecutive repeating character, do the following:

If the size of block is 1, concatenate it to the end of `S`.
Else, concatenate the character followed by the size of the block.

Return res after completing the above operations on the whole string

Note

StringBuilder in Java represents a mutable sequence of characters.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains the string 'S'

Output Format
For each test case return the string res. Input and output is inbuilt.

Example 1
Input:

1
abbbccd
Output:

ab3c2d
Explanation:

a occurs once, so, we add a to res.

Then, b is repeated 3 times so, b3 is added.

Then, c is repeated 2 times so, c2 is added.

d occurs once, so, we add d to res.

Example 2
Input:

1
aabccc
Output:

a2bc3
Explanation:

a is repeated 2 times so, a2 is added.

b occurs once, so, we add b to res.

Then, c is repeated 3 times so, c3 is added.

Constraints
1 <= T <= 10
1 <= |S| <= 100000
Approach:
we maintain a counter to count consecutive occurrences of elements and update the letter as 'letter count' if the count is greater than 1. Else we just update the letter to our final answer string

Time Complexity

O(n)

Space Complexity

O(n)

1. Java*/
import java.util.*;
import java.io.*;

public class CompressedStrings {
	static String compressedString(String s) {
        StringBuilder ans = new StringBuilder();
		for (int i = 0 ; i < s.length(); i++) {
    		int count = 1;
    		while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
    			count++;
    			i++;
    		}
    		ans.append(s.charAt(i));
    		if (count > 1) {
    			ans.append(count);
    		}
		}
		return ans.toString();

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
            System.out.println(compressedString(s));
        }
    }
}