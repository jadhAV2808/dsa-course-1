package linkedList;

public class DNode {

	int data;
	DNode next;
	DNode prev;
	
	public DNode() {}
	
	public DNode(int data) {
		this.data=data;
		this.next=null;
		this.prev=null;
	}

	@Override
	public String toString() {
		return "DNode [data=" + data + ", next=" + next + ", prev=" + prev + "]";
	}

	
}
