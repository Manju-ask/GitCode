package recursion;

import java.util.ArrayList;
import java.util.List;

//Print one Array subsequences with sum = K. 
//Pattern: Technique to print only 1 answer.
//Avoiding future recursions when we find find answer.
// i.e need to stop recursion when we get 1st answer.
public class SubsequenceOfArrWIthSumKonlyOne {
	boolean allSubsequences(int index, List<Integer> list, int targetK, int[] arr) {
		if(index == arr.length) {
			if(targetK == 0) return true;
			return false;
		}
		
		list.add(arr[index]); //take element at index
		targetK -= arr[index];
		if( allSubsequences(index+1, list, targetK, arr) == true)
			return true;

		list.remove(list.size()-1);   //not take element at index
		targetK += arr[index];
		if( allSubsequences(index+1, list,targetK, arr) == true)
			return true;
		return false;
	}
	
	public List<Integer> subsets(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		allSubsequences(0, list, 2, nums);
		return list;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,1};
		SubsequenceOfArrWIthSumKonlyOne s = new SubsequenceOfArrWIthSumKonlyOne();
		System.out.println(s.subsets(nums));
		
	}

}
