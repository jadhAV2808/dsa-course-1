package tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversalInSpiralForm {

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
		
		traverseSprial(root);
	}

	private static void traverseSprial(Node root) {
		if(root==null)
			return;
		Queue<Node> queue=new LinkedList<>();
		
	}
	
	
}
