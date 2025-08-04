package array;

import java.util.Arrays;

public class ReverseArr {

	public static void main(String[] args) {
		int[] arr = {5,8,20,10, 2};
		int n = arr.length;
		
		System.out.println("original Arr: "+ Arrays.toString(arr));
		
		reverse(arr, n);
		
		System.out.println("Reversed Arr: "+ Arrays.toString(arr));
		
	}

	private static void reverse(int[] arr, int n) {
		int start=0, end=n-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
	}
}
