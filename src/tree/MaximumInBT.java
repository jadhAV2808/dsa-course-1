package tree;

public class MaximumInBT {

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
		
		int max = findMax(root);
		System.out.println("size: "+ max);
	}

	private static int findMax(Node root) {
		if(root==null)
			return -1;
		else
			return Math.max(root.data, 
					Math.max(findMax(root.left), findMax(root.right)));
		
	}
}
