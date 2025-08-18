package bst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class VerticalTraversal {
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(8);
		
		root.left.left= new Node(4);
		root.left.right = new Node(9);
		
		
		root.right=new Node(20);
		root.right.left=new Node(11);
		root.right.right=new Node(30);
		
		root.right.right.left=new Node(25);
		
		
		traverse(root);
	}

	private static void traverse(Node root) {
		Queue<VertPair> queue = new LinkedList<>();
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		
		queue.add(new VertPair(root, 0));
		
		while(!queue.isEmpty()) {
			VertPair pair = queue.poll();
			Node curr = pair.node;
			int hd= pair.hd;
			
			if(map.containsKey(hd))
				map.get(hd).add(curr.data);
			else {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(curr.data);
				map.put(hd, list);
			}
			
			if(curr.left!=null)
				queue.add(new VertPair(curr.left, hd-1));
			if(curr.right!=null)
				queue.add(new VertPair(curr.right, hd+1));
		}
		
		
		//printint map
		for(Map.Entry<Integer, ArrayList<Integer>> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"  =>  "+entry.getValue()+" ");
		}
	}
}

class VertPair{
	Node node;
	int hd;
	
	public VertPair(Node node, int hd) {
		this.node=node;
		this.hd = hd;
	}
}