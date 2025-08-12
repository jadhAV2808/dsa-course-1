package queue;

import java.util.Queue;

public class StackImplUsingQueue {

	public static void main(String[] args) {
		
	}
}

class QStack{
	
	Queue<Integer> q1,q2;
	
	int top() {
		return q1.peek();
	}
	
	int pop() {
		return q1.poll();
	}
	
	int size() {
		return q1.size();
	}
	
	void push(int x) {
		while(!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.poll();
		}
		q1.add(x);
		
		while(!q2.isEmpty()) {
			q1.add(q2.peek());
			q2.poll();
		}
	}
}