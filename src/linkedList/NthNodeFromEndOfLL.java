package linkedList;

public class NthNodeFromEndOfLL {

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
		
		printList(head);
		
		int n=3;
		
		findNthNode(head,n);
		findNthNode1(head,n);
		
		
	}
	
	
	/*
	 * efficient-> 2 pointer 
	 * 
	 * 1]move first  n position ahead
	 * 2]start second pointer from head
	 * 3] move both first & second at same speed
	 * 4]when first reaches null, second returns the required node
	 */
	private static void findNthNode1(Node head, int n) {
		
		if(head==null)
			return;
		Node first=head, second=head;
		
		for(int i=0;i<n;i++) {
			if(first==null) 
				return ;
			first=first.next;
		}
		while(first!=null) {
			first=first.next;
			second=second.next;
		}
		System.out.println(second.data);
	}
	
	
	
	
	
	

	/*
	 * naive
	 * tc->
	 */
	private static void findNthNode(Node head, int n) {
		int len=0;
		for(Node tmp=head;tmp!=null;tmp=tmp.next)
			len++;
		if(len<n)
			return;
		Node current=head;
		for(int i=0;i<len-n;i++)
			current=current.next;
		
		System.out.println(current.data);
	}
}
