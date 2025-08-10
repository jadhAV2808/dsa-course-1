package linkedList;

import java.util.HashMap;
import java.util.Map;

public class CloneLLWithRandomNode {

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
		head.next=new Node(5);
		head.next.next=new Node(20);
		head.next.next.next=new Node(14);
		head.next.next.next.next=new Node(20);

		printList(head);
		
		Node clonedHead = clone(head);
		printList(clonedHead);
		
		Node clonedHead1 = clone1(head);
		printList(clonedHead1);
		
	}


	/*
	 * method-1
	 * tc->O(n)
	 * sc->O(n)
	 * 
	 * 1]create  map
	 * 2] do following for every node curr in the given LL
	 *      m.put(curr, new Node(curr.data))
	 * 3] traverse the givenLL again & fdo the folowing
	 *      Node clone= m.get(curr);
	 *      clone.next=m.get(curr.next);
	 *      clone.random=m.get(curr.random);
	 * 4] return m.get(head)
	 */
	private static Node clone(Node head) {
		Map<Node, Node> map = new HashMap<>();
		
		for(Node curr=head; curr!=null;curr=curr.next) {
			map.put(curr, new Node(curr.data));
		}
		for(Node curr=head;curr!=null;curr=curr.next) {
			Node clone= map.get(curr);
			clone.next=map.get(curr.next);
			
			//if any random link avaialble
			//clone.random=map.get(curr.random);			
		}
		
		return map.get(head);
		
	}
	
	
	/*
	 * method-2
	 * efficient
	 * 
	 * 1] create clone nodes  
	 *     & insert in given LL at alternate positions
	 *     
	 * 2] connect the clone nodes
	 * 
	 * 3] separate the original & cloned nodes
	 */
	private static Node clone1(Node head) {
		Node curr=head;
		while(curr!=null) {
			Node next=curr.next;
			curr.next=new Node(curr.data);
			curr.next.next=next;
			curr=next;
		}
		
		/*
		 * if there is random nodes
		 * 
		for(Node curr1=head;  curr1!=null; curr1=curr1.next) 
			curr1.next.random= (curr1.random == null) ? null : curr1.random.next;
	    */
		
		
		Node head2=head.next;
		Node clone =head2;
		
		for(Node curr1=head;  curr1!=null; curr1=curr1.next) {
			curr1.next=curr1.next.next;
			clone.next=clone.next != null ? clone.next.next : null;
			clone=clone.next;
		}
		return head2;
	}

}
