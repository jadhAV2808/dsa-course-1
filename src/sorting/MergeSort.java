package sorting;

import java.util.Arrays;

/*
 * Intro:
 *  divide and conquer algo.
 *  stable algo
 *  O(n log n) time & O(n) aux. space
 *  well suited for LL. works in O(1) aux. space
 *  used in External sorting
 *  in general for arrays, Quick-sort outperforms it.
 */

public class MergeSort {
	
	public static void main(String[] args) {
		int[] arr = {10,5,8,20,2,18};
		int n=arr.length;
		System.out.println("Original Arr: "+ Arrays.toString(arr));
		
		mergeSort(arr, 0,n-1);
//		sort1(arr,n);
		System.out.println("Sorted Arr: "+ Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int left, int right) {
		
		if(right>left) {
			int m= left+ (right-left)/2;
			
			mergeSort(arr, left, m);
			mergeSort(arr, m+1, right);
			
			merge(arr,left,m,right);
		}
	}

	private static void merge(int[] arr, int left, int m, int right) {
		
	}

}
