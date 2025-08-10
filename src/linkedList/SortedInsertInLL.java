package linkedList;

public class SortedInsertInLL {
	
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
		
		printList(head);
		int data=25;
		head = insert(head,data);
		printList(head);
	}

	private static Node insert(Node head, int data) {
		Node node = new Node(data);
		if(head==null)
		return node;
		if(data<head.data) {
			node.next=head;
			return head;
		}
		Node current=head;
		while(current.data<data) {
			current=current.next;
		}
		node.next=current.next;
		current.next=node;
		return head;
	}
}
