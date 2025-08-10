package linkedList;

public class ReverseLLInKGroup {

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
		head.next.next.next.next.next.next=new Node(70);
		
		printList(head);
		
		int k=3;
		head=reverseKGroups(head,k);
		printList(head);
		
	}

	private static Node reverseKGroups(Node head, int k) {
	    Node current = head;
	    int count = 0;

	    // First, check if there are at least k nodes left
	    Node temp = head;
	    for (int i = 0; i < k; i++) {
	        if (temp == null)
	            return head; // Not enough nodes, return as-is
	        temp = temp.next;
	    }

	    // Reverse first k nodes
	    Node prev = null, next = null;
	    while (current != null && count < k) {
	        next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	        count++;
	    }

	    // head is now the last node in the reversed group
	    // Recurse on the rest of the list
	    if (next != null) {
	        head.next = reverseKGroups(next, k);
	    }

	    // prev is the new head after reversing
	    return prev;
	}

}
