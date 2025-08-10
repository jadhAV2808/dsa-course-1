package linkedList;

public class InsertionCircularLL {

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
		
		head=insertAtHead(head,5);
		printCircularLL(head);
		
		head=insertAtHead1(head,1);
		printCircularLL(head);
		
		
		head=insertAtTail(head,85);
		printCircularLL(head);
		
		head=insertAtTail1(head,95);
		printCircularLL(head);
		
		
	}
	
	/*
	 * insertion at tail or insertion at end at O(1) time
	 */
	private static Node insertAtTail1(Node head, int data) {
		
		Node node=new Node(data);
		if(head==null) {
			node.next=node;
			return node;
		}
		
		node.next=head.next;
		head.next=node;
		
		//swapping of data
		int t = node.data;
		node.data=head.data;
		head.data=t;
		return node;
		
		
	}

	/*
	 * insertion at tail or insertion at end
	 */
	private static Node insertAtTail(Node head, int data) {
		Node node=new Node(data);
		if(head==null) {
			node.next=node;
			return node;
		}
		Node current = head;
		while(current.next!=head) {
			current=current.next;
		}
		current.next=node;
		node.next=head;
		return head;
	}

	
//	************************************************************
//	************************************************************
	
	
	
	/*
	 * insertion at head or insertion at beginning
	 */
	private static Node insertAtHead(Node head, int data) {
		Node node= new Node(data);
		if(head==null)
			node.next=node;
		else {
			Node current=head;
			while(current.next!=head) {
				current=current.next;
			}
			current.next=node;
			node.next=head;
		}
		return node;
	}
	
	/*
	 * insertion at head or insertion at beginning in O(1) time
	 * 
	 */
	private static Node insertAtHead1(Node head, int data) {
		Node node= new Node(data);
		if(head==null) {
			node.next=node;
			return node;
		}
		
		node.next=head.next;
		head.next=node;
		
		//swapping data
		int t = head.data;
		head.data=node.data;
		node.data=t;
		return head;
			
	}

	
}
