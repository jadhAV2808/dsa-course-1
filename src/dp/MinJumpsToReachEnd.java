package dp;

import java.util.Arrays;


public class MinJumpsToReachEnd {

	public static void main(String[] args) {
		int[] arr = {3,4,2,1,2,1};
		
		int min = minJumps(arr, arr.length);
		System.out.println("min jumps: "+ min);
		
		min = minJumps1(arr, arr.length);
		System.out.println("min jumps dp: "+ min);
	}
	
	
	
	/*
	 * dp:
	 */
	private static int minJumps1(int[] arr, int n) {
		int[] dp = new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0]=0;
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]+j >= i) {
					if(dp[j]!=Integer.MAX_VALUE)
						dp[i]=Math.min(dp[i], 1+dp[j]);
				}
			}
		}
		
		return dp[n-1];
	}
	
	
	

	/*
	 * recursive
	 */
	private static int minJumps(int[] arr, int n) {
		if(n==1)
			return 0;
		int res = Integer.MAX_VALUE;
		
		for(int i=0;i<=n-2;i++) {
			if(i+arr[i]>=n-1) {
				int subRes = 1+minJumps(arr, i+1);
				if(subRes!=Integer.MAX_VALUE)
					res=Math.min(res, subRes);
			}
		}
		return res;
	}
}
