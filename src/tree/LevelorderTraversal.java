package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelorderTraversal {

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
		
		levelorder(root);
		System.out.println(" ");
		
		levelorder1(root);
		System.out.println(" ");
		
		levelorder2(root);
	}

	
	/*
	 * tc:O(n)
	 * sc:O(n)
	 */
	private static void levelorder(Node root) {
		if(root==null)
			return;
		
		Queue<Node>  queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			System.out.print(curr.data+" ");
			
			if(curr.left!=null)
				queue.add(curr.left);
			if(curr.right!=null)
				queue.add(curr.right);	
		}
		System.out.println(" ");
	}
	
	
	/*
	 * tc:O(n)
	 * sc:O(n)
	 */
	private static void levelorder1(Node root) {
		if(root==null)
			return;
		
		Queue<Node>  queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while(queue.size()>1) {
			Node curr = queue.poll();
			if(curr==null) {
				System.out.println(" ");
				queue.add(null);
				continue;
			}
			System.out.print(curr.data+" ");
			
			if(curr.left!=null)
				queue.add(curr.left);
			if(curr.right!=null)
				queue.add(curr.right);	
		}
		System.out.println(" ");
	}
	
	
	/*
	 * line-by-line level order traversal
	 */
	private static void levelorder2(Node root) {
		if(root==null)
			return;
		
		Queue<Node>  queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			for(int i=0;i<size;i++) {
				Node curr = queue.poll();
				System.out.print(curr.data+" ");
				
				if(curr.left!=null)
					queue.add(curr.left);
				if(curr.right!=null)
					queue.add(curr.right);	
			}
			System.out.println(" ");
		}	
		System.out.println(" ");
	}
}
