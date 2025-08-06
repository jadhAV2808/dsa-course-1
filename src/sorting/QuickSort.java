package sorting;

import java.util.Arrays;

/*
 * Intro:
 *   divide &nconquer
 *   worst case time: O(n^2)
 *   despite O(n^2) ,it is considered as faster bcoz: 
 *     in-place, cache friendly, avg case is O(nlog n), tail-recursive
 *   partition is key function
 *   not-stable.
 */

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {5,3,8,4,2,7,1,10};
		int n =arr.length;
		
		//using Lomuto-partition
//		sortByLamutoPartition(arr, 0,n-1);
		
		//using Hoare-partition
		sortByHoarePartition(arr, 0,n-1);
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	

	private static void sortByHoarePartition(int[] arr, int lo, int hi) {
		if(lo<hi) {
			int p = hoarePartition(arr,lo,hi);
			
			sortByHoarePartition(arr,lo,p);
			sortByHoarePartition(arr, p+1, hi);
		}
	}

	
	
	private static int hoarePartition(int[] arr, int lo, int hi) {
		int p=arr[lo];
		int i=lo-1, j=hi+1;
		
		while(true) {
			do {
				i++;
			} while(arr[i]<p);
			
			do {
				j--;
			} while(arr[j]>p);
			
			if(i>=j) 
				return j;
			
			swap(arr,i,j);			
		}
		
	}




	//****************************************************************************
	
	private static void sortByLamutoPartition(int[] arr, int lo, int hi) {
		if(lo<hi){
			int p =lomutoPartition(arr,lo,hi);
			
			sortByLamutoPartition(arr,lo,p-1);
			
			sortByLamutoPartition(arr, p+1, hi);
		}
	}
	
	private static int lomutoPartition(int[] arr, int lo, int hi) {
		int p =arr[hi];
		int i=lo-1;
		
		for(int j=lo;j<hi;j++) {
			if(arr[j]<p) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr, i+1,hi);
		return i+1;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
		
	}
}
