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
		
		int floor = findFloor(root, 17);
		System.out.println("floor: "+ floor);
	}

	/*
	 * efficient
	 * O(n)
	 */
	private static int findFloor(Node root, int x) {
		// TODO Auto-generated method stub
		return 0;
	}
}
