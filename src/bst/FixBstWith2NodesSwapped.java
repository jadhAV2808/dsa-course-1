package bst;



public class FixBstWith2NodesSwapped {

	public static void main(String[] args) {
		
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(30);
		
		root.right.left = new Node(18);
		root.right.right = new Node(35);
		
		
		FixBstWith2NodesSwapped fix = new FixBstWith2NodesSwapped();
		fix.fixBst(root);
		
		System.out.println("first: "+ fix.firstNode.data);
		System.out.println("second: "+ fix.secondNode.data);
	}

	Node prevNode=null, firstNode=null, secondNode=null;
	
	private  void fixBst(Node root) {
		if(root==null)
			return;
		fixBst(root.left);
		
		if(prevNode!=null && root.data<prevNode.data) {
			if(firstNode==null)
				firstNode = prevNode;
			secondNode=root;
		}
		prevNode = root;
		fixBst(root.right);
	}

	
	private static void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		
	}
	
}
