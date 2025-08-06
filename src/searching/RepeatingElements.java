package searching;

import java.util.Arrays;

public class RepeatingElements {

	public static void main(String[] args) {
		int[] arr = {4,2,1,3,2,2};
		int n =arr.length;
		
		int repeatingElement = repeating(arr,n);
		System.out.println("repeating element: "+ repeatingElement);
		
		repeatingElement = repeating1(arr,n);
		System.out.println("repeating element: "+ repeatingElement);
		
		repeatingElement = repeating2(arr,n);
		System.out.println("repeating element: "+ repeatingElement);
		
		repeatingElement = repeating3(arr,n);
		System.out.println("repeating element: "+ repeatingElement);
	}

	/*
	 * naive
	 * tc->O(n^2)
	 * sc->O(n)
	 */
	private static int repeating(int[] arr, int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j])
					return arr[i];
			}
		}
		return -1;
	}
	
	/*
	 * naive: but orignal arr is modified here
	 * tc->O(nlogn)
	 * sc->O(n)
	 */
	private static int repeating1(int[] arr, int n) {
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1])
				return arr[i];
		}
		return -1;
	}
	
	
	/*
	 * efficient
	 * tc->O(n)
	 * sc->O(n)
	 */
	private static int repeating2(int[] arr, int n) {
		boolean[] visited =new boolean[n];
		Arrays.fill(visited, false);
		
		for(int i=0;i<n;i++) {
			if(visited[arr[i]]) {
				return arr[i];
			}
			visited[i]=true;
		}
		return -1;
	}
	
	
	
	/*
	 * efficient
	 * tc->O(n)
	 * sc->O(1)
	 */
	private static int repeating3(int[] arr, int n) {
		int slow = arr[0], fast=arr[0];
		do {
			slow=arr[slow];
			fast=arr[arr[fast]];
		}
		while(slow!=fast);
		
		slow=arr[0];
		while(slow!=fast) {
			slow = arr[slow];
			fast =arr[fast];
		}
		return slow;
	}
}
