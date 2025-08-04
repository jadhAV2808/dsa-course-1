package array;

public class SlidingWindowTechnique {
	
	public static void main(String[] args) {
		int[] arr = {1,8,30,-5,20,7};
		int n =arr.length;
		int k=3;
		
//		Ex. find max sum of k consecutive elements
		int maxSum = findMaxSum(arr,n,k);
		System.out.println("max Sum: "+ maxSum);
		
		maxSum = findMaxSum1(arr,n,k);
		System.out.println("max Sum: "+ maxSum);
		
	}

	/*
	 * efficient -> sliding window
	 */
	private static int findMaxSum1(int[] arr, int n, int k) {
		int curr = 0;
		for(int i=0; i<k ;i++) {
			curr +=arr[i];
		}
		int res = curr;
		for(int i=k; i<n;i++) {
			curr = curr+ arr[i]- arr[i-k];
			res = Math.max(res, curr);
		}
		return res;
	}

	/*
	 * naive
	 */
	private static int findMaxSum(int[] arr, int n, int k) {
		int sum = Integer.MIN_VALUE;
		
		for(int i=0;i+k-1<n;i++) {
			int curr = 0;
			 for(int j=0; j<k; j++) {
				 curr+= arr[i+j];
			 }
			sum = Math.max(sum, curr);
		}
		return sum;
	}

}
