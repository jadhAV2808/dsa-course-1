package graph;

import java.util.ArrayList;

public class AdjListRepresentationOfGraph {

	public static void main(String[] args) {
		
		int v = 4;
		
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		
		for(int i=0;i<v;i++) 
			adjList.add(new ArrayList<Integer>());
		
		
		addEdge(adjList,0,1);
		addEdge(adjList,0,2);
		addEdge(adjList,1,2);
		addEdge(adjList,1,3);
		
		printGreaph(adjList);
		
	}

	

	public static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
		
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}
	
	
	
	public static void printGreaph(ArrayList<ArrayList<Integer>> adjList) {
		for(int i=0;i<adjList.size();i++) {
			
			for(int j=0;j<adjList.get(i).size();j++) {
				System.out.print(adjList.get(i).get(j)+" ");
			}
			System.out.println(" ");
		}
	}
}
