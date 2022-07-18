package leetcode_arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Given an array nums of n integers where nums[i] is in the range [1, n], 
return an array of all the integers in the range [1, n] that do not appear in nums.*/
/*Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]*/

public class DisappearedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> res= new ArrayList<Integer>();
		for(Integer i:nums)
			list.add(i);
		list = list.stream().distinct().sorted().collect(Collectors.toList());
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)!=i+1)
				res.add(list.get(i));
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr= {4,3,2,7,8,2,3,1};
		DisappearedNumbers num= new DisappearedNumbers();
		List<Integer> list = num.findDisappearedNumbers(arr);
		System.out.println(list);
	}
}
