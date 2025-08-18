package bst;

import java.util.HashSet;

public class PairSum {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(8);
		
		root.left.left= new Node(4);
		root.left.right = new Node(9);
		
		
		root.right=new Node(20);
		root.right.left=new Node(11);
		root.right.right=new Node(30);
		
		root.right.right.left=new Node(25);
		
		int sum =39;
		HashSet<Integer> set = new HashSet<>();
		boolean isSum = isPairSum(root, sum, set);
		
		System.out.println("isSum: "+ isSum);
		
	}

	/*
	 * method-1
	 * 1] do inorder traversal of the given BST and store it in arr
	 * 2] use 2 pointer approach to find if arr has pair sum with given sum
	 * 
	 * tc: O()
	 * sc:O(n)
	 */
	
	
	
	/*
	 * method-2 (hashing & inorder)
	 * 
	 */
	private static boolean isPairSum(Node root, int sum, HashSet<Integer>set) {
		if(root==null)
			return false;
		if(isPairSum(root.left, sum, set))
			return true;
		if(set.contains(sum-root.data))
			return true;
		else
			set.add(root.data);
		
		return isPairSum(root.right, sum, set);
	}
	
	
}
