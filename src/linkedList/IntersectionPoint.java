package linkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionPoint {

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
		
		Node head2 = new Node(9);
		head2.next=head.next.next.next;
		printList(head2);
		
		int node =intersectionPoint(head, head2);
		System.out.println("common point: "+ node);
	}


	/*
	 * by using hashset
	 */
	
	
	
	
	
	/*
	 * by using count of nodes in both cnt1, cnt2
	 * traverse biggest LL abs(c1-c2) times
	 * traverse both LL simulataneously until we find common
	 */
	private static int intersectionPoint(Node head1, Node head2) {
		
		//step1: finding count
		int cnt1=0, cnt2=0;
		Node curr1=head1, curr2=head2;
		while(curr1!=null) {
			cnt1++;
			curr1=curr1.next;
		}
		while(curr2!=null) {
			cnt2++;
			curr2=curr2.next;
		}
		

	    // Step 2: Reset pointers to heads
	    curr1 = head1;
	    curr2 = head2;
		
		//step2: biggest LL traversal abs(c1-c2)
		if(cnt1>cnt2) {
			int d=cnt1-cnt2;
			while(d!=0) {
				curr1=curr1.next;
				d--;
			}
		}else {
			int d=cnt2-cnt1;
			while(d!=0) {
				curr2=curr2.next;
				d--;
			}
		}
		//step3: traverse both LL simulataneously
		while(curr1!=null && curr2!=null) {
			if(curr1==curr2)
				return curr1.data;
			
			curr1 = curr1.next;
	        curr2 = curr2.next;
		}
		return -1;
	}
}
