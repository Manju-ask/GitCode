package graph_traversal;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

	private static List<Integer> dfs(int node, List<List<Integer>> adj, 
			boolean[] visited, List<Integer> list){
		//adding vertex from DFS traversal path.
		list.add(node);
		visited[node] = true;
		
		//for each adjacent vertices of the current vertex.
		for(Integer i: adj.get(node)) {
			if(visited[i] == false) {
				/*
				 * DFS traverse depth-wise in a graph which is similar to recursive calls of
				 * recursion tree.
				 */
				dfs(i, adj, visited, list);
			}
		}
		return list;
	}
	
	private static List<Integer> dfsOfGraph(int startNode, int N, List<List<Integer>> adj){
		List<Integer> dfsList = new ArrayList<Integer>(); //to store traversal path.
		
		//to traverse unique vertices in a path and also visit unconnected component of a graph.
		boolean[] visited = new boolean[N];
		
		return dfs(startNode,adj,visited,dfsList);
	}
	
	public static void main(String[] args) {
		int N = 8;   //No. of vertices in graph
		List<List<Integer>> adj = new ArrayList<List<Integer>>();
//		Undirected graph:
//		     (0)
//		     / \
//		    /	\
//		  (1)   (4)---(5) 
//		  / \    |     |
//		(2) (3) (7)---(6)
  
		for(int i=0; i<N; i++) {
			adj.add(new ArrayList<Integer>());
		}
			
		adj.get(0).add(1);
		adj.get(1).add(0);
		
		//edge 1--2  (undirected)
		adj.get(1).add(2); //1->2  
		adj.get(2).add(1); //2->1
		
		adj.get(1).add(3);
		adj.get(3).add(1);
		
		adj.get(0).add(4);
		adj.get(4).add(0);
		
		adj.get(4).add(5);
		adj.get(5).add(4);
		
		adj.get(5).add(6);
		adj.get(6).add(5);
		
		adj.get(6).add(7);
		adj.get(7).add(6);
		
		adj.get(4).add(7);
		adj.get(7).add(4);

		int startNode = 0;
		System.out.println(dfsOfGraph(startNode, N, adj));
	}

}
