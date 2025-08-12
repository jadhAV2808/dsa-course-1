package tree;

public class PrintNodesAtKDistance {
	
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		
		root.left.left=new Node(60);
		root.left.right=new Node(70);
		
		root.right.left=new Node(40);
		root.right.right=new Node(50);
		
		root.left.left.left=new Node(90);
		root.left.left.right=new Node(80);

		PrintNodesAtK(root, 3);
		
	}

	private static void PrintNodesAtK(Node root, int k) {
		if(root==null)
			return;
		if(k==0)
			System.out.print(root.data + " ");
		else {
			PrintNodesAtK(root.left, k-1);
			PrintNodesAtK(root.right, k-1);
		}
	}

}
