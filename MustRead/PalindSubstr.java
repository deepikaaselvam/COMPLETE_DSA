package MustRead;
//   1930. Unique Length-3 Palindromic Subsequences

import java.util.HashSet;

/*
 * Given a string s, return the number of unique palindromes of length three that are a subsequence of s.

Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.

A palindrome is a string that reads the same forwards and backwards.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
 

Example 1:

Input: s = "aabca"
Output: 3
Explanation: The 3 palindromic subsequences of length 3 are:
- "aba" (subsequence of "aabca")
- "aaa" (subsequence of "aabca")
- "aca" (subsequence of "aabca")
Example 2:

Input: s = "adc"
Output: 0
Explanation: There are no palindromic subsequences of length 3 in "adc".
Example 3:

Input: s = "bbcbaba"
Output: 4
Explanation: The 4 palindromic subsequences of length 3 are:
- "bbb" (subsequence of "bbcbaba")
- "bcb" (subsequence of "bbcbaba")
- "bab" (subsequence of "bbcbaba")
- "aba" (subsequence of "bbcbaba")
 

Constraints:

3 <= s.length <= 105
s consists of only lowercase English letters.
 */


 //TESTCASES
 /*
  * "bbaabb"
"aaaaaa"
"lhwtek"
"ckafnafqo"
"narisoerjteokvhfupilrnuytrhrqcygiudbzptlxosjkdrxwx"
"eensygaioqiwqueoxmnbcxmjgfvjshjhsjgshtnmnvsefghsgfjseegjywyrwourwppidmxdmxvxhdbzhjgfdjgeyssoefsjbfbbxnbdnfvdfvjhxdjfhgxdjfhxdjfxhbbxfvxdjfvjh"
"aaabbbcccdddeeefffggghhhiiijjjkkklllmmmnnnooopppqqqrrrssstttuuuvvvwwwxxxyyyzzzaaabbbcccdddeeefffggghhhiiijjjkkklllmmmnnnooopppqqqrrrssstttuuuvvvwwwxxxyyyzzz"
"cbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbccb"
  */

public class PalindSubstr {
    public static int countPalindromicSubsequence(String s) {
         HashSet<Character>letters = new HashSet<>();
        for(char c : s.toCharArray())
        {
            letters.add(c);
        }
        int cnt=0;
        for(Character letter : letters)
        {
            int i=-1;
            int j=0;
            for(int k = 0;k < s.length();k++)
            {
                if(s.charAt(k)==letter)
                {
                    if(i==-1)
                    {
                        i=k;
                    }
                    j=k;
                    
                }
            }
            HashSet<Character>betweenLetters = new HashSet<>();
            for(int k=i+1 ;k<j ;k++)
            {
                betweenLetters.add(s.charAt(k));
            }
            cnt+=betweenLetters.size();
        }
        return cnt;

    }
    public static void main(String[] args) {
        String s="bbcbaba";//"adc";//"aabca";
        System.out.println(countPalindromicSubsequence(s));
        
    }
    
}
