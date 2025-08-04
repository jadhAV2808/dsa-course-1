package array;

public class SubArrWithSum {

	public static void main(String[] args) {
		int[] arr = {1,4,20,3,10,5};
		int n =arr.length;
		int sum=33;
		
		boolean isSubArr = isSubArrWithGivenSum(arr,n,sum);
		System.out.println("isSubArr: "+ isSubArr);
		
		isSubArr = isSubArrWithGivenSum1(arr,n,sum);
		System.out.println("isSubArr: "+ isSubArr);
	}

	/*
	 * efficient
	 */
	private static boolean isSubArrWithGivenSum1(int[] arr, int n, int sum) {
		int start = 0;
		int curr = 0;
		for(int end = 0; end<n; end++) {
			curr+=arr[end];
			while(sum<curr) {
				curr-=arr[start];
				start++;
			}
			if(curr == sum)
				return true;
		}
		return false;
	}
	
	
	
	/*
	 * naive
	 */
	private static boolean isSubArrWithGivenSum(int[] arr, int n, int sum) {
		
		for(int i=0;i<n;i++) {
			int curr = 0;
			
			for(int j=i;j<n;j++) {
				curr+= arr[j];
				if(sum==curr)
					return true;
			}	
		}
		return false;
	}
}
