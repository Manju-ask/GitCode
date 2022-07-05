package leetcode;
import java.util.*;

/*
3. Longest Substring Without Repeating Characters
Medium

Given a string s, 
find the length of the longest substring without repeating characters.
 
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
public class LongestSubStrWithoutRepeatChar {
    public static int lengthOfLongestSubstring(String s) {
		int countFin=0;	
		int countTemp=0;
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			if(set.add(s.charAt(i))) {
				countTemp++;
			}
			else {
				countFin = countTemp>countFin ? countTemp:countFin;
				countTemp=0;
				set.clear();
				set.add(s.charAt(i));
				countTemp++;
			}
			
		}
		return countFin;
    }
	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}

}
