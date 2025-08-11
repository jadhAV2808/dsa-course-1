package stack;

import java.util.Stack;

public class StockSpanProblem {

	public static void main(String[] args) {
		int[] arr = {13,15,12,14,16,8,6,4,10,30};
		int n=arr.length;
		
		
		printSpan(arr,n);
		printSpan2(arr,n);
		
	}

	/*
	 * naive
	 */
	private static void printSpan(int[] arr, int n) {

		for(int i=0;i<n;i++) {
			int span=1;
			for(int j=i-1;j>=0 && arr[j]<=arr[i]; j--) {
				span++;
			}
			System.out.print(span+" ");
		}
		System.out.println(" ");
	}
	
	/*
	 * efficient-1
	 * if there is a greater element on left side then:
	 *    span = (index of current element) - (index of closest greater element on left side)
	 * otherwise:
	 *    span = index of current element + 1  
	 */
	private static void printSpan1(int[] arr, int n) {
		
	}
	
	
	/*
	 * efficient-2
	 * tc: O(n)
	 * sc: O(n)
	 */
	private static void printSpan2(int[] arr, int n) {
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		System.out.print(1+" ");
		
		for(int i=1;i<n;i++) {
			int span=1;
			while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
				stack.pop();
			
			span=stack.isEmpty()? i+1: i-stack.peek();
			System.out.print(span+" ");
			stack.push(i);
		}
		System.out.println(" ");
	}
	
	
	
}
