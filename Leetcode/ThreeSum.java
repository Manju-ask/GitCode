package leetcode_arrays;

import java.util.*;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);		
		for(int i=0; i<nums.length-2; i++){
			if(i==0 || (i>0 && nums[i]!=nums[i-1])) {

				int low=i+1, high=nums.length-1, sum= 0-nums[i];

				while(low<high ){
					if(nums[low]+nums[high] == sum) {
						list.add(Arrays.asList(nums[i],nums[low],nums[high]));

						while(low<high && nums[low]==nums[low+1]) low++;
						while(low<high && nums[high]==nums[high-1]) high--;
						
						low++;
						high--;
					}

					else if(nums[low]+nums[high] < sum)
						low++;
					else
						high--;  
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};  
		System.out.println(threeSum(nums));
	}

}
