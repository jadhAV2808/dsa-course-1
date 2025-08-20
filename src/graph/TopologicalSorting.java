package graph;

import java.util.ArrayList;
import java.util.Stack;import linkedList.NthNodeFromEndOfLL;

public class TopologicalSorting {
	
	//directed graph
	public static void addEdge(ArrayList<ArrayList<Integer>> adjList,int source, int destination) {
        adjList.get(source).add(destination);
    }
	
	
	private static void findInDegree(ArrayList<ArrayList<Integer>> adjList, int n) {
		int[] indgree = new int[n];
		for(ArrayList<Integer> list: adjList) {
			for(int i: list) {
				indgree[i]++;
			}
		}
		
		for (int k = 0; k < n; k++) {
            System.out.println("Vertex " + k
                               + " has indgree"
                               + "\t" + indgree[k]);
        }
		
	}

	
	public static void main(String[] args) {
		int v=5;
		
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		
		for(int i=0;i<v;i++) {
			adjList.add(new ArrayList<Integer>());
		}
		
		//directed graph
		addEdge(adjList,0,2);
		addEdge(adjList,0,3);
		addEdge(adjList,1,3);
		addEdge(adjList,1,4);
		
		int n=adjList.size();
		

		
//		AdjListRepresentationOfGraph.printGreaph(adjList);;

//		findInDegree(adjList, n);
		
		
		//topological sort o/p: 0,1,2,3,4
		
		
		
	}


	


	
	
	/*
	 * bfs based solution
	 * (name of algo: Kahn's algo)
	 * 
	 * 1] store indegree of every vertex (indegree: means number of incoming edges)
	 * 2] create queue q.
	 * 3] add all 0 indegree verteces to the q.
	 * 4] while(!q.empty()){
	 *     
	 *     a] u=q.pop()
	 *     b]print u
	 *     c for every adj. v of u:
	 *          i] reduce indegree of v by 1
	 *          i] if indegreeof v becomes 0 , add v to the q
	 *    
	 *    }
	 * 
	 */
	
	
	
	
	/*
	 * Using DFS algo
	 * 
	 * 1] create empty stack st
	 * 2] for every vertex u, do following 
	 *     if(u is not visited)
	 *         dfs(u, st)
	 * 3] while(!st.empty){
	 *      pop item from st ad print
	 *   }
	 *   
	 * dfs(u,st){
	 *   1] mark u as visited
	 *   2] for every adj v of u :
	 *        if( if v not visited)
	 *            dfs(v,st)
	 *   3] push u to st.
	 * }
	 */
	
}
