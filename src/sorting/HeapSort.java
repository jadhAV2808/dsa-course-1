package sorting;

import java.util.Arrays;

/*
 * Intro: 
 *   
 */

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = {20,40,50,10,30};
		int n =arr.length;
		sort(arr,n);
		System.out.println("Sorted Arr: "+ Arrays.toString(arr));
	}

	private static void sort(int[] arr, int n) {
		//step1: build max  heap
		buildHeap(arr,n);
	}

	private static void buildHeap(int[] arr, int n) {
		for(int i=(n-2)/2; i>=0;i--)
			maxHeapify(arr,n,i);
	}

	private static void maxHeapify(int[] arr, int n, int i) {
		
	}
}
