package leetcode;

/*Set Matrix Zeroes
Medium

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.

Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

A straightforward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
*/

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
    	for(int i=0; i<matrix.length; i++) {
    		for(int j=0; j<matrix[i].length; j++) {
    			if(matrix[i][j]==0) {
    				System.out.println(matrix[i][j]+" at "+i+""+j);
    				matrix[i][0]=0;
    				matrix[0][j]=0;
    			}
    		}
    	}
    	for(int i=1; i<matrix.length; i++) {
    		for(int j=1; j<matrix[i].length; j++) {
    			if(matrix[i][0]==0||matrix[0][j]==0) {
    				matrix[i][j]=0;
    			}
    		}
    	}
    	if(matrix[0][0]==0) {
    		for(int i=0;i<matrix.length;i++) {
    			matrix[i][0]=0;
    			matrix[0][i]=0;
    		}
    	}
    	for(int i=0; i<matrix.length; i++) {
    		for(int j=0; j<matrix[i].length; j++) {
    				System.out.print(matrix[i][j]);
    		}
    		System.out.println();
    	}
    	
    }
	public static void main(String[] args) {
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(matrix);
	}

}
