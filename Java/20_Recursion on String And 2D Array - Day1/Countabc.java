/*Countabc
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

countAbc("abc") → 1

countAbc("abcxxabc") → 2

countAbc("abaxxaba") → 2

Input Format
Only line contains the string in which we have to count "abc" and "aba".

Output Format
Print the number of "abc" and "aba" in string.

Example 1
Input

abcxxabc
Output

2
Explanation

There are 2 abc from 0 -> 2 and from 5 -> 7

Example 2
Input

abaxxaba
Output

2
Explanation

There are 2 aba from 0 -> 2 and from 5 -> 7

Constraints
1 <= s.size() <= 1000
Hint 1
Consider the base condition as the size of string, if less than 3 return 0

Approach 1:

We are given a string s and we are expected to count the occurences of "abc" and "aba" in s. So while doing this recursively we need to identify the base case. As both "abc" and "aba" are of size 3, if s.size() is less than 3 we can return 0. This will be out base case. For all the other cases we compare the next three characters to "abc" and "aba" and if they match we increment our counter variable.

Below is the implementation of the above idea:

Java*/
import java.util.*;

public class Countabc {

    // Recursive function to count the number of occurrences of
    // substrings "abc" or "aba" in the given string.
    static int CountABC(String str, int i) {
        // Base case: if fewer than 3 characters remain, stop recursion
        if (i >= str.length() - 2)
            return 0;

        // Recursive call to process the next index
        int c = CountABC(str, i + 1);

        // Check if substring of length 3 starting from index i is "abc"
        if (str.substring(i, i + 3).compareTo("abc") == 0)
            c++;

        // Check if substring of length 3 starting from index i is "aba"
        if (str.substring(i, i + 3).compareTo("aba") == 0)
            c++;

        // Return total count so far
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string from the user
        String s = sc.nextLine();

        // Call recursive function starting from index 0
        System.out.println(CountABC(s, 0));
    }
}
