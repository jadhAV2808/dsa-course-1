package dp;

public class KnapsackProblem {

	public static void main(String[] args) {
		int[] value = {10,40,30,50};
		int[] wt = {5,4,6,3};
		int n=value.length;
		int W=10;
		
		int maxSum = knapSack(W,wt,value,n);
		System.out.println("max: "+maxSum);
		
		maxSum = knapSack1(W,wt,value,n);
		System.out.println("max dp: "+maxSum);
	}

	
	/*
	 * dp
	 */
	private static int knapSack1(int W, int[] wt, int[] value, int n) {
		int[][] dp = new int[n+1][W+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=W;j++) {
				if(wt[i-1]>j)
					dp[i][j]= dp[i-1][j];
				else
					dp[i][j]= Math.max(dp[i-1][j],
						value[i-1] + dp[i-1][j-wt[i-1]] );
			}
		}
		return dp[n][W];
	}
	
	/*
	 * recursive
	 */
	private static int knapSack(int W, int[] wt, int[] value, int n) {
		if(n==0 || W==0)
			return 0;
		if(wt[n-1]>W)
			return knapSack(W, wt, value, n-1);
		else
			return Math.max(knapSack(W, wt, value, n-1),  //not include
					 value[n-1]+ knapSack(W-wt[n-1], wt, value, n-1)   //include
					);
		
	}
}
