package leetcode;
import java.util.*;

/*Pascal's Triangle
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]*/
		
public class PascalsTriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> list1= new ArrayList<Integer>(Arrays.asList(1));
		List<Integer> list2= new ArrayList<Integer>(Arrays.asList(1,1));
		list.add(list1);
		list.add(list2);
		for(int i=2;i<numRows;i++) {
			list.add(new ArrayList<Integer>());
			for(int j=0;j<i;j++) {
				if(j==0)
					list.get(i).add(1);
				else {
					list.get(i).add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
				}
			}
			list.get(i).add(1);
		}
		return list;
	}
	public static void main(String[] args) {
		int numRows=5;
		System.out.println(generate(numRows));
	}

}
