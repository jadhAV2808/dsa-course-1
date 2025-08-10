package linkedList;

public class LLTraversal {
	
	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		
		printList(head);
		printList1(head);
		
		
		
	}

	private static void printList(Node head) {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(" ");
	}
	
	
	/*
	 * recursive traversal of LL
	 * tc->O(n)
	 * sc->O(n)
	 */
	private static void printList1(Node head) {
		if(head==null)
			return;
		System.out.print(head.data+" ");
		printList1(head.next);
	}
	

}
