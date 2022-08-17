package graph_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BredthFirstSearch {
	
	public static List<Integer> bfs(int startNode, int N, List<List<Integer>> adj){
		List<Integer> bfsList = new ArrayList<Integer>(); //to store traversal path.
		
		//first comes adjacent vertices, and are traversed first. 
		Queue<Integer> q = new LinkedList<Integer>(); 
		
		//to traverse unique vertices in a path and also visit unconnected component of a graph.
		boolean[] visited = new boolean[N]; 
		
		q.add(startNode);  
		visited[startNode] = true;
		
		while(!q.isEmpty()) {
			Integer temp = q.poll();  //Retrieves and removes the head of this queue.
			bfsList.add(temp);        //adding vertex from BFS traversal path.
			
			//for each adjacent vertices of the current vertex.
			for(Integer i: adj.get(temp)) {
				if(visited[i] == false) {
					q.add(i);
					visited[i] = true;
				}	
			}
		}
		return bfsList;
		
	}
	
	public static void main(String[] args) {
		int N = 8;   //No. of vertices in graph
		List<List<Integer>> adj = new ArrayList<List<Integer>>();
//		Undirected graph:
//		     (0)
//		     / \
//		    /	\
//		  (1)   (2) 
//		  / \   / \
//		 / (4) (5) \
//		(3)  \ /   (6)
//		     (7)
		for(int i=0; i<N; i++) {
			adj.add(new ArrayList<Integer>());
		}
			
		adj.get(0).add(1);
		adj.get(1).add(0);
		
		adj.get(0).add(2);
		adj.get(2).add(0);
		
		//edge 1--3  (undirected)
		adj.get(1).add(3); //1->3  
		adj.get(3).add(1); //3->1
		
		adj.get(1).add(4);
		adj.get(4).add(1);
		
		adj.get(0).add(2);
		adj.get(2).add(0);
		
		adj.get(2).add(5);
		adj.get(5).add(2);
		
		adj.get(2).add(6);
		adj.get(6).add(2);
		
		adj.get(5).add(7);
		adj.get(7).add(5);

		int startNode = 0;
		System.out.println(bfs(startNode, N, adj));
	}

}
