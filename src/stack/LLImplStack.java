package stack;



public class LLImplStack {
	
	public static void main(String[] args) {
		MyLLStack stack= new MyLLStack();
		
		System.out.println(stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.size());
		System.out.println(stack.peek());
		
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
	}

}

class MyLLStack{
	Node head;
	int size;
	
	public MyLLStack() {
		head=null;
		size=0;
	}
	
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return head==null;
	}
	
	void push(int x) {
		Node node=new Node(x);
		node.next=head;
		head=node;
		size++;	
	}
	
	int pop() {
		if(head==null)
			return Integer.MAX_VALUE;
		
		int res = head.data;
		head=head.next;
		size--;
		return res;
	}
	
	int peek() {
		if(head==null)
			return Integer.MAX_VALUE;
		return head.data;
	}
}


