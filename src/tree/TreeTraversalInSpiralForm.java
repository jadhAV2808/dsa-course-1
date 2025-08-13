package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
		System.out.println(" ");
		traverseSprial1(root);
		
	}
	
	
	/*
	 * efficient: using 2 stacks
	 * 
	 * 1] push root to st1
	 * 2] while any of the 2 stacks is not empty
	 *    while(st1 is not empty)
	 *       1] take out a node, print it.
	 *       2] push children of taken curr nodes into s2
	 *   
	 *    while st2 is not empty
	 *       1] take out a node, print it.
	 *       2] push children of taken curr nodes into s1 in reverse order
	 *       
	 */
	private static void traverseSprial1(Node root) {
		Stack<Node>stack1 = new Stack<>();
		Stack<Node>stack2 = new Stack<>();
		
		stack1.push(root);
		
		while(!stack1.isEmpty() || !stack2.isEmpty()) {
			
			while(!stack1.isEmpty()) {
				Node curr = stack1.pop();
				System.out.print(curr.data+" ");
				
				if(curr.left!=null)
					stack2.add(curr.left);
				if(curr.right!=null)
					stack2.add(curr.right);
				
			}
			System.out.println();
			
			while(!stack2.isEmpty()) {
				Node curr = stack2.pop();
				System.out.print(curr.data+" ");
				
				//reverse order
				if(curr.right!=null)
					stack1.add(curr.right);
				if(curr.left!=null)
					stack1.add(curr.left);
			}
			System.out.println(); 
		}
	}

	

	/*
	 * naive- using level order traversal(line by line traversal) & stack
	 */
	private static void traverseSprial(Node root) {
		if(root==null)
			return;
		Queue<Node> queue=new LinkedList<>();
		Stack<Integer>stack = new Stack<>();
		boolean reverse =false;
		
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			for(int i=0;i<size;i++) {
				Node curr = queue.poll();
				
				if(reverse)
					stack.push(curr.data);
				else
					System.out.print(curr.data+" ");
				if(curr.left!=null)
					queue.add(curr.left);
				if(curr.right!=null)
					queue.add(curr.right);
			}
			if(reverse) {
				while(!stack.isEmpty())
					System.out.print(stack.pop()+" ");
			}
			reverse=!reverse;
			
			System.out.println(" ");
		}
		
	}
	
	
}
