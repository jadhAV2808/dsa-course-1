package array;


public class MaxSumAubArr {

	public static void main(String[] args) {
		
		int[] arr = {2,3,-8,7,-1,2,3};
		int n=arr.length;
		
		int sum = findMaxSumArr(arr,n);
		System.out.println("sum: "+ sum);
		
		sum = findMaxSumArr1(arr,n);
		System.out.println("sum: "+ sum);
	}
	
	

	/*
	 * naive
	 */
	private static int findMaxSumArr(int[] arr, int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			int current = 0;
			for(int j=i;j<n; j++) {
				current = current+ arr[j];
				res = Math.max(current, res);
			}
		}
		return res;
	}
	
	/*
	 * naive
	 */
	private static int findMaxSumArr1(int[] arr, int n) {
		int res=arr[0];
		int maxEnd = arr[0];
		
		for(int i=0;i<n;i++) {
			maxEnd = Math.max(maxEnd+arr[i], arr[i]);
			res = Math.max(maxEnd, res);
		}
		
		return res;
	}
}
