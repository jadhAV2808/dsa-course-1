package bst;

public class Deletion {

	public static void main(String[] args) {
		
		Node root = new Node(15);
		root.left = new Node(5);
		root.left.left=new Node(3);
		
		root.right=new Node(20);
		root.right.left=new Node(18);
		root.right.right=new Node(80);
		
		root.right.left.left=new Node(16);
		
		root = delete(root, 18);
		System.out.println(root);
	}

	/*
	 * tc: O(h)
	 * sc: O(h)
	 */
	private static Node delete(Node root, int x) {
		if(root==null)
			return  root;
		
		if(root.data>x)
			root.left=delete(root.left, x);
		else if(root.data>x)
			root.right = delete(root.right, x);
		else {
			if(root.left==null) {
				Node temp = root.right;
				return temp;
			}else if(root.right==null) {
				Node temp = root.left;
				return temp; 
			}else {
				Node succNode  =getSuccessor(root);
				root.data= succNode.data;
				root.right= delete(root.right, succNode.data);		
			}
		}
		return root;
	}

	private static Node getSuccessor(Node root) {
		root=root.right;
		while(root!=null && root.left!=null)
			root = root.left;
		return root;
	}
}
