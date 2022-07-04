package leetcode;
/*Given an array of integers nums which is sorted in ascending order, 
and an integer target, write a function to search target in nums.
If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.*/

public class DacBinarySearch{
	public static int search(int[] arr, int low, int high,int key){
		if(high==low)
			if(arr[low]==key)
				return low;
			
		if(high>low){
			int mid= (low+high)/2;
			if(arr[mid]==key)
				return mid;
			else if(key<arr[mid])
				return search(arr,low,mid,key);
			return search(arr,mid+1,high,key);
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr= {-1,0,3,5,9,12};
		int key = -10;
		int result =search(arr,0,arr.length-1,key);
		if(result>=0)
			System.out.println(key+" found! at index "+result);
		else
			System.out.println("Key Not found!");
	}
}


