package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortKSortedArr {
	
	public static void main(String[] args) {
		int[] arr = {9,8,7,19,18};
		int k = 2;
		
		sortK(arr, k);
		
		System.out.println("sroted Arr: "+ Arrays.toString(arr) );
		
		
	}

	private static void sortK(int[] arr, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0;i<=k;i++) {
			pq.add(arr[i]);
		}
		
		int index = 0;
		for(int i=k+1;i<arr.length;i++) {
			arr[index++] = pq.poll();
			pq.add(arr[i]);
		}
		
		while(!pq.isEmpty()) {
			arr[index++] = pq.poll();
		}
	}

}
