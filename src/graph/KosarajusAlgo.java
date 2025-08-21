package graph;

/*
 * Kosaraju's Algo: to find Strongly connected components.
 */

public class KosarajusAlgo {

	public static void main(String[] args) {
		
	}
	
	
	/*
	 * 1] order the vertices in decreasing order of finish times in DFS
	 * 2] reverse all edges.
	 * 3] fo DFS of the reversed graph in the order obtained in step1. for every vertex, print all reachable vertices as one strongly connected components.
	 */
	
	
	/*
	 * implementation of step1:
	 * 1] create empty stack, st
	 * 2] do every vertex u, do the following:
	 *      if(u is not visited)
	 *          dfsRec(u,st)
	 * 3] while(!st.empty){
	 *      pop item and add to result.
	 *   }
	 * 
	 *  dfsRec(u,st){
	 *    a] mark u as visited
	 *    b] for every adj v : 
	 *           if (v is not visited)
	 *                 dfsRec(v,st)
	 *    c] st.push(u)
	 *  }
	 * 
	 * implementation of step2: transpose of matrix
	 * 
	 * implementation of step3: start dfs from start
	 */
}
