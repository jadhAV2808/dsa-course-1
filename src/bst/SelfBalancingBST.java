package bst;

/*
 * SelfBalancingBST:
 *  1] AVL tree: it is a BST, 
 *               it is balanced(for every node , 
 *               the difference between left & right heights does not exceed one)
 *               
 *               Balance factor = |lh-rh|
 *               balance factor<=1
 *               
 *   AVL tree operations: perform normal BST insert.
 *                        traverse all ancestor of the newly inserted node from the node to right.
 *                        if find an unbalanced node, check for any of the below cases:
 *                            1] left-left
 *                            2] right-right
 *                            3] left-right
 *                            4] right-left
 *               
 *  
 *  2] red-black tree:
 */

public class SelfBalancingBST {

	public static void main(String[] args) {
		
	}
}
