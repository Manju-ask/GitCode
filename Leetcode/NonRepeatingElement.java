package leetcode_arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonRepeatingElement {
	public static List<Integer> nonRepeating(int[] nums) {
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		for(int i:nums) {
			if(map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1);
		}
		List<Integer> list = new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1)
				list.add(entry.getKey());
		}
			
		return list;
	}
	public static void main(String[] args) {
		int nums[] = {-11,2,3,4,5,6,2,4,-11};
		System.out.println(nonRepeating(nums));
	}

}
