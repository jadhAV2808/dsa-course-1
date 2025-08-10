package linkedList;

public class CircularLLTraversal {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);		
		head.next.next.next.next=head;
		
		printCircularLL(head);
		printCircularLL1(head);
	}

	private static void printCircularLL1(Node head) {
		if(head==null)
			return ;
		Node tmp = head;
		do {
			System.out.print(tmp.data+" ");
			tmp=tmp.next;
		}while(tmp!=head);
		System.out.println(" ");
	}
	private static void printCircularLL(Node head) {
		
		if(head==null)
			return;
		System.out.print(head.data+" ");
		for(Node r=head.next; r!=head;r=r.next) {
			System.out.print(r.data+" ");
		}
		System.out.println(" ");
		
	}
}
