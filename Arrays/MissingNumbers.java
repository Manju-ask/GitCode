package leetcode;

/*Given an array nums containing n distinct numbers in the range [0, n], 
return the only number in the range that is missing from the array.
		
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9] 
8 is the missing number in the range since it does not appear in nums.*/

public class MissingNumbers {
    public int missingNumber(int[] nums) {
    	int max=0;
    	int sumOfArr=0;
    	for(int i=0; i<nums.length; i++) {
    		sumOfArr = sumOfArr+nums[i];
    		if(nums[i]>max) 
    			max=nums[i];
    	}
    	int sum = max*(max+1)/2;
    	return sum-sumOfArr;
    }
	
	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		MissingNumbers numbers = new MissingNumbers();
		int res= numbers.missingNumber(nums);
		System.out.println(res);
	}
}
