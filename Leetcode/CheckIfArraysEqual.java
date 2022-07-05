package leetcode;

/*
Check if two arrays are equal or not

Difficulty Level : Easy
Given two given arrays of equal length, the task is to find if given arrays are
equal or not. Two arrays are said to be equal if both of them contain the same 
set of elements, arrangements (or permutation) of elements may be different though.

Note: If there are repetitions, then counts of repeated elements must also be the 
same for two arrays to be equal. 

Examples : 
Input  : arr1[] = {1, 2, 5, 4, 0};
         arr2[] = {2, 4, 5, 0, 1}; 
Output : Yes

Input  : arr1[] = {1, 2, 5, 4, 0, 2, 1};
         arr2[] = {2, 4, 5, 0, 1, 1, 2}; 
Output : Yes
*/
public class CheckIfArraysEqual {
	public static boolean chechArrays(int arr1[], int arr2[]) {
		int a1=arr1[0];
		for(int i=1; i<arr1.length; i++)
			a1 ^= arr1[i];
		int a2=arr2[0];
		for(int i=1; i<arr2.length; i++)
			a2 ^= arr2[i];
		if((a1^a2) == 0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		int arr1[] = {1, 2, 5, 4, 0};
        int arr2[] = {2, 4, 5, 0, 1};
        System.out.println(chechArrays(arr1, arr2));
	}
}
