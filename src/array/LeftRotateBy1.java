package array;

import java.util.Arrays;

public class LeftRotateBy1 {

	public static void main(String[] args) {
		int[] arr = {5,8,20,10};
		int n = arr.length;
		
		System.out.println("Original Arr: "+ Arrays.toString(arr));
		
		lRotateOne(arr, n);
		System.out.println("After Rotation : "+ Arrays.toString(arr));
	}

	private static void lRotateOne(int[] arr, int n) {
		
		int tmp = arr[0];
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1]=tmp;
		
	}
}
