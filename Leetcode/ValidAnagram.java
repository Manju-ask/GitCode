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

        if(s.length() != t.length)
            return false;
        
        int ssum = s.charAt(0);
        int tsum = t.charAt(0);

        for(int i=1;i<s.length();i++) {
            ssum += s.charAt(i);
            tsum += t.charAt(i);
        }

       return ssum == tsum;
    }
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s,t));;
	}
}
