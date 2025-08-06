package sorting;

import java.util.Arrays;

/*
 * first element as pivot element
 */

public class HoarePartition {

	public static void main(String[] args) {
		int[] arr = {5,3,8,4,2,7,1,10};
		int n =arr.length;
		
		partition(arr, 0,n-1);
		System.out.println(Arrays.toString(arr));
	}

	private static int partition(int[] arr, int lo, int hi) {
		int p=arr[lo];  // or  p=arr[0];
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

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}
