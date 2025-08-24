package tree;

import java.util.HashMap;
import java.util.Map;

/*
 * DiameterOfBT: number of nodes on the longest path 
 *               between two leaf nodes.
 *            
 */

public class DiameterOfBT {

	public static void main(String[] args) {
		
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(100);
		
		root.left.left=new Node(60);
		root.left.right=new Node(70);
		
		root.right.left=new Node(40);
		root.right.right=new Node(50);
		
		root.left.left.left=new Node(90);
		root.left.left.right=new Node(80);
		
		int dia = findDiameter(root);
		System.out.println("diameter: "+ dia);
		
		int[] dia2 = new int[1];
		findDiameter2(root,dia2);
		System.out.println("diameter: "+ dia2[0]);
	}

	
	
	/*
	 * efficient : 
	 * tc: O(n)
	 * no overhead of map
	 */
	private static int findDiameter2(Node root, int[] res) {
		if(root==null)
			return 0;
		int lh = height(root.left);
		int rh = height(root.right);
		res[0] = Math.max(res[0], 1+lh+rh);
		
		return 1+ Math.max(lh, rh);
	}
	
	/*
	 * better : 
	 * tc: O(n)
	 * sc: O(n)
	 * precompute height of every node & store it in a map
	 */
	private static int findDiameter1(Node root) {
		if(root==null)
			return 0;
		Map<Node, Integer> heightMap = new HashMap<>();
		
		return 0;
	}
	
	
	
	/*
	 * naive
	 * 
	 * find the following value for 
	 * every node & return the max: 
	 *  max(1+lh+rh)
	 *  
	 *  lh->left height
	 *  rh->right height
	 *  
	 *  tc: O(n^2)
	 *  
	 * 
	 */
	private static int findDiameter(Node root) {
		if(root==null)
			return 0;
		
		int d1 = 1+ height(root.left) + height(root.right);
		
		int d2 = findDiameter(root.left);
		int d3 = findDiameter(root.right);
		
		return  Math.max(d1, Math.max(d2, d3));
	}
	
	private static int height(Node  root) {
		if(root==null)
			return 0;
		return 1+ 
				Math.max(height(root.left), height(root.right));
	}
}
