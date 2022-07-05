package leetcode;

import java.util.*;

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
