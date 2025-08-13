package tree;

import java.util.Stack;

public class IterativeInorder {

	public static void main(String[] args) {
		
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(100);
		
		root.left.left=new Node(60);
		root.left.right=new Node(70);
		
		root.right.left=new Node(40);
		root.right.right=new Node(50);
		
		root.left.left.left=new Node(77);
		
		inorder(root);
	}

	private static void inorder(Node root) {
		
		Stack<Node> stack = new Stack<>();
		Node curr = root;
		
		while (curr!=null || !stack.isEmpty()) {
			while (curr!=null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			System.out.print(curr.data+" ");
			
			curr=curr.right;
		}
		
	}
}
