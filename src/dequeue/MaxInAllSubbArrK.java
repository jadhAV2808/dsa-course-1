package dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class MaxInAllSubbArrK {

	public static void main(String[] args) {
		int[] arr = {10,8,5,12,15,7,5};
		int n =arr.length;
		int k=3;
		printMaxInSubbArr(arr,n,k);
		printMaxInSubbArr1(arr,n,k);
	}

	/*
	 * naive
	 * tc:O(n^2)
	 */
	private static void printMaxInSubbArr(int[] arr, int n, int k) {
		
		for(int i=0;i<=n-k;i++) {
			int max = arr[i];
			for(int j=i+1;j<i+k;j++) {
				max=Math.max(arr[j], max);
			}
			System.out.print(max+" ");
		}
		System.out.println(" ");
	}
	
	
	/*
	 * efficient - Deque
	 * tc:O(n)
	 */
	private static void printMaxInSubbArr1(int[] arr, int n, int k) {
		
		 Deque<Integer> dq = new LinkedList<>();
		 
		 for (int i = 0; i < n; i++) {
			 
			// Remove indices that are out of the current window
	            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
	                dq.pollFirst();
	            }

	            // Remove elements smaller than current from the back
	            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
	                dq.pollLast();
	            }

	            // Add current element's index
	            dq.offerLast(i);

	            // Print max (from front of deque) for windows of size k
	            if (i >= k - 1) {
	                System.out.print(arr[dq.peekFirst()] + " ");
	            }
		 }
		 System.out.println(" ");
	}
	
}
