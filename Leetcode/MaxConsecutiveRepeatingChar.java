package leetcode;

import java.util.Arrays;

/*Write a program to find the Longest Common Character subtring. 
The output will be an array containing only 2 elements, 
first one is the starting index of such substring followed by it's length.
Eg 1:
Input: aaabbbccccdddddeeeaaa
Output: [10, 5]

Eg 2:
Input: abcde
Output: [0, 1]

Eg 3:
Input: 
Output: [-1, -1]*/

public class MaxConsecutiveRepeatingChar {
	public static int[] maxRepeat(String s) {
		int startIndex=0;
		int startTemp=0;
		int endIndex=0;
		int countFin=0;	
		int countTemp=0;
		for(int i=0;i<s.length();i++) {
			if((i+1)!=s.length() && s.charAt(i) == s.charAt(i+1)) {
				countTemp++;
			}
			else {
				countTemp+=1;
				if(countTemp>countFin) {
					startIndex=startTemp;
					endIndex=i;
					countFin=countTemp;
				}
				startTemp=i+1;
				countTemp=0;
			}
		}
		System.out.println(countFin);
		System.out.println(startIndex+":"+endIndex);
		System.out.println(s.substring(startIndex, endIndex+1));
		int[] arr= {startIndex,countFin};
		return arr;
	}
	public static void main(String[] args) {
		String str = "aaaabbbccbbbbb";
		System.out.println(Arrays.toString(maxRepeat(str)));
	}

}
