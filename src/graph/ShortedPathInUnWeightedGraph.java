package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortedPathInUnWeightedGraph {

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
		
		
		printShortestPath(adjList,v);
	}

	private static void printShortestPath(ArrayList<ArrayList<Integer>> adjList, int v) {
		int[] dist = new int[v];
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		boolean[] vis=new boolean[v];
		Arrays.fill(vis, false);
		
		for(int i=0;i<v;i++) {
			if(!vis[i]) {
				shortesPath(adjList,i,vis,dist);
			}
		}
		
		System.out.println("shortest Path: "+ Arrays.toString(dist));
	}

	private static void shortesPath(ArrayList<ArrayList<Integer>> adjList, int source, boolean[] vis, int[] dist) {
		
		dist[source]=0;
		Queue<Integer> queue=new LinkedList<>();
		queue.add(source);
		vis[source]=true;
		
		while(!queue.isEmpty()) {
			int u=queue.poll();
			
			for(int v: adjList.get(u)) {
				if(!vis[v]) {
					//imp
					dist[v]=dist[u]+1;
					queue.add(v);
					vis[v]=true;
				}
			}
			
		}
		
	}
	
	
}
