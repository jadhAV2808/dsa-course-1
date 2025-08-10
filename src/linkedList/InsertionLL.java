package linkedList;

import java.util.Currency;

public class InsertionLL {
	
	private static void printList(Node head) {
		if(head==null) {
			System.out.println(" ");
			return;
		}
			
		System.out.print(head.data+" ");
		printList(head.next);
	}

	public static void main(String[] args) {
		
//		Node head = new Node(10);
//		head.next=new Node(20);
//		head.next.next=new Node(30);
//		head.next.next.next=new Node(40);
		Node head =null;
		
		head=insertAtBegin(head,30);
		head=insertAtBegin(head,20);
		head=insertAtBegin(head,10);
		
		printList(head);
		
		head = insertAtEnd(head, 70);
		head = insertAtEnd(head, 80);
		head = insertAtEnd(head, 90);
		
		printList(head);
		
		
		head = insertAtPosition(head, 4, 50);
		printList(head);
		
		head = insertAtPosition(head, 5, 60);
		printList(head);
		head = insertAtPosition(head, 6, 100);
		printList(head);
		
	}
	
	
	
	
	
	
	

	/*
	 * insertion ad given position
	 * 
	 * run for pos-2 for inseriton at given position
	 */
	private static Node insertAtPosition(Node head, int pos, int data) {
		Node node = new Node(data);
		if(pos==1) {
			node.next=head;
			return node;
		}
			
		Node tempNode =head;
		int cnt = 0;
		for(int i=1;i<pos-1 && tempNode!=null; i++) {
			tempNode=tempNode.next;
		}
		if(tempNode==null)
			return head;
		
		node.next= tempNode.next;
		tempNode.next=node;
		
		return head;
	}

	/*
	 * insertion at the end
	 */
	private static Node insertAtEnd(Node head, int data) {
		Node node = new Node(data);
		
		if(head==null)
			return node;
		Node temp = head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=node;
		
		return head;
	}
	
	
	

	/*
	 * insertion at beginning
	 */
	private static Node insertAtBegin(Node head, int data) {
		Node newNode =new Node(data);
		newNode.next=head;
		return  newNode;
		
	}
}
