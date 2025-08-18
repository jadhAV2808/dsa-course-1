package bst;

import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.TreeMap;

public class VerticalSum {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(8);
		
		root.left.left= new Node(4);
		root.left.right = new Node(9);
		
		
		root.right=new Node(20);
		root.right.left=new Node(11);
		root.right.right=new Node(30);
		
		root.right.right.left=new Node(25);
		
		
		printVerticalSum(root);
	}

	/*
	 * 
	 */
	private static void printVerticalSum(Node root) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		
		vSumR(root,0,map);
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.print(entry.getValue()+" ");
		}
	}

	private static void vSumR(Node root, int hd, TreeMap<Integer, Integer> map) {
		if(root==null)
			return;
		vSumR(root.left, hd-1, map);
		
		int pSum = map.get(hd)==null ? 0 : map.get(hd);
		
		map.put(hd, pSum+root.data);
		
		vSumR(root.right, hd+1, map);
	}
}
