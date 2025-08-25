package dp;

import java.util.Arrays;

public class MinCoinsToMakeValue {

	public static void main(String[] args) {
		int[] coins = {25,10,5};
		int value = 30;
		
		int min= getMinCoins(coins, coins.length, value);
		System.out.println("min coins: "+ min);
		
		min= getMinCoins1(coins, coins.length, value);
		System.out.println("min coins: "+ min);
	}
	
	
	
	/*
	 * dp:
	 */
	private static int getMinCoins1(int[] coins, int length, int value) {
		int[] dp = new int[value+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0]=0;
		
		for(int i=1;i<=value;i++) {
			for(int j=0;j<length;j++) {
				if(coins[j]<=i) {
					int subRes = 1+ dp[i-coins[j]];
					if(subRes!=Integer.MAX_VALUE)
						dp[i]=Math.min(dp[i], subRes);
				}
			}
		}
		return dp[value];
	}

	/*
	 * recursive
	 */
	private static int getMinCoins(int[] coins, int length, int value) {
		if(value==0)
			return 0;
		int res = Integer.MAX_VALUE;
		
		for(int i=0;i<length;i++) {
			if(coins[i]<=value) {
				int subRes = 1+getMinCoins(coins, length, value-coins[i]);   // added 1 here bcoz we took 1 coin (value-coins[i])
				if(subRes!=Integer.MAX_VALUE)
					res = Math.min(res, subRes);
			}
		}
		return res;
	}
}
