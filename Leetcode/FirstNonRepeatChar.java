package leetcode;

/*
First Unique Character in a String

Given a string s, find the first non-repeating character in it and return its index.
If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0
Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1
*/
import java.util.HashMap;
import java.util.Map;

class IndexCount{
	int index;
	int count;
	public IndexCount(int index) {
		this.index = index;
		this.count = 1;
	}
	public void countInc() {
		this.count++;
	}
	@Override
	public String toString() {
		return "IndexCount [index=" + index + ", count=" + count + "]";
	}
	
}
public class FirstNonRepeatChar {
	public static void firstNonRepeatChar(String str) {
		Map<Character, IndexCount> map = new HashMap<Character, IndexCount>();
		for(int i=0; i<str.length(); i++) {
			if(!map.containsKey(str.charAt(i))) 
				map.put(str.charAt(i), new IndexCount(i));
			else
				map.get(str.charAt(i)).countInc();
		}
		System.out.println(map);
		int maxIndex = str.length();
		for(Map.Entry<Character, IndexCount> entry: map.entrySet() ) {
			int count = entry.getValue().count;
			int index = entry.getValue().index;
			if(count==1 && index<maxIndex)
				maxIndex=index;
		}
		if(maxIndex<str.length())
			System.out.println(str.charAt(maxIndex));
		else
			System.out.println("No repeating char");
	}
	
	public static void main(String[] args) {
        String str = "geeksforgeeks";
        firstNonRepeatChar(str);
	}
}
