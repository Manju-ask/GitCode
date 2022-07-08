package leetcode;

/*Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or 
phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false*/

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int sxor = s.charAt(0);
        for(int i=1;i<s.length();i++) 
        	sxor ^= s.charAt(i);

        int txor = t.charAt(0);
        for(int i=1;i<t.length();i++) 
        	txor ^= t.charAt(i);

        return sxor == txor;
    }
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s,t));;
	}
}
