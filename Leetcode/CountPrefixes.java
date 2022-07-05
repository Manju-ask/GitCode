package leetcode;

public class CountPrefixes {
    public static int countPrefixes(String[] words, String s) {
    	int count=0;
        for(String str:words) {
        	for(int i=0;i<s.length();i++) {
        		if(str.equals(s.substring(0, i+1)))
        			count++;
        	}
        }
    	return count;
    }
	public static void main(String[] args) {
		String[] words = {"a","b","c","ab","bc","abc"};
		String s = "abc";
		System.out.println(countPrefixes(words,s));
	}

}
