package linkedList;

import java.io.ObjectOutputStream;

public class SegregateEvenOdd {

	private static void printList(Node head) {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(" ");
	}


	public static void main(String[] args) {
		Node head = new Node(17);
		head.next=new Node(15);
		head.next.next=new Node(8);
		head.next.next.next=new Node(12);
		head.next.next.next.next=new Node(5);
		head.next.next.next.next.next=new Node(30);
		
		printList(head);
		
		head=segretate(head);
		printList(head);
	}


	/*
	 * naive
	 * 1]find last node ref/pointer by doing traversal
	 * 2] traverse LL again. for every odd node , 
	 *    insert it after the last node & 
	 *    make the newly inserted node as the new last node
	 */
	
	
	
	
	/*
	 * efficient
	 * 4 pointers- evenStart, evenEnd, oddStart,oddEnd
	 */
	private static Node segretate(Node head) {
		Node current=head;
		Node eStart =null, eEnd=null, oStart=null, oEnd=null;
		
		for(Node curr= head; curr!=null; curr=curr.next) {
			int x= curr.data;
			if(x%2==0) {
				if(eStart==null)
					eStart=eEnd=curr;
				else {
					eEnd.next=curr;
					eEnd=eEnd.next;
				}
			}else {
				if(oStart==null)
					oStart=oEnd=curr;
				else {
					oEnd.next=curr;
					oEnd=oEnd.next;
				}
			}
		}                //end of for loop
		
		if(oStart==null || eStart==null)
			return head;
		eEnd.next=oStart;
		oEnd.next=null;

		return eStart;
	}
}
