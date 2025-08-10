package linkedList;

public class DetectAndRemoveLoop {
	
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
		head.next.next.next.next.next.next=head.next;
		
		head = detectAndRemoveLoop(head);
		printList(head);
		
		
		
	}

	private static Node detectAndRemoveLoop(Node head) {
		
		Node slowNode=head, fastNode =head;
		
		while(fastNode!=null && fastNode.next!=null) {
			slowNode=slowNode.next;
			fastNode=fastNode.next.next;
			
			if(slowNode==fastNode) {
				System.out.println("cycle detected");
				break;
			}
					
		}
		if(slowNode!=fastNode) {
			System.out.println("no loop");
			return head;
			
		}
			
		slowNode=head;
		while(slowNode.next!=fastNode.next) {
			slowNode=slowNode.next;
			fastNode=fastNode.next;
		}
		fastNode.next=null;
		return head;
	}
}
