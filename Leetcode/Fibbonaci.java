package numeric;
import java.util.Scanner;

public class Fibbonaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of fibonacci no.s required");
		int num= sc.nextInt();
		fib(num);
		
	}
	static boolean checkFib(int num) {
		int prev=0, pres=1, next=1;
		boolean flag=false;
		if(num==0||num==1)
			flag=true;
	
		while(next<=num) {
			next = prev + pres;
			prev=pres;
			pres=next;
			if(num==next)
				flag=true;
		}
		return flag;
	}
	
	static void fib(int n) {
		int prev=0, pres=1, next;
		if(n==1)
			System.out.println(prev);
		if(n>1) {
			System.out.println(prev);
			System.out.println(pres);
		}
		
		for(int i=3; i<=n; i++) {
			next = prev + pres;
			prev=pres;
			pres=next;
			System.out.println(next);
		}
	}
}
