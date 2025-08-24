package disjointSet;

import java.util.Arrays;

public class KruskalsAlgo {
	
	int[] parent;
	int[] rank;
	
	public KruskalsAlgo(int V) {
		parent=new int[V];
		rank=new int[V];
		
		for(int i=0;i<V;i++) {
			parent[i]=i;
			rank[i]=0;
		}
	}
	
	public int find(int i) {
		if (parent[i] == i) {
            return i;
        }
		return find(parent[i]);
	}
	
	
	void union(int x, int y) {
		 int xRoot = find(x);
		 int yRoot = find(y);
		 
		 if(xRoot==yRoot)
			 return;
		 
		// If x's rank is less than y's rank
	    if (rank[xRoot] < rank[yRoot])
	    	 parent[xRoot] = yRoot;
	    else if (rank[yRoot] < rank[xRoot])
	    	parent[yRoot] = xRoot;
	    else {			
	    	parent[yRoot] = xRoot;
	    	rank[xRoot] = rank[xRoot] + 1;
		}
	}
	
	
	
	/*
	 * 1] sort all edges in increasing order
	 * 2] initialize MST=[], res=0;
	 * 3] do following for every edge e while MST size does not become V-1
	 *      a] if adding e to MSt does not cause a cycle
	 *              MST=MST  U {e}
	 *              res =res+ e.weight
	 *              
	 * 4] return res
	 */
	int kruskal(Edge[] arr, int V) {
		Arrays.sort(arr);
		int res =0;
		
		for(int i=0, s=0; s<V-1; i++) {
			Edge edge=arr[i];
			int x= find(edge.src);
			int y=find(edge.dest);
			
			if(x!=y) {
				res+=edge.wt;
				union(x, y);
				s++;
			}
		}		
		return res;
	}

	public static void main(String[] args) {
		
	}
}


class Edge implements Comparable<Edge>{
	
	int src, dest,wt;
	
	public Edge(int src, int dest, int wt) {
		super();
		this.src = src;
		this.dest = dest;
		this.wt = wt;
	}

	
	//sort all edges in increasing order
	@Override
	public int compareTo(Edge o) {
		
		return this.wt-o.wt;
	}
	
}