package leetcode;

/*
Write a program to reverse an array or string

Difficulty Level : Basic
Last Updated : 08 Sep, 2020
 
Given an array (or string), the task is to reverse the array/string.
Examples : 
 

Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}
*/
public class ReverseArr {

	  static int[] rvereseArray(int arr[],int start, int end){
	    int temp;
	    while (start < end)
	    {
	      temp = arr[start];
	      arr[start] = arr[end];
	      arr[end] = temp;
	      start++;
	      end--;
	    }
	    return arr;
	  }  

	  public static void main(String args[]) {
	    int arr[] = {1, 2, 3, 4, 5, 6};
	    rvereseArray(arr, 0, 5);
	    for(int i:arr)
	    	System.out.println(i);
	  }
	}


