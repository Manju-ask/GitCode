package leetcode;

public class LongestConsecutiveNonRepeatingChar {
	public static String maxRepeat(String s) {
		int startIndex=0;
		int startTemp=0;
		int endIndex=0;
		int countFin=0;	
		int countTemp=0;
		for(int i=0;i<s.length();i++) {
			if((i+1)!=s.length() && s.charAt(i) != s.charAt(i+1)) {
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
		return s.substring(startIndex, endIndex+1);
	}
	public static void main(String[] args) {
		String str = "aaaabbbcbbbbb";
		System.out.println( maxRepeat(str) );
	}

}
