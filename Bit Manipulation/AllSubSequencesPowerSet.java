package bit_manipulation;

public class AllSubSequencesPowerSet {
	static void allSubsequences(String str, int n) {
		for(int nums=0; nums <= (1<<n)-1 ;nums++) {
			String subStr = "";
			for(int i=0; i<=n-1; i++) {
				if((nums&(1<<i)) != 0) 
					subStr += str.charAt(i);
			}
			System.out.println(subStr);
		}
	}
	public static void main(String[] args) {
		String str = "abc";
		int n = str.length();
		
		allSubsequences(str, n);
	}

}
