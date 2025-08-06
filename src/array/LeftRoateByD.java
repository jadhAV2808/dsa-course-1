package array;

import java.util.Arrays;

public class LeftRoateByD {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		int n =arr.length;
		int d=3;
		System.out.println("Original Arr: "+Arrays.toString(arr));
		
		leftRotate2(arr, n, d);
		System.out.println("Rotated Arr: "+Arrays.toString(arr));
	}
	
	/*
	 * naive
	 */
	private static void leftRotate(int[] arr, int n, int d) {
		for(int i=0;i<d;i++) {
			lRotateOne(arr, n);
		}
	}
	
	private static void lRotateOne(int[] arr, int n) {
		
		int tmp = arr[0];
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1]=tmp;
	}
	
	/*
	 * efficient
	 */
	private static void leftRotate1(int[] arr, int n, int d) {
		int temp[] =new int[d];
		
		for(int i=0;i<d;i++) {
			temp[i] = arr[i];
		}
		
		for(int i=d;i<n;i++) {
			arr[i-d] = arr[i];
		}
		
		for(int i=0;i<d;i++) {
			arr[n-d+i] =temp[i];
		}
	}
	
	/*
	 * more efficient
	 */
	private static void leftRotate2(int[] arr, int n, int d) {
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}

	private static void reverse(int[] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] =arr[end];
			arr[end] = temp;
			
			start++;
			end--;
			
		}
	}
}



