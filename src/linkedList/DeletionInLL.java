package linkedList;

public class DeletionInLL {
	
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
		
		printList(head);
		
		head = deleteFirstNode(head);
		printList(head);
		
		head = deleteTailNode(head);
		printList(head);
		
	}

	/*
	 * deletion of last node
	 */
	private static Node deleteTailNode(Node head) {
		if(head==null || head.next==null)
			return null;
		Node currentNode=head;
		while(currentNode.next.next!=null) {
			currentNode=currentNode.next;			
		}
		currentNode.next=null;
		return head;
	}

	/*
	 * deletion of first node
	 */
	private static Node deleteFirstNode(Node head) {
		if(head==null)
			return null;
		
		return head.next;
	}

}
