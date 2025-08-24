package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArr {

	public static void main(String[] args) {
		
		int[][] arr = { {10,20,30}, {5,15}, {4,9,11} };
		
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				pQueue.add(arr[i][j]);
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while(!pQueue.isEmpty()) {
			list.add(pQueue.poll());
		}
		
		
		System.out.println(list);
		
	}
	
	
}

