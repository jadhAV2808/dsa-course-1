package sorting;

import java.util.Arrays;

/*
 * InsertionSort: 
 *   O(n^2)
 *   in-place (does not use any aux.space) & stable
 *   used in practice for small sized arr
 *   O(n) in best case.
 */

public class InsertionSort {
	
	/*
	 *  we maintain a part sorted and then sort unsorted part
	 */
	
	public static void main(String[] args) {
		int[] arr = {10,5,8,20,18};
		int n=arr.length;
		System.out.println("Original Arr: "+ Arrays.toString(arr));
		
		sort(arr,n);
		System.out.println("Sorted Arr: "+ Arrays.toString(arr));
	}

	private static void sort(int[] arr, int n) {
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

}
