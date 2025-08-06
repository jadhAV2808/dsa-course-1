package sorting;

import java.util.Arrays;

public class NaivePartition {

	public static void main(String[] args) {
		int[] arr = {3,8,6,12,10,7};
		int pivot =5;        // index of the last element
		int n = arr.length;
		partition(arr, n, 0,n-1,pivot);
		System.out.println("partition: "+ Arrays.toString(arr));
	}

	private static void partition(int[] arr, int n,int lo, int hi, int p) {
		int tmp[] =new int[n];
		int index=0;
		for(int i=lo;i<=hi;i++) {
			if(arr[i]<=arr[p] && i!=p ) {
				tmp[index]=arr[i];
				index++;
			}
		}
		
		tmp[index]=arr[p];
		index++;
		
		for(int i=lo;i<=hi;i++) {
			if(arr[i]> arr[p] ) {
				tmp[index]=arr[i];
				index++;
			}
		}
		
		for(int i=lo;i<=hi;i++) {
			arr[i]=tmp[i-lo];
		}
		
		
	}
}
