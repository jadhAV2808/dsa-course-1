package sorting;

import java.util.Arrays;

/*
 * ex.1] sort a array of 0s,1s & 2s
 * ex.2] 3 way partitioning
 * ex.3] partition around a range
 * 
 */

public class SortArrWith3TypesElements {

	public static void main(String[] args) {
		int[] arr = {1,0,2,0,2,1,1,2,2,1,0};
		int n=arr.length;
		
		segregate(arr,n);
		System.out.println("segregated Arr: "+ Arrays.toString(arr));
	}
	
	/*
	 * naive-temp[]
	 */
	
	

	/*
	 * efficient
	 * tc->O(n)
	 * sc->O(1)
	 */
	private static void segregate(int[] arr, int n) {
		int lo=0, hi=n-1, mid=0;
		
		while(mid<=hi) {
			if(arr[mid]==0) {
				swap(arr,mid,lo);
				lo++;
				mid++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				swap(arr, hi, mid);
				hi--;
			}
		}
	}
	
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}
