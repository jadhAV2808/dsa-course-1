package graph;

import java.util.ArrayList;

public class DetectCycleInDirectedGraph {

	public static void addEdge(ArrayList<ArrayList<Integer>> adjList,int source, int destination) {
        adjList.get(source).add(destination);
    }
	
	public static void main(String[] args) {
		

		int v=9;
		
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		
		for(int i=0;i<v;i++) {
			adjList.add(new ArrayList<Integer>());
		}
		
		addEdge(adjList,0,1);
		addEdge(adjList,1,2);
		addEdge(adjList,2,3);
		addEdge(adjList,3,4);
		addEdge(adjList,4,5);
		addEdge(adjList,5,3);
		
		
		
		boolean isCyclic = isCycle(adjList,v);
		
		System.out.println("isCyclic: "+ isCyclic);
	}

	

	private static boolean isCycle(ArrayList<ArrayList<Integer>> adjList, int v) {
		
		boolean[] vis=new boolean[v];
		boolean[] resStack=new boolean[v];
		
		for(int i=0;i<v;i++) {
			if(!vis[i]) {
				if(dfs(adjList,i,vis,resStack))
					return true;
			}
		}
		return false;
	}

	private static boolean dfs(ArrayList<ArrayList<Integer>> adjList, int source, boolean[] vis, boolean[] resStack) {
		
		vis[source]=true;
		resStack[source]=true;
		
		for(int u: adjList.get(source)) {
			if(!vis[u] && dfs(adjList, u, vis, resStack)) 
				return true;
			else if(resStack[u])
				return true;	
		}
		resStack[source]=false;
		return false;
	}

}
