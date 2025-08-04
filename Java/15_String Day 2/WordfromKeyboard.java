/*Word from Keyboard
You are given array of strings, you need to print words from that array which can be typed using only one row of Keyboard.

First row of keyboard = "qwertyuiop"

Second row of keyboard = "asdfghjkl"

Third row of keyboard = "zxcvbnm"

KeyBoard
Input Format
First line contains n number of strings in array

Next n lines contains strings denoting elements of array

Output Format
Print strings which can be formed using single row of keyboard in separate lines

Example 1
Input

2
glad
monkey
Output

glad
Explanation

glad can be formed only from the characters present in row 2

Example 2
Input

3
horse
peter
jass
Output

peter
jass
CONSTRAINTS
1 <= n <= 1000

1 <= |s| <= 100

Each string consist of lowercase english letter only.
Approach:

Check the row number for each letter and store in a set. Check the size of set to see if it is equal to 1 or not.

Algorithm:

Store row number of each alphabet.
Iterate over all the words in the array.
Check the row number of each of its alphabet and store in a set.
If the size of set =1, add the word in the result array. Repeat for all other strings.
Time Complexity : O(N*s) , as we are iterating over the strings and each of its alphabets .

Space Complexity : O(1) , as only storing the row number and it can be 26(constant) only .

Below is the implementation of the above idea:

1. Java*/
import java.io.*;
import java.util.*;

public class WordfromKeyboard {

    // Mapping each lowercase letter 'a' to 'z' to the keyboard row number:
    // 1 = first row ("qwertyuiop"), 2 = second row ("asdfghjkl"), 3 = third row ("zxcvbnm")
    // charRow[0] is for 'a', charRow[1] for 'b', ..., charRow[25] for 'z'
    static int[] charRow = new int[]{2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
    
    static ArrayList<String> getStrings(ArrayList<String> arr)
    {
        // Result list to collect words that can be typed using only one keyboard row
        ArrayList<String> result = new ArrayList<String>();

        // Iterate over each word in input array
        for (int i = 0; i < arr.size(); i++) {
            String cur = arr.get(i);
            // Use a set to track distinct rows used by characters in the current word
            Set<Integer> temp = new HashSet<Integer>();
            int len = cur.length();
            for (int j = 0; j < len; j++) {
                char c = cur.charAt(j);
                // Map character to its row number and add to the set
                // subtracting 'a' gives index 0..25 for lowercase letters
                temp.add(charRow[c - 'a']);
            }
            // If all characters belong to the same row, the set size will be 1
            if (temp.size() == 1) result.add(cur);
        }

        return result;
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt(); // number of words
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String s = sc.next(); // read each word (lowercase assumed)
            arr.add(s);
        }

        ArrayList<String> result = getStrings(arr);
        // Print each qualifying word on its own line
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
