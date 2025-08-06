package array;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] arr = {5,0,8,20,0,10,0};
		int n = arr.length;
		moveZeros1(arr,n);
		System.out.println(Arrays.toString(arr));
	}

	/*
	 * naive 
	 */
	private static void moveZeros(int[] arr, int n) {
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]==0) {
				for(int j=i+1;j<n;j++) {
					
					if(arr[j]!=0) {
						swap(arr, i,j);
					}
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	/*
	 * efficient
	 */
	private static void moveZeros1(int[] arr, int n) {
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				swap(arr, i, cnt);
				cnt++;
			}
		}
	}
		
		
}
