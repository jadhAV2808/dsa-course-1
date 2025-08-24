package tree;

/*
 * to convert BT to DLL : we assume left as prev and right as next
 * left=> prev
 * right=> next
 */

public class ConvertBTtoDLL {

	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		
		root.left.left=new Node(11);
		
		root.right.left=new Node(40);
		root.right.right=new Node(50);
		
		
		root = convertToDLL(root);
		
		System.out.println(root);
	}

	/*
	 * left=> prev
     * right=> next
     * 
     * traversal-inorder
     * 
     * 
	 */
	static Node prev = null;
	
	private static Node convertToDLL(Node root) {
		if(root==null)
			return root;
		Node head = convertToDLL(root.left);
		
		if(prev==null)
			head=root;
		else {
			root.left=prev;
			prev.right=root;
		}
		prev=root;
		
		convertToDLL(root.right);
		return head;
	}
	
	
	
}
