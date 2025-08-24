package tree;

public class BurnBTFromLeaf {

	public static void main(String[] args) {
		
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(100);
		
		root.left.left=new Node(60);
		root.left.right=new Node(70);
		
		root.right.left=new Node(40);
		root.right.right=new Node(50);
		
		
		
		Node leaf = root.right.left;
		int time = burnBT(root, leaf);
		
	}

	/*
	 * farthest node form given leaf node
	 */
	private static int burnBT(Node root, Node leaf) {
		
		return 0;
	}
}
