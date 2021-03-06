package leetcode_arrays;
import java.util.HashMap;
import java.util.*;

/*Given an array of integers nums and an integer target, 
return two numbers such that they add up to target.

You may assume that each input would have exactly one solution, 
and you may not use the same element twice.

You can return the answer in any order.*/
		
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
             if(map.containsKey(target-nums[i])){
                 res[0]=map.get(target-nums[i]);
                 res[1]=i;
                 return res;
             }
            else{
                map.put(nums[i],i);
            }       
        }
        return res; 
		
		/*
		 * int res; int[] result= {0,0}; Arrays.sort(nums); for(int
		 * i=0;i<nums.length;i++) { res = Arrays.binarySearch(nums, target-nums[i]);
		 * if(res>0) { result[0]=nums[i]; result[1]=nums[res]; return result; } } return
		 * result;
		 */
	}
	public static void main(String[] args) {
		int[] nums = {11,15,2,1,7};
		TwoSum sum = new TwoSum();
		int result[]= sum.twoSum(nums, 9);
		for(int i: result)
			System.out.println(i);
	}
}
