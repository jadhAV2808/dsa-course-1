package stack;

public class ArrayImplStack {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack(10);
		System.out.println(stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.size());
		System.out.println(stack.peek());
		stack.pop();
//		stack.pop();
//		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
	}
}

class MyStack{
	int[] arr;
	int cap;
	int top;
	
	public MyStack(int c) {
		top=-1;
		cap=c;
		arr=new int[cap];
	}
	
	void push(int x) {
		if(top==cap)
			throw new RuntimeException("Stack overflow");
		top++;
		arr[top]=x;
	}
	
	int pop() {
		if(top==-1)
			throw new RuntimeException("Stack underflow");
		int res= arr[top];
		top--;
		return res;
	}
	
	int peek() {
		if(top==-1)
			throw new RuntimeException("Stack underflow");
		return arr[top];
	}
	
	int size() {
		return top+1;
	}
	
	boolean isEmpty() {
		return top==-1;
	}
}
