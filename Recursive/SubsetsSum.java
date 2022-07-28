package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Print sums of all the subsets in increasing order
public class SubsetsSum {
	void allSubsequences(int index, List<Integer> list, int sum, int[] arr) {
		if(index == arr.length) {
			list.add(sum);
			return;
		}
		
		//take element at index
		allSubsequences(index+1, list, sum+arr[index], arr);

		//not take element at index
		allSubsequences(index+1, list, sum, arr);
	}
	
	public List<Integer> subsets(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		allSubsequences(0, list, 0, nums);
		Collections.sort(list);
		return list;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,3};
		SubsetsSum s = new SubsetsSum();
		System.out.println(s.subsets(nums));
		
	}

}
