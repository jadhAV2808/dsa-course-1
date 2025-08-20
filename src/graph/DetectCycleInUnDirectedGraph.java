package graph;

import java.util.ArrayList;

public class DetectCycleInUnDirectedGraph {

	public static void main(String[] args) {
		
		int v=9;
		
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		
		for(int i=0;i<v;i++) {
			adjList.add(new ArrayList<Integer>());
		}
		
		AdjListRepresentationOfGraph.addEdge(adjList,0,1);
		AdjListRepresentationOfGraph.addEdge(adjList,0,2);
		AdjListRepresentationOfGraph.addEdge(adjList,1,2);
		AdjListRepresentationOfGraph.addEdge(adjList,1,3);
		AdjListRepresentationOfGraph.addEdge(adjList,2,3);	
		
		boolean isCyclic = isCycle(adjList,v);
		
		System.out.println("isCyclic: "+ isCyclic);
		
	}

	private static boolean isCycle(ArrayList<ArrayList<Integer>> adjList, int v) {
		
		boolean[] vis=new boolean[v];
		for(int i=0;i<v;i++) {
			if(!vis[i]) {
				if(dfs(adjList,i,vis,-1))
					return true;
			}
		}
		return false;
	}

	private static boolean dfs(ArrayList<ArrayList<Integer>> adjList, int source, boolean[] vis, int parent) {
		vis[source]=true;
		for(int u: adjList.get(source)) {
			if(!vis[u]) {
				if(dfs(adjList, u, vis, source))
					return true;
				
				//boz undirected graph
				else if(u!=parent)
					return true;
			}
		}
		return false;
	}
	
}
