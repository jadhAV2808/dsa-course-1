package tree;

import java.util.ArrayList;

/*      serialize
 * BT <-----------> String OR Array
 *     deSerialize
 * 
 */
public class SerializeAndDeserializeBT {
	
	static void preorfer(Node root) {
		if(root==null)
			return;
		System.out.print(root.data +" ");
		preorfer(root.left);
		preorfer(root.right);
	}
	
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(100);
		
		root.left.left=new Node(60);
		root.left.right=new Node(70);
		
		root.right.left=new Node(40);
		root.right.right=new Node(50);
		
		root.left.left.left=new Node(77);
		
		ArrayList<Integer> list = new ArrayList<>();
		serializeBT(root,list);
		
		System.out.println("list: "+ list);
		
		Node root1 = deSerializeBT(list);
		preorfer(root1);
		
	}

	/*
	 * tc: O(n)
	 */
	static int index =0;
	private static Node deSerializeBT(ArrayList<Integer> list) {
		if(index==list.size())
			return null;
		int data = list.get(index);
		index++;
		if(data==-1)
			return null;
		Node root = new Node(data);
		root.left=deSerializeBT(list);
		root.right=deSerializeBT(list);
		return root;
		
	}

	/*
	 * will use -1 for null & will do preorder traversal
	 * tc: O(n)
	 */
	private static void serializeBT(Node root, ArrayList<Integer> list) {
		
		if(root==null) {
			list.add(-1);
			return;
		}
		
		list.add(root.data);
		serializeBT(root.left, list);
		serializeBT(root.right, list);
	}

}
