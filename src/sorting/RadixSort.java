package sorting;

import java.util.Arrays;

/*
 * intro:
 * 
 * supports linear sort
 */


/*
 * re-writing numbers with leading zeros
 * stable sort according to the last digit(least significant digit)
 * stable sort according to the middle digit
 * stable sort according to the most significant digit
 */

public class RadixSort {
	
	public static void main(String[] args) {
		int[] arr = {319,212,6,8,100,50 };
		int k=5;
		int n =arr.length;
		sort(arr,n,k);
		System.out.println("Radix-Sorted Arr: "+ Arrays.toString(arr));
		
	}

	private static void sort(int[] arr, int n, int k) {
		int max = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		
		for(int exp=1;max/exp>0;exp=exp*10)
			countingSort(arr,n,exp);
	}

	private static void countingSort(int[] arr, int n, int exp) {
		
		int[] count = new int[10];
		Arrays.fill(arr,0);	
		int[] output = new int[n];
		
		for(int i=0;i<n;i++) {
			count[(arr[i]/exp)%10]++;
		}
		
		for(int i=1;i<10;i++) {
			count[i]=count[i]+count[i-1];
		}
		
		for(int i=n-1;i>=0;i--) {
			output[count[(arr[i]/exp)%10]-1] = arr[i];
			count[(arr[i]/exp)%10]--;
		}
		
		for(int i=0;i<n;i++) {
			arr[i]=output[i];
		}
	}
	

}
