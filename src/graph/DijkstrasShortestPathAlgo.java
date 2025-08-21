package graph;

import java.util.Arrays;

/*
 * Dijkstra's Algo: 
 * 
 * does not work for negative weighted edges.
 * 
 * does the shortest path change if add a weight to all edges of the original graph?
 *  ans: yes
 */

public class DijkstrasShortestPathAlgo {
	
	
	
	public static void main(String[] args) {
		int[][] graph = {   {0,5,10,0}, 
							{5,0,3,20},
							{10,3,0,2},
							{0,20,2,0}
		};
		int v=4;
		int src=0;
		
		
		int[] dist = dijkstras(graph, src, v);
		System.out.println("shortest path: "+ Arrays.toString(dist));
	}

	private static int[] dijkstras(int[][] graph, int src, int V) {
		int[] dist =new int[V];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[0]=0;
		boolean[] finalized = new boolean[V];
		Arrays.fill(finalized, false);
		
		for(int cnt=0;cnt<V-1;cnt++) {
			int u=-1;
			
			for(int i=0;i<V;i++) {
				if(!finalized[i] &&(u==-1 || dist[i]<dist[u]))
					u=i;
			}
			finalized[u]=true;
			
			for(int v=0;v<V;v++) {
				if(!finalized[v]&& graph[u][v]!=0)
					dist[v]= Math.min(dist[v], dist[u]+  graph[u][v]);
			}
		}
		
		return dist;
	}
	
	
	/*
	 * Implementation:
	 * 
	 * 1] create an empty priority Queue pq.
	 * 2] dist[v]= {Integer.MAx};
	 * 3] dist[source]=0;
	 * 4] insert all distances in pq.
	 * 5] while(!pq.empty){
	 *         u=pq.extractMin()
	 *         relax all adjacent of u that are not in pq
	 *         
	 *    }
	 */
	

}

