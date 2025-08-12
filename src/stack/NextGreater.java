package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		int[] arr = {5,15,10,8,6,12,9,18};
		   //output: 15,18,12,12,12 18 -1
		int n=arr.length;
		
		
		printNextGreater(arr,n);
		printNextGreater1(arr,n);
	}
	

	/*
	 * naive
	 */
	private static void printNextGreater(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			int j;
			for(j=i+1;j<n;j++) {
				if(arr[j]>arr[i]) {
					System.out.print(arr[j]+" ");
					break;
				}
			}
			if(j==n)
				System.out.print(-1+" ");
		}
		System.out.println(" ");
	}
	
	/*
	 * efficient
	 * but it prints output in reverse order, wil use arrayList & thne reverse it
	 */
	private static void printNextGreater1(int[] arr, int n) {
		Stack<Integer>  stack = new Stack<>();
		ArrayList<Integer>list = new ArrayList<>();
		stack.push(arr[n-1]);
//		System.out.print(-1+" ");
		list.add(-1);
		
		for(int i=n-2;i>=0;i--) {
			
			while (!stack.isEmpty() && stack.peek()<=arr[i]) {
				stack.pop();
			}
				
			int tmp = stack.isEmpty() ? -1: stack.peek();
//			System.out.print(tmp+" ");
			list.add(tmp);
			stack.push(arr[i]);
			
		}
		
		Collections.reverse(list);
		System.out.println(list);
	}
	
}
