package leetcode;

public class MaxConsecutiveRepeatingChar {
	public static void maxRepeat(String s) {
		int startIndex=0;
		int endIndex=0;
		int countFin=0;	
		int countTemp=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				startIndex=i;
				countTemp++;
			}
			else {
				countTemp+=1;
				endIndex=i;
				countFin= countTemp>countFin?countTemp:countFin;
			}
		}
		System.out.println(startIndex+":"+endIndex);
		System.out.println(countFin);
	}
	public static void main(String[] args) {
		String str = "aaaabbcbbb";
		maxRepeat(str);
	}

}
