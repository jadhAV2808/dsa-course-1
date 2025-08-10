package linkedList;


/*
 * pair wise swap nodes of LL
 * ex: 
 * i/p=> 1->2->3->4
 * o/p=> 2->1->4->3
 */

public class PairwiseSwap {

	private static void printList(Node head) {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(" ");
	}


	public static void main(String[] args) {
		Node head = new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		head.next.next.next.next.next=new Node(6);
		
		printList(head);
		
		head = pairSwap(head);
		printList(head);
		
		head = pairSwap1(head);
		printList(head);
		
	}


	/*
	 * naive : swapping data
	 * 
	 * run a loop while we have at least one node ahead.
	 * a] swap data of current node with its next node
	 * b] move current to two nodes ahead
	 */
	private static Node pairSwap(Node head) {
		Node curr=head;
		while(curr!=null && curr.next!=null) {
			
			//swap data of current node with its next node 
			int temp = curr.data;
			curr.data=curr.next.data;
			curr.next.data=temp;
			
			//move current to two nodes ahead
			curr=curr.next.next;			
		}
		return head;
	}
	
	
	
	/*
	 * efficient:by changing links
	 */
	private static Node pairSwap1(Node head) {
		if(head==null || head.next==null)
			return head;
		
		Node curr = head.next.next;
		Node prev=head;
		head=head.next;
		head.next=prev;
		
		while(curr!=null && curr.next!=null) {
			prev.next=curr.next;
			prev=curr;
			
			Node next= curr.next.next;
			curr.next.next=curr;
			curr=next;
		}
		prev.next=curr;
		return head;
	}

}
