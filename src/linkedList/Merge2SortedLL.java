package linkedList;

public class Merge2SortedLL {

	private static void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(" ");
	}


	public static void main(String[] args) {
		Node head1 = new Node(10);
		head1.next=new Node(20);
		head1.next.next=new Node(30);
		head1.next.next.next=new Node(40);
		head1.next.next.next.next=new Node(45);
		
		Node head2 = new Node(5);
		head2.next=new Node(25);
		head2.next.next=new Node(50);
		head2.next.next.next=new Node(54);
		

		Node mergedNode = merge(head1, head2);
		printList(mergedNode);
		
		
	}


	private static Node merge(Node head1, Node head2) {

		Node a=head1, b= head2;
		if(a==null)
			return b;
		if(b==null)
			return a;
		Node head= null, tail=null;
		
		if(a.data<=b.data) {
			head=tail=a;
			a=a.next;
		}else {
			head=tail=b;
			b=b.next;
		}
		
		while(a!=null && b!=null) {
			if(a.data<=b.data) {
				tail.next=a;
				tail=a;
				a=a.next;
			}else {
				tail.next=b;
				tail=b;
				b=b.next;
			}
		}
		if(a==null)
			tail.next=b;
		else
			tail.next=a;
		
		return head;
	}
}

