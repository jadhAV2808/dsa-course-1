package linkedList;



public class CircularDLL {
	
	private static void printCircularDLL(DNode head) {
		if(head==null)
			return ;
		DNode tmp = head;
		do {
			System.out.print(tmp.data+" ");
			tmp=tmp.next;
		}while(tmp!=head);
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		
		DNode head = new DNode(10);
		DNode tmp1=new DNode(20);
		DNode tmp2=new DNode(30);
		DNode tmp3=new DNode(40);
		DNode tmp4=new DNode(50);
		
		head.next=tmp1;
		tmp1.prev=head;
		
		tmp1.next=tmp2;
		tmp2.prev=tmp1;
		
		tmp2.next=tmp3;
		tmp3.prev=tmp2;
		
		tmp3.next=tmp4;
		tmp4.prev=tmp3;
		
		head.prev=tmp4;
		tmp4.next=head;
		
		printCircularDLL(head);
		
		head = insertAtHead(head, 5);
		printCircularDLL(head);
		
	}

	private static DNode insertAtHead(DNode head, int data) {
		DNode node= new DNode(data);
		if(head==null) {
			node.next=node;
			node.prev=node;
			return node;
		}
		
		node.prev=head.prev;
		node.next=head;
		head.prev.next=node;
		head.prev=node;
		
		return node;
		
	}
	

}
