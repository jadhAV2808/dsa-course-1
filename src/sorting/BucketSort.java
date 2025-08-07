package sorting;

import java.util.Arrays;

public class BucketSort {
	
	public static void main(String[] args) {
		int[] arr = {20,80,10,85,75,99,18};
		int k=5; // no of buckets
		int n =arr.length;
		sort(arr,n,k);
		System.out.println("Bucket-Sorted Arr: "+ Arrays.toString(arr));
		
	}

	private static void sort(int[] arr, int n, int k) {
		
	}

}
