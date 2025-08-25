package dp;

public class CoinChange {

	public static void main(String[] args) {
		int[] coins = {1,2,3};
		int n=coins.length;
		int sum=4;
		
		int cnt = countWays(coins, n, sum);
		System.out.println("cnt: "+ cnt);
		
		cnt = countWays1(coins, n, sum);
		System.out.println("cnt: "+ cnt);
		
	}
	
	
	/*
	 * dp:tabulation
	 */
	private static int countWays1(int[] coins, int n, int sum) {
		int[][] dp = new int[n + 1][sum + 1];
		
		for(int i=0;i<=n;i++) {
			dp[i][0]=1;
		}
		for(int j=0;j<=n;j++) {
			dp[0][j]=0;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sum;j++) {
				dp[i][j]=dp[i-1][j];
				if(coins[i-1]<=j) {
					dp[i][j]+=dp[i][j-coins[i-1]];
				}
			}
		}
		return dp[n][sum];
	}
	
	

	/*
	 * recursive
	 */
	private static int countWays(int[] coins, int n, int sum) {
		if(sum==0)
			return 1;
		if(sum<0)
			return 0;
		if(n==0)
			return 0;
		
		return countWays(coins, n, sum-coins[n-1]) //include
				+ countWays(coins, n-1, sum);    //not-include
	}
}
