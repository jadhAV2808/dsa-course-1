package array;


/*
 * max value fo arr[j]-arr[i] such that j>i
 */

public class MaxDifference {

	public static void main(String[] args) {
		
		int[] arr = {2,3,10,6,4,8,1};
		int n = arr.length;
		
		int diff = findMaxDiff(arr, n);
		System.out.println("max diff. is: "+ diff);
		
		diff = findMaxDiff1(arr, n);
		System.out.println("max diff. is: "+ diff);
	}

	/*
	 * naive
	 */
	private static int findMaxDiff(int[] arr, int n) {
		int res = arr[1]-arr[0];
		
		for(int i=0; i<n; i++) {
			
			for(int j=i+1; j<n; j++) {
				res = Math.max(res, arr[j]-arr[i]);
			}
		}
		return res;
	}
	
	/*
	 * efficint
	 */
	private static int findMaxDiff1(int[] arr, int n) {
		
		int res = arr[1]-arr[0];
		int min = arr[0];
		for(int i=1; i<n; i++) {
			res = Math.max(res, arr[i]-min);
			min = Math.min(min, arr[i]);
		}
		return res;
	}
}
