package dp;

public class OptimalStrategyForGame {

	public static void main(String[] args) {
		int[] arr = {20,5,4,6};
		int n=arr.length;
		int max = getMax(arr,n);
		System.out.println("max rec1: "+ max);
		
		max = getMax(arr,0,n-1);
		System.out.println("max rec2: "+ max);
		
		max = getMax1(arr,n);
		System.out.println("max dp: "+ max);
	}
	
	
	/*
	 * dp:
	 */
	private static int getMax1(int[] arr, int n) {
		int[][] dp = new int[n][n];
		
		for(int i=0;i<n-1;i++) 
			dp[i][i+1]= Math.max(arr[i], arr[i+1]);
		for(int gap=3;gap<n;gap=gap+2) {
			for(int i=0;i+gap<n;i++) {
				int j=i+gap;
				dp[i][j] = Math.max(arr[i]+ Math.min(dp[i+2][j], dp[i+1][j-1]),
						arr[j]+ Math.min(dp[i+1][j-1], dp[i][j-2]));
			}
		}
		return dp[0][n-1];
	}
	 
	
	/*
	 * recursive-2
	 */
	private static int getMax(int[] arr, int i , int j) {
		
		if(i+1==j)
			return Math.max(arr[i], arr[j]);
		
		int iPick = arr[i] + Math.min(getMax(arr, i+2, j), 
				getMax(arr, i+1, j-1));
		int jPick = arr[j] + Math.min(getMax(arr, i+1, j-1), 
				getMax(arr, i, j-2));
		
		return Math.max(iPick, jPick);
	}
	
	

	/*
	 * recursive-1
	 */
	private static int getMax(int[] arr, int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		return solve(arr,0,n-1,sum);
	}

	private static int solve(int[] arr, int i, int j, int sum) {
	
		if(j==i+1)
			return Math.max(arr[i], arr[j]);
		
		return Math.max(sum-solve(arr, i+1, j,  sum-arr[i]), 
				sum-solve(arr, i, j-1, sum-arr[j]));
	}
}
