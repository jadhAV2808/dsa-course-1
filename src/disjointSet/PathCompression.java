package disjointSet;

public class PathCompression {
	
	private int[] parent;
	
	
	int find(int x) {
		if(x==parent[x])
			return x;
		parent[x]=find(parent[x]);
		return parent[x];
	}

	public static void main(String[] args) {
		
	}
}
