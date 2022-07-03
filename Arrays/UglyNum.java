package leetcode;

/*Ugly Numbers
Difficulty Level : Medium
Ugly numbers are numbers whose only prime factors are 2, 3 or 5. 
The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers.
By convention, 1 is included. 

Given a number n, the task is to find n’th Ugly number.
Examples:  
Input  : n = 7
Output : 8

Input  : n = 15
Output : 24

Input  : n = 150
Output : 5832*/

public class UglyNum {
	public static int uglyNum(int n) {
		int count=2;
		int i=3;
		while(count<n) {
			int j=i;
			while(j%2==0||j%3==0||j%5==0) {
				if(j%2==0)
					j=j/2;
				if(j%3==0)
					j=j/3;
				if(j%5==0)
					j=j/5;
				if(j==1)
					break;
			}
			
			if(j==1) {
				count++;
				System.out.println(i+" "+count);
			}
			if(count<n)
				i++;
		}
		return i;
	}
	public static void main(String[] args) {
		int n = 7;
		System.out.println(uglyNum(n));
	}
}
