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
1 < s.length() < 100
Approach 1:
We are given a string s, and we have to return the character with the highest frequency. So if somehow we figure out the frequency of each character in s, we just have to compare those and return the character with the highest frequency.

For this we declare an array alphabets, of size 26, where alphabets[i] is the frequency of (i+1)th character in english alphabets.
We then loop in the string s and modify alphabets array accordingly.
Lastly we iterate in the alphabets array to see the maximum occurring character by comparing the frequencies.
Note: char ch = 'a', assigns 'a' to ch, but char ch = 'a' + 1, assigns 'b' to ch. This is due to the fact that addition between a char and int is done by adding the in to the ASCII value of the char, and then having a new ASCII value corresponding to a char, which is to be returned.

Below are the implementation of the approach,

1. Java*/
import java.util.*;

// Main class
public class MaximumFrequencyCharacter {
    
    // Function to find the character with the maximum frequency in a given string
    static char MaximumFrequencyChar(String s) {
        // Create an array to count frequencies of each lowercase alphabet (a-z)
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, 0); // Initialize all counts to 0 (optional here since default is 0)

        // Loop through each character in the string
        for(int i = 0; i < s.length(); ++i) {
            // Increment the count for the current character
            // 'a' corresponds to index 0, 'b' to 1, ..., 'z' to 25
            ++alphabets[s.charAt(i) - 'a'];
        }

        // Initialize variables to track max frequency and corresponding character
        char maxChar = 'a';
        int maxFreq = 0;

        // Traverse the frequency array to find the character with the highest frequency
        for(int i = 0; i < 26; ++i) {
            if(alphabets[i] > maxFreq) {
                maxFreq = alphabets[i]; // Update max frequency
                char a = 'a';
                maxChar = (char)(a + i); // Convert index back to character
            }
        }

        // Return the character with the maximum frequency
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for input
        String s = scanner.nextLine(); // Read input string
        System.out.println(MaximumFrequencyChar(s)); // Print the result
    }
}
