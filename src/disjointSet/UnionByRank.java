package disjointSet;

public class UnionByRank {
	
	private int[] parent;
	private int[] rank;
	
	public UnionByRank(int size) {
		parent=new int[size];
		rank=new int[size];
		for(int i=0;i<size;i++) {
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
	
	public static void main(String[] args) {
		
		int size = 5;
		UnionByRank ubr = new UnionByRank(size);
		ubr.union(1, 2);
		ubr.union(3, 4);
		ubr.union(1, 4);
        boolean inSameSet = ubr.find(3) == ubr.find(2);
        System.out.println("Are 3 and 2 in the same set? " + inSameSet);
	}

}
