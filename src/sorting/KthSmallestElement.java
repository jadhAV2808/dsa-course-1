package sorting;

import java.util.Arrays;

public class KthSmallestElement {

	public static void main(String[] args) {
		int[] arr = {5,3,8,4,2,7,1,10};
		int n =arr.length;
		int k = 2;
		
		int element = findKthSmallest(arr,n,k);
		System.out.println("KthSmallest: "+ element);
		
		element = findKthSmallest1(arr,n,k);
		System.out.println("KthSmallest: "+ element);
	}
	
	
	
	
	
	private static int findKthSmallest1(int[] arr, int n, int k) {
		int lo=0, hi=n-1;
		
		while(lo<=hi) {
			int p=partition(arr,lo,hi);
			
			if(p==k-1)
				return arr[p];
			else if(p>k-1)
				hi=p-1;
			else
				lo=p+1;
		}
		return -1;
	}
	
	
	private static int partition(int[] arr, int lo, int hi) {
		
		//last element as pivot
		int p = arr[hi];
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
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}










	/*
	 * naive
	 */
	private static int findKthSmallest(int[] arr, int n, int k) {
		Arrays.sort(arr);
		if(n>k)
			return arr[k-1];
		return -1;
	}
	
	
}
