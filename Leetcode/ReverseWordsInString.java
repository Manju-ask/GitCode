package leetcode;

/*Reverse words in a given string

Difficulty Level : Medium

Let the input string be “i like this program very much”.
The function should change the string to “much very program this like i”
*/
public class ReverseWordsInString {

	public static void revWordsInString(String str) {
		String[] s = str.split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--)
		{
			if(i==0)
				ans += s[i];
			else
			ans += s[i] + " ";
		}
		System.out.println("Reversed String:");
		System.out.println(ans);
	}
	public static void main(String[] args) {
		String str = "Can you revese me!";
		revWordsInString(str);
	}

}
