package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CountConnectedComponents {
	
	public static void main(String[] args) {
		
		int v = 9;
		
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		
		for(int i=0;i<v;i++) 
			adjList.add(new ArrayList<Integer>());
		
		
		AdjListRepresentationOfGraph.addEdge(adjList,0,1);
		AdjListRepresentationOfGraph.addEdge(adjList,0,2);
		AdjListRepresentationOfGraph.addEdge(adjList,1,2);
		
		AdjListRepresentationOfGraph.addEdge(adjList,3,4);
		
		AdjListRepresentationOfGraph.addEdge(adjList,5,6);			
		AdjListRepresentationOfGraph.addEdge(adjList,5,7);
		AdjListRepresentationOfGraph.addEdge(adjList,7,8);		
		
		
		int cnt = countConnComps(adjList, v);
		System.out.println("Number of connected components: "+ cnt);
		
	}

	private static int countConnComps(ArrayList<ArrayList<Integer>> adjList, int v) {
		int cnt=0;
		
		boolean[] vis = new boolean[v+1];
		
		for(int i=0;i<v;i++) {
			if(!vis[i]) {
				bfs(adjList, i, vis);
				cnt++;
			}
		}
		
		return cnt;
	}

	private static void bfs(ArrayList<ArrayList<Integer>> adjList, int source, boolean[] vis) {
		
		Queue<Integer> queue= new LinkedList<>();
		
		queue.add(source);
		vis[source]=true;
		
		while (!queue.isEmpty()) {
			int u = queue.poll();
			
			for(int v: adjList.get(u)) {
				if(!vis[v]) {
					vis[v]=true;
					queue.add(v);
				}
			}
		}
	}

}
