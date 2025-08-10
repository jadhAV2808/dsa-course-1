package linkedList;

/*
 * DoublyLL: 
 *   can be traversed in both direction.
 *   delete in O(1)
 */

public class DoublyLL {
	
	private static void printList(DNode head) {
		DNode temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		
		DNode head = new DNode(10);
		DNode tmp1=new DNode(20);
		DNode tmp2=new DNode(30);
		DNode tmp3=new DNode(40);
		DNode tmp4=new DNode(50);
		
		head.next=tmp1;
		tmp1.prev=head;
		
		tmp1.next=tmp2;
		tmp2.prev=tmp1;
		
		tmp2.next=tmp3;
		tmp3.prev=tmp2;
		
		tmp3.next=tmp4;
		tmp4.prev=tmp3;
		
		printList(head);
		
	}
}

