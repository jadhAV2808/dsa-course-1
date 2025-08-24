package tree;

public class HeightOfBinaryTree {

	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		
		root.right.left=new Node(40);
		root.right.right=new Node(50);
		
		int height = findHeight(root);
		System.out.println("height: "+ height);
	}

	private static int findHeight(Node root) {
		
		if(root==null)
			return 0;
		else 
			return 1 + Math.max(findHeight(root.left), findHeight(root.right));
		
		
	}
	
}
