package linkedList;

public class SearchInLL {
	
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
		head.next.next.next.next=new Node(5);
		head.next.next.next.next.next=new Node(15);
		
		printList(head);
		
		int data = 17;		
		int pos = searchItr(head,data );
		System.out.println(data+" found at position: "+ pos);
		
		pos = searchRecur(head,data );
		System.out.println(data+" found at position: "+ pos);
	}
	

	/*
	 * recursive solution
	 */
	private static int searchRecur(Node head, int data) {
		int pos=1;
		Node tmpNode = head;
		if(head==null)
			return -1;
		if(head.data==data)
			return 1;
		else {
			int res = searchRecur(head.next, data);
			if(res==-1)
				return -1;
			else 
				return res+1;
		}
		
	}

	/*
	 * iterative solution
	 */
	private static int searchItr(Node head, int data) {
		int pos=1;
		Node tmpNode = head;
		while(tmpNode!=null) {
			if(tmpNode.data==data)
				return pos;
			else {
				pos++;
				tmpNode=tmpNode.next;
			}
		}
		return -1;
	}

}
