/*Ptice
Adrian, Bruno and Goran wanted to join the bird lovers’ club. However, they did not know that all applicants must pass an entrance exam. The exam consists of n questions, each with three possible answers: A, B and C.

Unfortunately, they couldn’t tell a bird from a whale so they are trying to guess the correct answers. Each of the three boys has a theory of what set of answers will work best:

Adrian claims that the best sequence is: A, B, C, A, B, C, A, B, C, A, B, C ...

Bruno is convinced that this is better: B, A, B, C, B, A, B, C, B, A, B, C ...

Goran laughs at them and will use this sequence: C, C, A, A, B, B, C, C, A, A, B, B ...

Write a program that, given the correct answers to the exam, determines who of the three was right – whose sequence contains the most correct answers.

Input Format
First line contains an integer n denoting number of questions.

Second line contains a string of n letters ‘A’, ‘B’ and ‘C’. These are, in order, the correct answers to the questions in the exam.

Last line contains the indices separated by space.

Output Format
On the first line, output m, the largest number of correct answers one of the three boys gets.

After that, output the names of the boys (in alphabetical order) whose sequences result in m correct answers.

Example 1
Input

5
BAACC
Output

3
Bruno
Explanation

Here only Bruno has most correct answers i.e. 3.

Example 2
Input

9
AAAABBBBB
Output

4
Adrian
Bruno
Goran
Explanation

Here all 3 have 4 correct answers.

Constraints
1 <= n <= 100
Approach 1:
Store the recurring patterns for all the three boys(Adrian: "ABC", Bruno: "BABC", Goran: "CCAABB"). Now match it with the entire key but take modulo with the length of the pattern to keep index of each pattern in bound.

Find the maximum of the three and print the maximum value and print Adrian,Bruno and Goran in this order if their correct answers matches the maximum.

Algorithm:

Store the patterns of all three boys in separate strings.
Iterate over the entire key and compare chunks of the pattern for each boy.
Circle back to the 0th index of each pattern when it is matched entirely by appling MOD length(pattern).
Find the maximum of the three and print it.
Print the names in alphabetical order if their count matches the maximum.

Time Complexity

O(n) as we traverse the indices array.

Space Complexity

O(1) since no extra space used.

1. Java*/
import java.util.*; // Import utility classes like Scanner
public class Ptice {
    
    // Method to evaluate how many correct answers each participant has
    static void ptice(int n, String key) {
        int countA = 0, countB = 0, countG = 0;

        // Repeating patterns for each participant
        String patternA = "ABC";      // Adrian's pattern (3-length cycle)
        String patternB = "BABC";     // Bruno's pattern (4-length cycle)
        String patternG = "CCAABB";   // Goran's pattern (6-length cycle)
        for (int i = 0; i < n; i++) {
            // If Adrian's pattern matches the key at this position
            if (key.charAt(i) == patternA.charAt(i % 3))
                countA++;

            // If Bruno's pattern matches
            if (key.charAt(i) == patternB.charAt(i % 4))
                countB++;

            // If Goran's pattern matches
            if (key.charAt(i) == patternG.charAt(i % 6))
                countG++;
        }
        int maxMatch = Math.max(countA, Math.max(countB, countG));
        System.out.println(maxMatch); // Print the highest score
        if (maxMatch == countA) {
            System.out.println("Adrian");
        }
        if (maxMatch == countB) {
            System.out.println("Bruno");
        }
        if (maxMatch == countG) {
            System.out.println("Goran");
        }
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();        // Number of questions
        String str = sc.next();  // The correct answers (key string)
        ptice(n, str);           // Call the function
        sc.close();
    }
}
