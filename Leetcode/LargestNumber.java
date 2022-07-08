package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		String order1 = a + b;
		String order2 = b + a;
		return order2.compareTo(order1);
	}
	public static String largestNumber(int[] nums) {
		String[] asStrs = new String[nums.length];
		for (int i = 0; i < nums.length; i++) 
			asStrs[i] = String.valueOf(nums[i]);
		Arrays.sort(asStrs, new LargestNumber());
		String str = "";
		for(int i=0;i<asStrs.length;i++)
			str=str+asStrs[i];

		return str;
	}
	public static void main(String[] args) {
		int[] nums = {3,30,34,5,9};
		System.out.println(largestNumber(nums));;
		//String str = ""+1+2;
		//System.out.println(str.compareTo("10"));
	}

}
