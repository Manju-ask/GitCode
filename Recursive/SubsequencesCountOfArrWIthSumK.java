package recursion;

import java.util.ArrayList;
import java.util.List;

//Count of all the Array subsequences with sum = K.
//Pattern: Technique to return count.
//int l = f(); int r= f(); return l+r;
public class SubsequencesCountOfArrWIthSumK {
	int allSubsequences(int index, List<Integer> list, int targetK, int[] arr) {
		if(index == arr.length) {
			if(targetK == 0) return 1;
			return 0;
		}
		
		targetK -= arr[index];
		int l = allSubsequences(index+1, list, targetK, arr);

		targetK += arr[index];
		int r = allSubsequences(index+1, list,targetK, arr);
		
		return l+r;
	}
	
	public int subsets(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		return allSubsequences(0, list, 2, nums);
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,1};
		SubsequencesCountOfArrWIthSumK s = new SubsequencesCountOfArrWIthSumK();
		System.out.println(s.subsets(nums));
		
	}

}
