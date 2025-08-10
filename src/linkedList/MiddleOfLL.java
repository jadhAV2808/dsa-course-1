package linkedList;

public class MiddleOfLL {

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
//		head.next.next.next.next.next=new Node(60);
		
		printList(head);
		printMiddle(head);
		printMiddle1(head);
		
		
	}

	
	/*
	 * naive
	 */
	private static void printMiddle(Node head) {
		if(head==null)
			return ;
		int cnt=0;
		Node current=head;
		for(current=head;current!=null;current=current.next)
			cnt++;
		current=head;
		for(int i=0;i<cnt/2;i++)
			current=current.next;

		System.out.println(current.data);
	}
	
	
	/*
	 * efficient
	 */
	private static void printMiddle1(Node head) {
		Node slowNode=head, fastNode=head;
		
		while(fastNode!=null && fastNode.next!=null) {
			slowNode=slowNode.next;
			fastNode=fastNode.next.next;
		}			
		System.out.println(slowNode.data);
	}
}
