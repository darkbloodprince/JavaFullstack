/*Maximum Frequency Character
Given a string s containing lowercase alphabets, return the character with the highest occurrence in s.

If there are multiple such characters, then return the lexicographically smallest one of them.

Input Format
The only line of the input contains the string s.

Output Format
Print the maximal occurring character in the string s. If there are multiple, print the lexicographically minimum one.

Example 1
Input

abbbc
Output

b
Explanation

Here, a occurs 1 time, c occurs 1 time, and b occurs 3 times. Hence our answer for this is b.

Example 2
Input

aabbbccc
Output

b
Constraints
1 < s.length() < 100*/
import java.util.*;

public class MaximumFrequencyCharacter {

    static char MaximumFrequencyChar(String s) {
        int[] freq = new int[26];  // frequency array for 'a' to 'z'
        
        // Count frequencies
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        int maxFreq = 0;
        char result = 'a';
        
        // Find max frequency and lex smallest char with that frequency
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = (char) (i + 'a');
            } else if (freq[i] == maxFreq && (char)(i + 'a') < result) {
                // same frequency but lex smaller char
                result = (char) (i + 'a');
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(MaximumFrequencyChar(s));
    }
}
