package bst;

/*
 * Ceil:next greater or equal
 */

public class CeilInBST {
	
	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(5);
		root.left.left=new Node(3);
		
		root.right=new Node(20);
		root.right.left=new Node(18);
		root.right.right=new Node(80);
		
		root.right.left.left=new Node(16);
		
		Node ceil = findCeil(root, 17);
		System.out.println("ceil: "+ ceil.data);
	}

	/*
	 * tc:O(h)
	 * sc: O(1)
	 */
	private static Node findCeil(Node root, int x) {
		Node resNode =null;
		
		while (root!=null) {
			if(root.data==x)
				return root;
			if(root.data<x)
				root=root.right;
			else {
				resNode=root;
				root=root.left;
			}
			
			
		}
		return resNode;
	}

}
