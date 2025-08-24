package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	public static void main(String[] args) {
		
		int v = 6;
		
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		
		for(int i=0;i<v;i++) 
			adjList.add(new ArrayList<Integer>());
		
		
		AdjListRepresentationOfGraph.addEdge(adjList,0,1);
		AdjListRepresentationOfGraph.addEdge(adjList,0,2);
		AdjListRepresentationOfGraph.addEdge(adjList,0,5);
		AdjListRepresentationOfGraph.addEdge(adjList,1,3);			
		AdjListRepresentationOfGraph.addEdge(adjList,2,4);
		AdjListRepresentationOfGraph.addEdge(adjList,3,5);		
		AdjListRepresentationOfGraph.addEdge(adjList,4,5);
		
		
//		AdjListRepresentationOfGraph.printGreaph(adjList);
		
		bfsDist(adjList, v);
		
	}

	private static void printBFS(ArrayList<ArrayList<Integer>> adjList, int source, boolean[] visited) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(source);
		visited[source]=true;
		
		while(!queue.isEmpty()) {
			int u=queue.poll();
			System.out.print(u+" ");
			
			for(int v: adjList.get(u)) {
				if(!visited[v]) {
					visited[v]=true;
					queue.add(v);
				}
			}
		}
		
	}
	
	public static void bfsDist(ArrayList<ArrayList<Integer>> adjList, int v) {
		boolean[] visited = new boolean[v+1];
		
		for(int i=0;i<v;i++) {
			if(!visited[i])
				printBFS(adjList, i, visited);
		}
	}
	
	
	
	

}
