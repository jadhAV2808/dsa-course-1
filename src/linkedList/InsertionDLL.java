package linkedList;

public class InsertionDLL {

	
	private static void printList(DNode head) {
		DNode temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
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
		
		printList(head);
		
		head = insertAtBegin(head, 43);
		printList(head);
		
		head = insertAtTail(head, 87);
		printList(head);
		
	}

	/*
	 * insertion at end
	 */
	private static DNode insertAtTail(DNode head, int data) {
		DNode dNode=new DNode(data);
		if(head==null)
			return dNode;
		
		DNode tmp= head;
		while(tmp.next!=null) {
			tmp=tmp.next;
		}
		tmp.next=dNode;
		dNode.prev=tmp;
		return head;
	}

	/*
	 * insertion at beginning
	 */
	private static DNode insertAtBegin(DNode head, int data) {
		DNode dNode=new DNode(data);
		if(head==null)
			return dNode;
		
		dNode.next=head;
		head.prev=dNode;
		return dNode;
	}
}
