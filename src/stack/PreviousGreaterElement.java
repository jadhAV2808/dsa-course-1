package stack;

import java.util.Stack;

public class PreviousGreaterElement {

	public static void main(String[] args) {
		
		int[] arr = {15,10,18,12,4,6,2,8};
		int n=arr.length;
		//output: -1, 15,-1,18,12,12,6,12
		
		printPrevGreater(arr,n);
		printPrevGreater1(arr,n);
	}

	/*
	 * naive
	 * tc: O(n^2)
	 */
	private static void printPrevGreater(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			int j;
			
			for(j=i-1;j>=0;j--) {
				if(arr[j]>arr[i]) {
					System.out.print(arr[j]+" ");
					break;
				}
			}
			if(j==-1)
				System.out.print(-1+" ");
		}
		System.out.println(" ");
	}
	
	/*
	 * efficient
	 * tc: O(n)
	 * sc: O(n)
	 */
	private static void printPrevGreater1(int[] arr, int n) {
		Stack<Integer>  stack = new Stack<>();
		stack.push(arr[0]);
		
		for(int i=0;i<n;i++) {
			while(!stack.isEmpty() && stack.peek()<=arr[i]) {
				stack.pop();
			}
			int tmp = stack.isEmpty() ? -1: stack.peek();
			System.out.print(tmp+" ");
			stack.push(arr[i]);				
		}
		System.out.println(" ");
	}
}

