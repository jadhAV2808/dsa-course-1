package bst;

/*
 * floor: closest smaller or equal value 
 */

public class FloorInBST {

	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(5);
		root.left.left=new Node(3);
		
		root.right=new Node(20);
		root.right.left=new Node(18);
		root.right.right=new Node(80);
		
		root.right.left.left=new Node(16);
		
		Node floor = findFloor(root, 19);
		System.out.println("floor: "+ floor.data);
	}

	/*
	 * efficient
	 * O(n)
	 */
	private static Node findFloor(Node root, int x) {
		Node res =null;
		while(root!=null) {
			if(root.data==x)
				return root;
			else if(root.data>x)
				root=root.left;
			else {
				res = root;
				root=root.right;
			}
		}
		return res;
	}
}
