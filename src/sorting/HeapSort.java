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
		System.out.println("Heap-Sorted Arr: "+ Arrays.toString(arr));
	}

	private static void sort(int[] arr, int n) {
		//step1: build max  heap
		buildHeap(arr,n);
		
		//step2: repeatedly swap root with last node, 
		//reduce heap size by 1 and heapify
		for(int i=n-1;i>=1;i--) {
			swap(arr, 0, i);
			maxHeapify(arr, i, 0);
		}
	}

	private static void buildHeap(int[] arr, int n) {
		
		for(int i=(n-2)/2; i>=0;i--)
			maxHeapify(arr,n,i);
	}

	private static void maxHeapify(int[] arr, int n, int i) {
		int largest = i, left = 2*i+1,  right = 2*i+2;
		
		//find max between node,left, right
		if(left < n && arr[left]>arr[largest])
			largest=left;
		if(right < n && arr[right]>arr[largest])
			largest=right;
		if(largest!=i) {
			swap(arr,i,largest);
			maxHeapify(arr, n, largest);
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
}
