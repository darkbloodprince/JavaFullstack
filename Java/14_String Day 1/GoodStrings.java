/*Good Strings
You are given a set 'S' of distinct characters. You are also given an array 'A' of 'N' strings.

A String in array 'A' is called good if all the characters of the string is present in the set 'S'.

You have to find how many strings in the array 'A' are good.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains a string denoting the characters of the set 'S'.

The next line contains 'N', the number of strings in 'A'.

The next 'N' lines contains a string each, which are the elements of the array 'A'.

Output Format
For each test case print the count of good strings in a new line.

Example 1
Input:

1
abc
4
ab
abd
cacb
cabef
Output:

2
Explanation:

Only 'ab' and 'cacb' are good strings. Rest of the strings contain characters apart from 'abc'.

Example 2
Input:

1
pq
3
pqqqpp
abc
rst
Output:

1
Explanation:

Only 'pqqqpp' is a good string.

Constraints
1 <= T <= 10

1 <= |S| <= 26

1 <= N <= 1000

1 <= |A[i]| <= 1000
We run a loop for array of strings, for each string we make an array of size 26, to store the frequency of each character in the string s and also in that string present in the array, in the end we check if we have any value in our frequency array as -1 then we dont add that string to ans, else we increase the value of ans and return it.

Below is the implementation of the algorithm:

1. Java*/
import java.util.*;

public class GoodStrings {

  static int goodStrings(String s, String[] A, int n) {
        int ans=0;
      for(int i=0;i<n;i++)
      {
          boolean flag=true;
          int count[]=new int[26];
          for (int j = 0; j < s.length(); ++j){
            count[s.charAt(j) - 'a']--;
        }
            
        String w=A[i];
        for(int k=0;k<w.length();k++)
         count[w.charAt(k)-'a']++;

        for(char a=0;a< 26;a++) {
            if(s.contains(Character.toString((char)a+'a'))==false && count[a]>0)
            flag=false;
        }

          if(flag)
            ans++;
     
    }
    return ans;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      int n = sc.nextInt();
      String[] A = new String[n];
      for (int i = 0; i < n; i++) {
        A[i] = sc.next();
      }

      System.out.println(goodStrings(s, A, n));
    }
  }
}