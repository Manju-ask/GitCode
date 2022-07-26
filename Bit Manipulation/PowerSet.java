package bit_manipulation;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
	static List<List<Integer>> allSubsequences(int[] arr, int n) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		for(int nums=0; nums <= (1<<n)-1 ;nums++) {
			List<Integer> list = new ArrayList<Integer>();
			
			for(int i=0; i<=n-1; i++) {
				if((nums&(1<<i)) != 0) 
					list.add(arr[i]);
			}
			lists.add(list);
		}
		return lists;
	}
	public static void main(String[] args) {
		int[] arr = {3,1,2};
		int n = arr.length;
		System.out.println(allSubsequences(arr, n));
	}

}
