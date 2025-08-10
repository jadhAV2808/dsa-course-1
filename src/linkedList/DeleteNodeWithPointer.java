package linkedList;

import java.util.PrimitiveIterator.OfDouble;

/*
 * you given any pointer in LL and need to  delete it 
 * head is not given in input.
 */


public class DeleteNodeWithPointer {
	
	private static void printList(Node head) {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(" ");
	}


	public static void main(String[] args) {
		Node head = new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		head.next.next.next.next.next=new Node(60);
		
		printList(head);
		
		Node pinter =head.next.next.next;
		deletePointer(pinter);
		printList(head);
	}


	private static void deletePointer(Node pointer) {
		if (pointer == null || pointer.next == null) {
	        throw new IllegalArgumentException("Cannot delete the last node or null node using this method.");
//			System.out.println("Cannot delete the last node or null node using this method.");
//			return;
	    }
		pointer.data=pointer.next.data;
		pointer.next=pointer.next.next;
		
	}
}
