package bst;



public class Search {

	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(5);
		root.left.left=new Node(3);
		
		root.right=new Node(20);
		root.right.left=new Node(18);
		root.right.right=new Node(80);
		
		root.right.left.left=new Node(16);
		
		boolean isFound = isFound(root, 16);
		System.out.println("isFound: "+ isFound);
		
		isFound = isFound1(root, 16);
		System.out.println("isFound: "+ isFound);
		
	}
	
	/*
	 * iterative
	 * tc: O(h)
	 * sc:O(1)
	 */
	private static boolean isFound1(Node root, int x) {
		
		while(root!=null) {
			if(root.data==x)
				return true;
			else if(x<root.data)
				root = root.left;
			else
				root = root.right;
		}
		return false;
	}

	/*
	 * recursive
	 * tc: O(h)
	 * sc:O(h)
	 */
	private static boolean isFound(Node root, int x) {
		if(root==null)
			return false;
		if(root.data==x)
			return true;
		if(x<root.data)
			return isFound(root.left, x);
		else
			return isFound(root.right, x);
		
	}
	
}
