package linkedList;

public class RemoveDuplicatesFromSortedLL {

	
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
		head.next.next.next=new Node(30);
		head.next.next.next.next=new Node(50);
		head.next.next.next.next.next=new Node(50);
		
		printList(head);
		
		head=removeDuplicates(head);
		printList(head);
		
		
	}

	private static Node removeDuplicates(Node head) {
		Node current=head;
		
		while(current!=null && current.next!=null) {
			if(current.data== current.next.data) {
				current.next=current.next.next;
			}else
				current=current.next;
		}
		return head;
	}

}
