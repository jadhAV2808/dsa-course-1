package graph;

public class ShortestPathInDAG {

	public static void main(String[] args) {
		
	}
	
	
	
	/*
	 * shortestpath(adj,s)
	 *   1] initialize dist[v]={INF,INF,,,}
	 *   2]dis[s]=0;
	 *   3] find topological sort of the graph
	 *   4] for every vertex u in the topological sort:
	 *      a] for ever adj v of u:
	 *         if(dist[v]> dist[u]+ weight(u,v))
	 *               dist[v] = dist[u]+ weight(u,v)
	 */
}
