package leetcode_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNumber implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		String order1 = a + b;
		String order2 = b + a;
		return order2.compareTo(order1);
	}
	public static String largestNumber(int[] nums) {
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i:nums)
			list1.add(i);
		List<String> list =list1.stream().map(String::valueOf)
				.sorted(new LargestNumber())
				.collect(Collectors.toList());
		String str1 ="";
		for(String s: list)
			str1= str1+s;
		
		/*
		 * String[] asStrs = new String[nums.length]; for (int i = 0; i < nums.length;
		 * i++) asStrs[i] = String.valueOf(nums[i]); Arrays.sort(asStrs, new
		 * LargestNumber()); for(String s:asStrs) System.out.println(s); String str =
		 * ""; for(int i=0;i<asStrs.length;i++) str=str+asStrs[i];
		 */

		return str1;
	}
	public static void main(String[] args) {
		int[] nums = {3,30,34,5,9};
		System.out.println(largestNumber(nums));
	}

}
