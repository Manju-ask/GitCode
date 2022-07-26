package recursion;

import java.util.ArrayList;
import java.util.List;

//All the Array subsequences with sum = K.
public class SubsequencesOfArrWIthSumK {
	void allSubsequences(int index, List<Integer> list, int targetK, int[] arr, List<List<Integer>> listofLists) {
		if(index == arr.length) {
			if(targetK == 0) listofLists.add(new ArrayList<Integer>(list));
			return;
		}
		
		list.add(arr[index]); //take element at index
		targetK -= arr[index];
		allSubsequences(index+1, list, targetK, arr, listofLists);

		list.remove(list.size()-1);   //not take element at index
		targetK += arr[index];
		allSubsequences(index+1, list,targetK, arr, listofLists);
	}
	
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> listofLists = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		allSubsequences(0, list, 2, nums, listofLists);
		return listofLists;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,1};
		SubsequencesOfArrWIthSumK s = new SubsequencesOfArrWIthSumK();
		System.out.println(s.subsets(nums));
		
	}

}
