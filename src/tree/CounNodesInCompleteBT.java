package tree;

public class CounNodesInCompleteBT {

	public static void main(String[] args) {
		
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(100);
		
		root.left.left=new Node(60);
		root.left.right=new Node(70);
		
		root.right.left=new Node(40);
		root.right.right=new Node(50);
		
		root.left.left.left=new Node(77);
		
		int cnt = countNodes(root);
		System.out.println("No. of nodes: "+ cnt);
		
		
		cnt = countNodes1(root);
		System.out.println("No. of nodes: "+ cnt);
		
	}
	
	
	/*
	 * efficient
	 * tc: O( log n * log n)
	 * 
	 */
	private static int countNodes1(Node root) {
		int lh=0, rh=0;
		
		Node curr = root;
		while(curr!=null) {
			lh++;
			curr = curr.left;
		}
		
		curr = root;
		while(curr!=null) {
			rh++;
			curr = curr.right;
		}

		if(lh==rh)
			return (int) (Math.pow(2, rh)-1);
		
		return 1 + 
				countNodes1(root.left) + 
				countNodes1(root.right);
		
			
	}

	/*
	 * naive
	 * tc: O(n)
	 * 
	 */
	private static int countNodes(Node root) {
		if(root==null)
			return 0;
		
		return  1+ 
				countNodes(root.left) + 
				countNodes(root.right);
	}
}
