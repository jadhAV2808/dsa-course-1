package recursion;

public class SubsetSum {

	public static void main(String[] args) {
		int[] arr = {10, 5, 2, 3, 6};
		int sum = 8;
		int n = arr.length;
		
		int  subsets = countSubsets(arr, n, sum);
		System.out.println("count of subset: "+ subsets);
		
	}
	
	public static int countSubsets(int[]arr, int n, int sum) {
		if(n==0) {
			return (sum==0) ? 1 : 0;
			
		}
		return countSubsets(arr,n-1,sum) + countSubsets(arr,n-1,sum+ arr[n-1]);
		
	}
}

