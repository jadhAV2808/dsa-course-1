package graph;

import java.util.Arrays;

/*
 * Minimum Spanning tree:
 *  A spanning tree is defined as a tree-like 
 *  subgraph of a connected, undirected graph that 
 *  includes all the vertices of the graph. Or, to say in Layman's words, 
 *  it is a subset of the edges of the graph that forms a tree (acyclic) 
 *  where every node of the graph is a part of the tree.
 *  
 *  A minimum spanning tree (MST) is defined as a spanning tree that 
 *  has the minimum weight among all the possible spanning trees.
 *  
 *  There is a fixed number of edges in the spanning tree which is equal to 
 *  one less than the total number of vertices ( E = V-1 ).
 *  
 *  eg: minimize the wire length and 
 *  make sure that all computers are connected 
 *  to each other may be through intermediate computers(weighted & connected unDirected graph)
 *  
 *  
 *  
 *  
 *  
 *  Prim’s algorithm:
 *  Prim’s algorithm is a Greedy algorithm 
 *   The algorithm starts with an empty spanning tree.
 *   The idea is to maintain two sets of vertices. The first set contains the vertices already included in the MST, and the other set contains the vertices not yet included.
 *   At every step, it considers all the edges that connect the two sets and picks the minimum weight edge from these edges. After picking the edge, it moves the other endpoint of the edge to the set containing MST. 
 */


/*
Working of the Prim's Algorithm
	Step 1: Determine an arbitrary vertex as the starting vertex of the MST. We pick 0 in the below diagram.
	Step 2: Follow steps 3 to 5 till there are vertices that are not included in the MST (known as fringe vertex).
	Step 3: Find edges connecting any tree vertex with the fringe vertices.
	Step 4: Find the minimum among these edges.
	Step 5: Add the chosen edge to the MST. Since we consider only the edges that connect fringe vertices with the rest, we never get a cycle.
	Step 6: Return the MST and exit
*/

public class PrimsAlgo {
	
	
	public static void main(String[] args) {
		int graph[][] = new int[][] {   { 0, 2, 0, 6, 0 },
							            { 2, 0, 3, 8, 5 },
							            { 0, 3, 0, 0, 7 },
							            { 6, 8, 0, 0, 9 },
							            { 0, 5, 7, 9, 0 } 
							        };
        int v=5;
        
        
        int cnt = printMst(graph,v);
        
        System.out.println("cnt: "+ cnt);
        
							        
	}

	private static int printMst(int[][] graph, int V) {
		int res=0;
		int[] key=new int[V];
		Arrays.fill(key, Integer.MAX_VALUE);
		key[0]=0;		
		boolean[] mSet = new boolean[V];
		
		for(int cnt =0;cnt<V;cnt++) {
			int u=-1;
			
			for(int i=0;i<V;i++) {
				if(!mSet[i] && (u==-1 ||  key[i]<key[u]))
					u=i;
			}
			mSet[u]=true;
			res = res+ key[u];
			
			for(int v=0; v<V; v++) {
				if(!mSet[v] && graph[u][v]!=0 && graph[u][v]<key[v])
					key[v]= graph[u][v];
			}
			
		}
		
		return res;
	}

	
	
}
