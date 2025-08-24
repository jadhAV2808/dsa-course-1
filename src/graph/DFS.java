package graph;

import java.util.ArrayList;

public class DFS {

	public static void main(String[] args) {
		
		int v = 7;
		
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		
		for(int i=0;i<v;i++) 
			adjList.add(new ArrayList<Integer>());
		
		
		AdjListRepresentationOfGraph.addEdge(adjList,0,1);
		AdjListRepresentationOfGraph.addEdge(adjList,0,4);
		AdjListRepresentationOfGraph.addEdge(adjList,1,2);
		AdjListRepresentationOfGraph.addEdge(adjList,2,3);		
		AdjListRepresentationOfGraph.addEdge(adjList,4,5);			
		AdjListRepresentationOfGraph.addEdge(adjList,4,6);
		AdjListRepresentationOfGraph.addEdge(adjList,5,6);	
		
		AdjListRepresentationOfGraph.printGreaph(adjList);
		
		printDfs(adjList,v);
		
	}

	private static void printDfs(ArrayList<ArrayList<Integer>> adjList, int v) {
		boolean[] vis = new boolean[v+1];
		
		for(int i=0;i<v;i++) {
			if(!vis[i]) {
				dfs(adjList,i,vis);
			}
		}
	}

	private static void dfs(ArrayList<ArrayList<Integer>> adjList, int source, boolean[] vis) {
		
		vis[source]=true;
		System.out.print(source+" ");
		
		for(int u: adjList.get(source)) {
			if(!vis[u]) 
				dfs(adjList, u, vis);			
		}
	}
}
