package store_graph;

import java.util.ArrayList;
import java.util.List;

public class AdjListRepr {

	public static void main(String[] args) {
		int n = 4;   //No. of vertices in graph
		int m = 4;   //No. of edges in graph
		
		//DS: List<of Lists> as adjacency list to store adjacent edges for every vertex(List index)
		List<List<Integer>> adj = new ArrayList<List<Integer>>();
		
//		Undirected graph:
//			(1)-----(2)
//			 |       |
//			 |  	 |
//			(3)-----(4)
		
		//creating deep copy of ArrayLists for all n vertices(i.e indices from 1 to n)
		//n+1 times (1-based numbering of graph, So 0th index makes n+1)
		for(int i=0; i<=n; i++) {
			adj.add(new ArrayList<Integer>());
		}
			
		//edge 1--2  (undirected)
		adj.get(1).add(2); //1->2  
		adj.get(2).add(1); //2->1
		
		adj.get(1).add(3);
		adj.get(3).add(1);
		
		adj.get(2).add(4);
		adj.get(4).add(2);
		
		adj.get(3).add(4);
		adj.get(4).add(3);
		
//		[ 0:[]
//		  1:[2,3]
//		  2:[1,4]
//		  3:[1,4]
//		  4:[2,3] ]
		System.out.println(adj);
	}

}
