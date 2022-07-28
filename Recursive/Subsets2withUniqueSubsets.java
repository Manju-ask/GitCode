package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2withUniqueSubsets {

	private void subsets(int index, int[] arr, List<Integer> list, List<List<Integer>> lists) {
		//if(index == arr.length) return;
		lists.add(new ArrayList<Integer>(list));
		for(int i=index; i<arr.length; i++) {
			if(i!=index && arr[i] == arr[i-1]) continue;
			
			list.add(arr[i]);
			subsets(i+1, arr, list, lists);
			list.remove(list.size()-1);
		}
	}
	
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        subsets(0, nums, list, lists);
        return lists;
    }
    
	public static void main(String[] args) {
		int[] nums = {1,2,2};
		Subsets2withUniqueSubsets s = new Subsets2withUniqueSubsets();
		System.out.println(s.subsetsWithDup(nums));
	}

}
