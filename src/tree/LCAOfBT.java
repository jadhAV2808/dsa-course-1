package tree;

import java.nio.file.Path;
import java.util.ArrayList;

/*
 * LCA: lowest common ancestors.
 */

public class LCAOfBT {
	
	public static void main(String[] args) {
		
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(100);
		
		root.left.left=new Node(60);
		root.left.right=new Node(70);
		
		root.right.left=new Node(40);
		root.right.right=new Node(50);
		
		root.left.left.left=new Node(90);
		root.left.left.right=new Node(80);
		
		
		Node node = findLca(root, 50,90);
		System.out.println("lca: " + node.data);
	}

	/*
	 * naive
	 */
	private static Node findLca(Node root, int n1, int n2) {
		
		ArrayList<Node> path1= new ArrayList<>();
		ArrayList<Node> path2= new ArrayList<>();
		
		if(!findPath(root, path1,n1) ||  ! findPath(root, path2,n2))
			return null;
		
		Node lca = null;
		for (int i = 0; i < path1.size() && i < path2.size(); i++) {
			if (path1.get(i) != path2.get(i))
				break;
			lca = path1.get(i);
		}
		return lca;
		
	}

	private static boolean findPath(Node root, ArrayList<Node> path, int n) {
		if(root==null)
			return false;
		path.add(root);
		if(root.data==n)
			return true;
		if(findPath(root.left, path,n) ||  findPath(root.right, path,n))
			return true;
		path.remove(path.size()-1);
		return false;
	}

}
