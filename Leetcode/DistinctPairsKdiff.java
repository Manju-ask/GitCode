package leetcode_arrays;

import java.util.Arrays;
/*Count all distinct pairs with difference equal to k
Difficulty Level : Medium
Given an integer array and a positive integer k,
count all distinct pairs with differences equal to k. 

Examples: 

Input: arr[] = {1, 5, 3, 4, 2}, k = 3
Output: 2
There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2}*/

public class DistinctPairsKdiff {
	static int distinctPairs(int arr[], int k)
	{
		int count = 0;
		Arrays.sort(arr);   //1 2 3 4 5
		for(int i=0; i<arr.length-1; i++) {
			int j =Arrays.binarySearch(arr, i+1, arr.length, arr[i]+k);
			if(j>=0)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = { 8, 12, 16, 4, 0, 20 };   
		int k = 4;
		int res= distinctPairs(arr, k);
		System.out.println(res);
	}
}
