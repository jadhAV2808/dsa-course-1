package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBT {


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
		
		
		printLeftView(root);
		System.out.println(" ");
		printLeftView1(root);
	}
	
	/*
	 * iterative-solution
	 * line-by-line level order traversal
	 */
	private static void printLeftView1(Node root) {
		
		if(root==null)
			return;
		
		Queue<Node>  queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			for(int i=0;i<size;i++) {
				Node curr = queue.poll();
				if(i==0)
					System.out.print(curr.data+" ");
				
				if(curr.left!=null)
					queue.add(curr.left);
				if(curr.right!=null)
					queue.add(curr.right);	
			}		
		}
		
	}

	/*
	 * recursive-solution
	 * pre-order-traversal 
	 * & maintain level & maxLevel var 
	 * & if(maxLevel<level) print node
	 */
	private static void printLeftView(Node root) {
		printLeft(root, 1);
	}

	static int maxLevel=0;
	private static void printLeft(Node root, int level) {
//		int maxLevel=0;
		if(root==null)
			return;
		if(maxLevel<level) {
			System.out.print(root.data +" ");
			maxLevel=level;
		}
		printLeft(root.left, level+1);
		printLeft(root.right, level+1);
	}
}
