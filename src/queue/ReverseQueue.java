package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		System.out.println(queue.toString());
		
		reverse(queue);
		
		System.out.println(queue.toString());
		
		reverse1(queue);
		
		System.out.println(queue.toString());
	}

	/*
	 * iterative
	 */
	private static void reverse(Queue<Integer> queue) {
		Stack<Integer> stack=new Stack<>();
		while(!queue.isEmpty()) {
			stack.push(queue.poll());
		}
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
	}
	
	/*
	 * recursive
	 */
	private static void reverse1(Queue<Integer> queue) {
		if(queue.isEmpty())
			return;
		int x = queue.poll();
		reverse1(queue);
		queue.add(x);
	}
}
