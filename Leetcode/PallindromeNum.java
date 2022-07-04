package numeric;
import java.util.Scanner;
public class PallindromeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num= sc.nextInt();
		System.out.println("given num is: "+num);
		int rev= reverse(num);
		System.out.println("reversed num is: "+rev);		
		if(num==rev) 
			System.out.println(num+" is a Pallindrome");
		else 
			System.out.println("Not a Pallindrome");
	}
	static int reverse(int num) {
		int rev=0,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
}
