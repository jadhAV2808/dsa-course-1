package array;

import java.util.Arrays;

public class RemoveDuplicatesFromSorted {

	public static void main(String[] args) {
		int[] arr = {10,20,20,30,30,30,30};
		int n=7;
		
		int dist = removeDuplicates1(arr,n);
		System.out.println("dist: "+ dist);
		
	}

	/*
	 * naive sol. using temp arr
	 */
	private static int removeDuplicates(int[] arr, int n) {
		
		int[] temp =new int[n];
		temp[0]=arr[0];
		int res=1;
		for(int i=0;i<n;i++) {
			if(arr[i]!=temp[res-1]) {
				temp[res]=arr[i];
				res++;
			}
		}
		Arrays.fill(arr, 0);
		for(int i=0;i<res;i++) {
			arr[i]=temp[i];
		}
		return res;
		
	}
	
	
	/*
	 * efficient
	 */
	private static int removeDuplicates1(int[] arr, int n) {
		int res =1;
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[i-1]) {
				arr[res]=arr[i];
				res++;
			}
		}
		return res;
		
	}
}
