package linkedList;

import java.util.Stack;

public class PalindromeLL {
	
	private static void printList(StrNode head) {
		StrNode temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		
		StrNode head = new StrNode("R");
		head.next=new StrNode("A");
		head.next.next=new StrNode("D");
		head.next.next.next=new StrNode("A");
		head.next.next.next.next=new StrNode("R");
		
		printList(head);
		
		boolean flag = isPalindrome(head);
		System.out.println("isPalindrome: "+ flag);
	}
	
	/*
	 * efficient -by finding middle node
	 * 
	 * 1] find second half and reverse it.
	 * 2] now one by one compare first half 
	 *    and reversed second half
	 */
	private static boolean isPalindrome1(StrNode head) {
		if(head==null)
			return true;
		
		StrNode fastNode=head, slowNode=head;
		while(fastNode!=null && fastNode.next!=null) {
			slowNode=slowNode.next;
			fastNode=fastNode.next.next;	
		}
		StrNode rev  = reverse(slowNode);
		
		StrNode current = head;
		while(rev!=null) {
			if(rev.data!=current.data)
				return false;
			rev=rev.next;
			current=current.next;
		}
		return true;
	}

	private static StrNode reverse(StrNode slowNode) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * naive-stack
	 */
	private static boolean isPalindrome(StrNode head) {
		Stack<String> stack= new Stack<>();
		for(StrNode node=head; node!=null; node=node.next)
			stack.push(node.data);
		for(StrNode node=head; node!=null; node=node.next) {
			if(!stack.pop().equals(node.data))
				return false;
		}
		return true;
	}

}


class StrNode{
	String data;
	StrNode next;
	
	public StrNode() {}
	
	public StrNode(String data) {
		super();
		this.data = data;		
	}
	
	
	
}