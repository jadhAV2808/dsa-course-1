package trie;



public class CountDistinctRows {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,0,0},
				{1,1,1},
				{1,0,0},
				{1,1,1},
				{1,1,0},
		};
		int m=matrix.length;
		int n=matrix[0].length;
		
		int cnt = distinctRows(matrix,m,n);
		System.out.println("distinctRows: "+ cnt);
	}

	private static int distinctRows(int[][] matrix, int m, int n) {
		int res=0;
		BinaryTrieNode root = new BinaryTrieNode();
		for(int row=0;row<m;row++) {
			if(insert(root, matrix,row,n))
				res++;
		}		
		return res;
	}

	private static boolean insert(BinaryTrieNode root, int[][] matrix, int row,int n) {
		BinaryTrieNode curr = root;
		boolean flag=false;
		
		for(int i=0;i<n;i++) {
			int index=matrix[row][i];
			if(curr.child[index]==null) {
				curr.child[index]=new BinaryTrieNode();
				flag=true;
			}
			curr=curr.child[index];
		}
		
		return flag;
	}
}

class BinaryTrieNode{
	BinaryTrieNode child[]= new BinaryTrieNode[2];  //contains only 0 & 1
	
}