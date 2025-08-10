package linkedList;

public class DeletionCircularLL {

	private static void printCircularLL(Node head) {
		if(head==null)
			return ;
		Node tmp = head;
		do {
			System.out.print(tmp.data+" ");
			tmp=tmp.next;
		}while(tmp!=head);
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);		
		head.next.next.next.next=head;
		
		printCircularLL(head);
		
		head=deleteKthNode(head,3);
		printCircularLL(head);
		
		head=deleteHead(head);
		printCircularLL(head);
		
		head=deleteHead1(head);
		printCircularLL(head);
	
		head=deleteKthNode(head, 2);
		printCircularLL(head);
//		
//		head=insertAtTail1(head,95);
//		printCircularLL(head);
		
		
	}
	
	

	/*
	 * deletion of kth node
	 */
	private static Node deleteKthNode(Node head, int k) {
		if(head==null )
			return null;
		if(k==1)
			return deleteHead(head);
		Node current=head;
		for(int i=0;i<k-2;i++)
			current=current.next;
		current.next=current.next.next;
		
		return head;
	}
	
	
	
	

	/*
	 * deletion of head or deletion at beginning O(1) time
	 */
	private static Node deleteHead1(Node head) {
		if(head==null || head.next==null)
			return null;
		head.data=head.next.data;
		head.next=head.next.next;
		return head;
	}

	
	
	
	/*
	 * deletion of head or deletion at beginning
	 */
	private static Node deleteHead(Node head) {
		if(head==null || head.next==null)
			return null;
		
		Node current=head;
		while(current.next!=head) {
			current=current.next;
		}
		current.next=head.next;
		return current.next;
	}
}
