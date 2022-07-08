package leetcode;

/*Maximum Subarray
Medium

Given an integer array nums, find the contiguous subarray (containing at least one number)
which has the largest sum and return its sum.
A subarray is a contiguous part of an array.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:
Input: nums = [1]
Output: 1
Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23*/

public class KadanesMaxSumSubArray {
	public static int maxSubArray(int[] nums) {
		int maxSum=nums[0];
		int sum=0;
		int si=0;
		int li=0;
		if(nums.length==1) {
			return maxSum;
		}	
		for(int i=0; i<nums.length; i++) {
			sum +=nums[i];
			if(sum>maxSum) {
				maxSum=sum;
				li=i;
			}
			if(sum<0) {
				sum=0;
				si=i+1;
			}
		}
//		Arrays.stream(nums, si, li+1).forEach(System.out::println);
		return maxSum;
	}
	public static void main(String[] args) {
		int[] nums = {-2,-1};
		System.out.println(maxSubArray(nums));
	}

}
