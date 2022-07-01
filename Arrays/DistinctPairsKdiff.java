package leetcode;

import java.util.Arrays;

public class DistinctPairsKdiff {
	static int distinctPairs(int arr[], int k)
	{
		int count = 0;
		Arrays.sort(arr);   //1 2 3 4 5
		for(int i=0;i<arr.length; i++) {
			int j =Arrays.binarySearch(arr, i+1, arr.length-1, arr[i]+k);
			if(j>0)
				count++;
		}
		//		for (int i = 0; i < arr.length; i++)
		//		{
		//			for (int j = i + 1; j < arr.length; j++)
		//				if (arr[i] - arr[j] == k || arr[j] - arr[i] == k)
		//					count++;
		//		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 4, 2 };
		int k = 3;
		int res= distinctPairs(arr, k);
		System.out.println(res);
	}

}
