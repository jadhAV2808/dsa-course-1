package tree;

/*
 * BalancedBT: diff between height of left sub-tree 
 *            & right sub-tree should not be more than 1 
 * 
 */

public class CheckBalancedBT {
	
	public static void main(String[] args) {
		
		Node root=new Node(20);
		root.left=new Node(8);
		root.right=new Node(12);
		
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		
		boolean isBalanced = isBalanced(root);
		System.out.println("isBalanced: "+ isBalanced);
		
		int height = isBalanced1(root);
		System.out.println("height: "+ height);
	}
	
	
	/*
	 * efficient
	 */
	private static int isBalanced1(Node root) {
		
		if(root==null)
			return 0;
		int lh = isBalanced1(root.left);
		if(lh==-1)
			return -1;
		int rh = isBalanced1(root.right);
		if(rh==-1)
			return -1;
		if(Math.abs(lh-rh)>1)
			return -1;
		else
			return 1 + Math.max(lh, rh);
	}

	/*
	 * naive
	 */
	private static boolean isBalanced(Node root) {
		if (root==null) 
			return true;
		int lh = height(root.left);
		int rh = height(root.right);
		
		return (Math.abs(rh-lh)<=1 && 
				isBalanced(root.left) && 
				isBalanced(root.right));
	}

	private static int height(Node root) {
		if(root==null)
			return 0;
		
		return 1+ Math.max(height(root.left), height(root.right));
	}

}
