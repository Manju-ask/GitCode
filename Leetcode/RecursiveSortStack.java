package leetcode_arrays;

import java.util.*;

public class RecursiveSortStack {
	
	static void sortStack(Stack<Integer> s)
	{
		if (!s.isEmpty())
		{
			int x = s.pop();

			sortStack(s);

			sortedInsert(s, x);
		}
	}
	
	static void sortedInsert(Stack<Integer> s, int x)
	{
		if (s.isEmpty() || x > s.peek())
		{
			s.push(x);
			return;
		}
		int temp = s.pop();
		sortedInsert(s, x);

		s.push(temp);
	}

	public static void main(String[] args) {

	}

}
