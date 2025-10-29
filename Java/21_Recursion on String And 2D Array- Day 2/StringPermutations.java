/*String Permutations
You are given a string str.

Complete the body of permutationPrint function - without changing signature - to calculate and print all permutations of str. Print the unique permutations in lexicographic order.

Use sample input and output to take idea about permutations.

Note

The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Input Format
The first line of input contains a string str.

Output Format
Print all the permutations of the given string.

Example 1
Input

abc
Output

abc
acb
bac
bca
cab
cba
Explanation

The given string abc has 6 permutations, abc,acb,bac,bca,cab,cba.

Example 2
Input

ab
Output

ab
ba
Explanation

The given string ab has 2 permutations ab and ba.

Constraints
1 <= |str| <= 5
Hint 1
Think of a base case

Approach 1 : Brute Force
We are using 2 strings 1 the string given in the ques and the second one is an empty string which is used to print the permutations, so basically what we are doing is keeping a pointer at ith element and adding this into out second string and modifying our orginal string to be without that character.

Time Complexity

O(n!*n)

Space Complexity

O(n)

Below is the implementation of the above idea:

1. Java*/
import java.util.*;
class id
{
    static int i=0;
}
class Accio {
    private void printPermutationsHelper(String str, String ans,String[] arr) {
        if (str.length() == 0) {
            
            // System.out.println(ans);
            arr[id.i]=ans;
            id.i++;
            return;
        }

        for(int i = 0 ;i < str.length(); i++) {
            char ch = str.charAt(i);
            String left_substr = str.substring(0, i);
            String right_substr = str.substring(i + 1);
            String rest = left_substr + right_substr;
            printPermutationsHelper(rest, ans + ch,arr);
        }
    }
    public void printPermutations(String str) {
        int n=str.length();
        for (int i=n-1;i>0;i--)n*=i;
        String arr[]=new String[n];
        printPermutationsHelper(str, "",arr);
        Arrays.sort(arr);
        String s="aaaaaaaaaaa";
        for (int i=0;i<n;i++)
            {
                if (!(s.equals(arr[i])))System.out.println(arr[i]);
                s=arr[i];
            }
    }
}

public class StringPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Accio Obj = new Accio();
        Obj.printPermutations(str);
    }
} 