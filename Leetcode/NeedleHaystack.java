package leetcode;

/*Implement strStr()

Given two strings needle and haystack, return the index of the first occurrence of needle 
in haystack, or -1 if needle is not part of haystack.
Clarification:
What should we return when needle is an empty string? 
This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string.
This is consistent to C's strstr() and Java's indexOf().

Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1
*/
public class NeedleHaystack {
    public static int strStr(String haystack, String needle) {
        int n= needle.length();
        for(int i=0; i <= haystack.length()-n; i++) {
        	if(haystack.substring(i, i+n).equals(needle))
        		return i;
        }
    	
    	return -1;
    }
	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		System.out.println(strStr(haystack, needle));
	}

}
