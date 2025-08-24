package tree;
/*
 * size of BT : number of nodes in it
 */
public class SizeOfBT {

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
		
		int size = findSize(root);
		System.out.println("size: "+ size);
	}

	/*
	 * tc:O(n)
	 * sc:O(h)
	 */
	private static int findSize(Node root) {
		if(root==null)
			 return 0;
		else
			return 1+ 
					findSize(root.left)+ 
					findSize(root.right);
		
	}
}
