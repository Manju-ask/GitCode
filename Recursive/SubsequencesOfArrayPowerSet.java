package recursion;

import java.util.ArrayList;					
import java.util.List;
//All the Array subsequences or subsets.
public class SubsequencesOfArrayPowerSet {

	void allSubsequences(int index, List<Integer> list, int[] arr, List<List<Integer>> listofLists) {
		if(index == arr.length) {
			listofLists.add(new ArrayList<Integer>(list));
			return;
		}

		list.add(arr[index]); //take element at index
		allSubsequences(index+1, list, arr, listofLists);

		list.remove(list.size()-1);   //not take element at index
		allSubsequences(index+1, list, arr, listofLists);
	}
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> listofLists = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		allSubsequences(0, list, nums, listofLists);
		return listofLists;
	}
	public static void main(String[] args) {
		int[] nums = {3,1,2};	
		SubsequencesOfArrayPowerSet p= new SubsequencesOfArrayPowerSet();
		System.out.println(p.subsets(nums));
	}
}
