package tree;



/*
 * we can only construct BT 
 * if inorder and preorder is given  
 * OR
 *  inorder and postorder is given  
 *  
 *  hence: inroder is compulsory with any one either pre or post
 */

public class ConstructBTFromInAndPreorder {

	public static void main(String[] args) {
		int[] in = {20,10,30};
		int[] pre = {10,20,30};
		
		Node root = constructBT(in, pre);
	}

	private static Node constructBT(int[] in, int[] pre) {
		Node root = new Node(pre[0]);
		
		
		
		return root;
	}
}
