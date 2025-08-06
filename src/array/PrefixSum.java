package array;

public class PrefixSum {

	public static void main(String[] args) {
		int[] arr = {2,8,3,9,6,5,4};
		int n =arr.length;
		
	
		/*
		 * Queries 
		 * getSum(0,2)
		 * getSum(1,3)
		 * getSum(2,6)
		 */
		int sum = getSum(arr, 0,2);
		System.out.println("Sum: "+ sum);
		
		sum = getSum1(arr, 0,2);
		System.out.println("Sum: "+ sum);
	}

	/*
	 * naive
	 */
	private static int getSum(int[] arr, int l, int r) {
		int res = 0;
		for(int i=l;i<=r;i++)
			res+=arr[i];
		return res;
	}
	
	/*
	 * efficient
	 */
	private static int getSum1(int[] arr, int l, int r) {
		int[] prefix = createPrefixArr(arr, arr.length);
		if(l==0)
			return prefix[r];
		return prefix[r]-prefix[l];
	}
	
	
	
	private static int[] createPrefixArr(int[] arr, int n) {
		int[] prefix = new int[n];
		prefix[0]=arr[0];
		for(int i=1; i<n; i++) {
			prefix[i] = prefix[i-1]+ arr[i];
		}
		
		return prefix;
	}
	
	
}
