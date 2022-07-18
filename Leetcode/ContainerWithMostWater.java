package leetcode_arrays;

import java.util.Arrays;

/*
Container With Most Water
Medium
You are given an integer array height of length n. 
There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

Example
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 In this case, the max area of water (blue section) the container can contain is 49.
 */
public class ContainerWithMostWater {
	public static int maxArea(int[] height) {
		int max=0;
		int[] temp = new int[height.length];
		for(int i=0;i<height.length;i++)
			temp[i]=height[i];
		Arrays.sort(temp);
		int k = temp.length-1;
		for(int i=0; i<height.length-1;i++) {
			if(height[i]==temp[k]) {
				k--;
				for(int j=i+1; j<height.length; j++) {
					if(height[j]==temp[k]) {
						k--;
						int tempMax = (height[i]<height[j]?height[i]:height[j])*(j-i);
						max = tempMax>max?tempMax:max;
					}
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}

}
