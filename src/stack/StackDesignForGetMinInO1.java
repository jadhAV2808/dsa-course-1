package stack;

import java.util.Stack;

public class StackDesignForGetMinInO1 {

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		
		minStack.push(2);
		minStack.push(10);
		minStack.push(20);
		minStack.push(2);
		minStack.push(6);
		minStack.push(4);
		System.out.println(minStack.pop());
		System.out.println(minStack.getMin());
	}
}

class MinStack{
	Stack<Integer> stack;
	int min;
	
	public MinStack() {
		stack=new Stack<>();
	}
	
	int getMin() {
		return min;
	}
	
	
	void push(int x) {
		if(stack.isEmpty()) {
			min=x;
			stack.push(x);
		}else if (x<=min) {
			stack.push(x-min);
			min=x;			
		}else {
			stack.push(x);
		}
			
	}
	
	int peek() {
		int t = stack.peek();
		return (t<=0) ? min: t;
	}
	
	int pop() {
		int t=stack.pop();
		int res;
		if(t<=0) {
			res=min;
			min=min-t;
			return res;
		}else
			return t;
	}
}


