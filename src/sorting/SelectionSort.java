package sorting;

import java.util.Arrays;

/*
 * one of the basic algo.
 * it does less memory writes compare to QuickSort , mergeSort,InsertionSort etc
 * but cycleSort is optimal in terms of memory writes.
 * not stable.
 * basic idea for heapSort.
 * in-place(does not require extra memory)
 * tc->O(n^2)
 */

public class SelectionSort {
	
	

	public static void main(String[] args) {
		int[] arr = {10,5,8,20,2,18};
		int n=arr.length;
		System.out.println("Original Arr: "+ Arrays.toString(arr));
		
//		sort(arr, n);
		sort1(arr,n);
		System.out.println("Sorted Arr: "+ Arrays.toString(arr));
	}
	
	
	/*
	 * we find out min element & put it at first position, 
	 * then find second min elemenet & put it at second pos. 
	 * and so on ...
	 */
	

	/*
	 * naive
	 * using temp[] arr
	 */
	private static void sort(int[] arr, int n) {
		int[] temp = new int[n];
		for(int i=0;i<n;i++) {
			int mIndex = 0;
			for(int j=1;j<n;j++) {
				if(arr[j]<arr[mIndex])
					mIndex=j;
			}
			temp[i]=arr[mIndex];
			arr[mIndex]=Integer.MAX_VALUE;
		}
		
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
		}
	}
	
	
	/*
	 * efficient 
	 * without temp[] arr(in-place)
	 */
	private static void sort1(int[] arr, int n) {
		
		for(int i=0;i<n;i++) {
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j] < arr[minIndex])
					minIndex=j;
			}
			swap(arr, i, minIndex);
		}
	}
	
	private static void swap(int[] arr, int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
