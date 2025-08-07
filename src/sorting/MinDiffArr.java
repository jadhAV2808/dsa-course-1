package sorting;

import java.util.Arrays;

public class MinDiffArr {

	public static void main(String[] args) {
		int[] arr = {5,3,8,4,7,1,10};
		int n =arr.length;
		
		int diff = mindDiff(arr,n);
		System.out.println("diff: "+ diff);
	}

	private static int mindDiff(int[] arr, int n) {
		Arrays.sort(arr);
		int res = Integer.MAX_VALUE;
		
		for(int i=1;i<n;i++) {
			res = Math.min(res, arr[i]-arr[i-1]);
		}
		return res;
	}
}
