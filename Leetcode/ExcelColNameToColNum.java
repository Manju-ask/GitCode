package leetcode;

/*Find Excel column number from column title
Difficulty Level : Medium
We have discussed Conversion from column number to Excel Column name. 
In this post, reverse is discussed.
Given a column title as appears in an Excel sheet, return its corresponding column number.
column  column number
  A  ->  1
  B  ->  2
  C  ->  3
  ...
  Z  ->  26
  AA ->  27
  AB ->  28 
Examples: 
Input: AA
Output: 27
The columns are in order A, B, ..., Y, Z, AA ..
So, there are 26 columns after which AA comes.*/

public class ExcelColNameToColNum {

	static int titleToNumber(String s)
	{

	  int result = 0;
	  for (int i = 0; i < s.length(); i++)
	  {
	    result *= 26;
	    result += s.charAt(i) - 'A' + 1;
	  }
	  return result;
	}
	  
	public static void main (String[] args)
	{
	  System.out.print(titleToNumber("CDA"));
	}
	}


