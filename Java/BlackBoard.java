/*Black Board

Alice gave Alex a challenge to identify the alphabets written on the black board, she gave him four classifications namely capital Consonant, Capital Vowel Lower Consonant of Lower Vowel of the given alphabets and asked Alex to identify in which of the 4 classifications will they fall. For this task Alex needs your help

Input Format

The first line of input contains a single character ch

Output Format

Help Alex find in which of the 4 classifications will the characters on the black board fall.

Example 1

Input

e Output

Lower Vowel.

Explanation

As le is part of vowel and it is in lower case so we get Lover Vowel as output

Example 2

Input

F

Output

Capital Consonant

Explanation

Since F is in capital letters and also a consonant, thus we get Capital Consonant as answer. Constraints

ch, can either be in lower case or upper case alphabets
Here's the complete Java program that reads a character and classifies it into one of the four categories:

Capital Vowel

Capital Consonant

Lower Vowel

Lower Consonant*/
import java.util.*;

public class BlackBoard {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();

        if (Character.isUpperCase(ch)) {
            if (isVowel(ch)) {
                System.out.println("Capital Vowel");
            } else {
                System.out.println("Capital Consonant");
            }
        } else if (Character.isLowerCase(ch)) {
            if (isVowel(ch)) {
                System.out.println("Lower Vowel");
            } else {
                System.out.println("Lower Consonant");
            }
        } else {
            System.out.println("Invalid input");
        }
    }

    // Helper function to check for vowels
    public static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}
