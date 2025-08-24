package tree;

import java.util.Stack;

public class IterativePreorder {

	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(100);
		
		root.left.left=new Node(60);
		root.left.right=new Node(70);
		
		root.right.left=new Node(40);
		root.right.right=new Node(50);
		
		root.left.left.left=new Node(77);
		
		preorder(root);
	}
	
	/*
	 * efficient
	 * TC: O(n)
	 * SC:O(h)
	 */
	private static void preorder1(Node root) {
		
	}

	/*
	 * naive
	 * TC: O(N)
	 * SC: O(N)
	 */
	private static void preorder(Node root) {
		Stack<Node> stack = new Stack<>();
		
		stack.push(root);
		while (!stack.isEmpty()) {
			Node curr = stack.pop();
			System.out.print(curr.data+" ");
			
			if(curr.right!=null)
				stack.push(curr.right);
			if(curr.left!=null)
				stack.push(curr.left);
		}
	}
}
