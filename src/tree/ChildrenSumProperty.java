package tree;
/*
 * ChildrenSumProperty: root.data = left data + right data
 * 
 */

public class ChildrenSumProperty {

	public static void main(String[] args) {
		
		Node root=new Node(20);
		root.left=new Node(8);
		root.right=new Node(12);
		
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		
		boolean isFollow = isFollowingChildrenSumProp(root);
		System.out.println("isFollow: "+ isFollow);
	}

	private static boolean isFollowingChildrenSumProp(Node root) {
		if(root==null)
			return true;
		
		if(root.left==null && root.right==null)
			return true;
		
		int sum = 0;
		if(root.left!=null ) 
			sum+=root.left.data;
		if(root.right!=null)
			sum+=root.right.data;
		
		return (root.data==sum && 
				isFollowingChildrenSumProp(root.left) &&
				isFollowingChildrenSumProp(root.right));
	}
}
