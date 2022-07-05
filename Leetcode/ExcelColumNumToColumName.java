package leetcode;

/*Find Excel column name from a given column number
Difficulty Level : Medium
MS Excel columns have a pattern like A, B, C, …, Z, AA, AB, AC, …., 
AZ, BA, BB, … ZZ, AAA, AAB ….. etc. In other words, column 1 is named “A”, 
column 2 as “B”, and column 27 as “AA”.
Given a column number, find its corresponding Excel column name.
 The following are more examples.
Input          Output
 26             Z
 51             AY
 52             AZ
 80             CB
 676            YZ
 702            ZZ
 705            AAC*/

public class ExcelColumNumToColumName {
	private static void columnName(int columnNumber)
	{
		StringBuilder columnName = new StringBuilder();

		while (columnNumber > 0) {
			int rem = columnNumber % 26;

			if (rem == 0) {
				columnName.append("Z");
				columnNumber = (columnNumber / 26) - 1;
			}
			else 
			{
				columnName.append((char)((rem - 1) + 'A'));
				columnNumber = columnNumber / 26;
			}
		}
		System.out.println(columnName.reverse());
	}

	public static void main(String[] args)
	{
		columnName(26);
		columnName(51);
		columnName(80);
		columnName(676);
		columnName(702);
	}
}

