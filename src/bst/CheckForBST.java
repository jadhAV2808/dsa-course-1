package bst;

public class CheckForBST {

	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(30);
		
		root.right.left = new Node(18);
		root.right.right = new Node(35);
		
		boolean isBst = isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println("isBST: "+isBst);
		
		isBst = isBst(root);
		System.out.println("isBST: "+isBst);
	}

	/*
	 * efficient -using ranges
	 */
	private static boolean isBst(Node root, int min, int max) {
		if(root== null)
			return true;
		
		return (root.data>min && root.data < max && 
				isBst(root.left, min, root.data) && 
				isBst(root, root.data, max));
	}
	
	/*
	 * efficient-inorder traverseal
	 * 
	 * A binary tree is BST, if inorder traversal of 
	 * it is in increasing order
	 */
	static int prev = Integer.MIN_VALUE;
	private static boolean isBst(Node root) {
		
		if(root==null)
			return true;
		
		if(!isBst(root.left))
			return false;
		
		if(root.data<=prev)
			return false;
		prev = root.data;
		
		return isBst(root.right);
	}
}
