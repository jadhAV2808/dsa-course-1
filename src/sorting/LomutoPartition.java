package sorting;

import java.util.Arrays;

/*
 * pivot is not given. in this we assume  pivot as last element
 */

public class LomutoPartition {

	public static void main(String[] args) {
		int[] arr = {10,80,30,90,40,50,70};
		int n = arr.length;
		
		partition(arr,0,n-1);
		System.out.println("Lomuto partition: "+ Arrays.toString(arr));
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
		int tmp = arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
		
	}
}
