package store_graph;

public class AdjMatrixRepr {

	public static void main(String[] args) {
		int n = 4;   //No. of vertices in graph
		int m = 4;   //No. of edges in graph
		
		//DS: 2D array to form a matrix to store edges
		int adj[][] = new int[n+1][n+1]; //(n+1)*(n+1):if vertices numbering starts from 1
										 //(n*n):if V numbering started from 0
		// 1-> edge present,   0-> edge absent.
//		Undirected graph:
//			(1)-----(2)
//			 |       |
//			 |	 	 |
//			(3)-----(4)
		
		//edge 1--2  (undirected)
		adj[1][2] = 1;  //1-->2
		adj[2][1] = 1;  //2-->1
		
		adj[1][3] = 1;  
		adj[3][1] = 1;
		
		adj[3][4] = 1;  
		adj[4][3] = 1;
		
		adj[2][4] = 1;  
		adj[4][2] = 1;
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				System.out.print(" "+adj[i][j]);
			}
			System.out.println();
		}
			
	}

}
