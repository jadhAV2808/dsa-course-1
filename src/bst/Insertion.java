package bst;

public class Insertion {
	
	public static void main(String[] args) {
		
		Node root = new Node(15);
		root.left = new Node(5);
		root.left.left=new Node(3);
		
		root.right=new Node(20);
		root.right.left=new Node(18);
		root.right.right=new Node(80);
		
		root.right.left.left=new Node(16);
		
		System.out.println(root);

		//if data already present the do nothing
		root= insert(root, 10);
		System.out.println(root);
		root= insert1(root, 11);
		System.out.println(root);
	}

	/*
	 * recursive
	 */
	private static Node insert(Node root, int data) {
		Node node = new Node(data);
		if(root==null)
			return node;
		else if(data<root.data)
			root.left=insert(root.left, data);
		else if(data>root.data)
			root.right=insert(root.right, data);
		return root;
	}

	
	/*
	 * iterative
	 */
	private static Node insert1(Node root, int data) {
		Node node = new Node(data);
		Node curr = root;
		Node parent = null;
		
		 if (root == null) {
		        return node; // Tree was empty
		    }
		
		while(curr!=null) {
			parent = curr;
			if(data<root.data)
				curr=curr.left;
			else if(data>root.data)
				curr=curr.right;
			else
				return root;
		}
		// Now parent is the node under which we insert newNode
		if(parent==null)
			return node;
	    if (data < parent.data) {
	        parent.left = node;
	    } else {
	        parent.right = node;
	    }

	    
		return root;
	}

}
