package leetcode_arrays;
import java.util.HashSet;
import java.util.Set;
/*
 *Problem statement:
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,1] Output: true
 */
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		//Set does not allow duplicates
		Set<Integer> set = new HashSet<Integer>();
		int i=0;
		if (nums.length == 0) {
			throw new IllegalArgumentException("Array is empty!");
		}
		if (nums.length <= 1) {
			return false;
		}
		while(i<nums.length) {
			//add() returns false for unsuccessful insertion i.e for duplicate values.
			if(!set.add(nums[i]))
				return true;
			i++;
		}
	return false;
		
	}
	public static void main(String[] args) {
		int[] nums = {1,2,2,4,5,6,7,4,10,11};
		ContainsDuplicate duplicate = new ContainsDuplicate();
		try {
			System.out.println(duplicate.containsDuplicate(nums));
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
	}
}

