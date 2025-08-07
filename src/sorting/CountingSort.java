package sorting;

import java.util.Arrays;
/*
 * intro:
 *  linear time algo.
 *  O(n+k) time to sort n elements in range from 0 to k-1.
 *  not a compararison based algo
 *  O(n+k) time
 *  O(n+k) aux. space
 *  stable
 *  used as subroutine in radix sort
 *  
 */

public class CountingSort {

	public static void main(String[] args) {
		int[] arr = {1,4,4,1,0,1};
		int k=5;
		int n =arr.length;
		sort1(arr,n,k);
		System.out.println("Counting-Sorted Arr: "+ Arrays.toString(arr));
		
	}
	
	
	
	/*
	 * efficient
	 */
	private static void sort1(int[] arr, int n, int k) {
		int count[] =new int[k];
		Arrays.fill(count, 0);		
		for(int i=0;i<n;i++) {
			count[arr[i]]++;
		}
		
		for(int i=1;i<k; i++)
			count[i]=count[i-1]+ count[i];
		
		int output[] =new int[n];
		for(int i=n-1;i>=0;i--) {
			output[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		
		for(int i=0;i<n;i++) {
			arr[i]=output[i];
		}
		
	}
	
	
	
	
	
	

	/*
	 * naive-using count[k]
	 */
	private static void sort(int[] arr, int n, int k) {
		int count[] =new int[k];
		Arrays.fill(count, 0);		
		for(int i=0;i<n;i++) {
			count[arr[i]]++;
		}
		
		
		int index = 0;
		for(int i=0;i<k;i++) {
			for(int j=0;j<count[i];j++) {
				arr[index]=i;
				index++;
			}
		}
	}
	
	
	
	
}
