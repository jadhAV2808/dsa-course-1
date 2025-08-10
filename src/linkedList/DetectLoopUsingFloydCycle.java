package linkedList;

public class DetectLoopUsingFloydCycle {

	

	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		head.next.next.next.next.next=new Node(60);
		head.next.next.next.next.next.next=head.next;
		
		boolean isLoop = detectLoop(head);
		System.out.println("isLoop : "+ isLoop);
		
	}

	/*
	 * Initialize slow & fast pointer
	 * slow will move by one & fat by two
	 * if both meets then there is  cycle. else not a cycle
	 */
	private static boolean detectLoop(Node head) {
		
		Node slowNode=head, fastNode =head;
		
		while(fastNode!=null && fastNode.next!=null) {
			slowNode=slowNode.next;
			fastNode=fastNode.next.next;
			
			if(slowNode==fastNode)
				return true;			
		}
		return false;
	}

	
}
