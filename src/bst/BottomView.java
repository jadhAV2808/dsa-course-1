package bst;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomView {


	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(8);
		
		root.left.left= new Node(4);
		root.left.right = new Node(9);
		
		
		root.right=new Node(20);
		root.right.left=new Node(11);
		root.right.right=new Node(30);
		
		root.right.right.left=new Node(25);
	
		printBottomView(root);
		
	}

	private static void printBottomView(Node root) {
		Queue<VertPair> queue = new LinkedList<>();
		Map<Integer, Integer> map = new TreeMap();
		
		queue.add(new VertPair(root, 0));
		
		while(!queue.isEmpty()) {
			VertPair pair = queue.poll();
			Node curr = pair.node;
			int hd= pair.hd;
			
			// Always update the map for bottom view
	        map.put(hd, curr.data);

	       
	        if (curr.left != null)
	            queue.add(new VertPair(curr.left, hd - 1));
	        if (curr.right != null)
	            queue.add(new VertPair(curr.right, hd + 1));
		}
		
		//printint map
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"  =>  "+entry.getValue()+" ");
		}
	}
	
	
}
