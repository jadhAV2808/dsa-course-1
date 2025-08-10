package linkedList;

import java.util.Currency;

public class ReverseLL {

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
		
		head=reverse(head);
		printList(head);
		

		head=reverse1(head);
		printList(head);
		
		head=reverse2(head,null);
		printList(head);
	}

	/*
	 * naive- using aux space arr[] 
	 * 
	 */
	
	/*
	 * efficient - by changing links
	 * tc->O(n)
	 * sc->O(1)
	 * iterative solution
	 */
	private static Node reverse(Node head) {
		Node current=head;
		Node prevNode=null;
		
		while (current!=null) {
			Node nextNode=current.next;
			current.next=prevNode;
			prevNode=current;
			current=nextNode;
		}
		return prevNode;
	}
	
	
	/*
	 * efficient - by changing links
	 * tc->O(n)
	 * sc->O(1)
	 * recursive solution
	 */
	private static Node reverse1(Node head) {
		Node current=head;
		if(head==null || head.next==null)
			return head;
		
		
		Node restHead=reverse1(head.next);
		Node restTail=head.next;
		restTail.next=head;
		head.next=null;
		return restHead;
	}
	
	/*
	 * efficient - by changing links
	 * tc->O(n)
	 * sc->O(1)
	 * recursive solution-2
	 */
	private static Node reverse2(Node head, Node prev) {
		
		if(head==null)
			return prev;
		Node currentNode=head;
		Node nextNode=currentNode.next;
		currentNode.next=prev;
		return reverse2(nextNode,currentNode);
				
	}
}
