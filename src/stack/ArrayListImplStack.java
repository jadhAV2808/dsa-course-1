package stack;

import java.util.ArrayList;

public class ArrayListImplStack {
	
	public static void main(String[] args) {
		MyArrayListStack stack = new MyArrayListStack();
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


class MyArrayListStack{
	
	ArrayList<Integer> list = new ArrayList<>();
	
	void push(int x) {
		list.add(x);
	}
	
	int pop() {
		int res = list.get(list.size()-1);
		list.remove(list.size()-1);
		return res;
	}
	
	int peek() {
		return list.get(list.size()-1);
	}
	
	int size() {
		return list.size();
	}
	
	boolean isEmpty() {
		return list.isEmpty();
	}
}