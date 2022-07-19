package recursion;


import java.util.Stack;

public class PowerSet {
	static void allSubsequences(int index, Stack<Integer> stack, int[] arr, int n) {
		if(index == n) {
			System.out.println(stack);
			return;
		}
		
		stack.push(arr[index]);
		allSubsequences(index+1, stack, arr, n);
		
		stack.pop();
		allSubsequences(index+1, stack, arr, n);

	}
	public static void main(String[] args) {
		int[] arr = {3,1,2};
		int n = arr.length;
		Stack<Integer> stack = new Stack<Integer>();
		
		allSubsequences(0, stack, arr, n);
	}

}
