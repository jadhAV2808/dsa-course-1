package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfBT {

	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		
		root.left.left=new Node(11);
		
		root.right.left=new Node(40);
		root.right.right=new Node(50);
		
		int maxWidth= maxWidth(root);
		System.out.println("maxWidth: "+ maxWidth);
	}

	private static int maxWidth(Node root) {
		if(root==null)
			return 0;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		int res = 0;
		while(!queue.isEmpty()) {
			int size = queue.size();
			res = Math.max(res, size);
			for(int i=0;i<size;i++) {
				Node curr = queue.poll();
				if(curr.left!=null)
					queue.add(curr.left);
				if(curr.right!=null)
					queue.add(curr.right);
			}
		}
		return res;
	}
}
