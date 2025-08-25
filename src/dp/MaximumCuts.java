package dp;

public class MaximumCuts {

	public static void main(String[] args) {
		int n=5;          //rod lenght
		int a=1,b=2, c=3;     //cut unit
		
		int max = maxCuts(n, a,b,c);
		System.out.println("max cuts: "+ max);
		
		max = maxCuts1(n, a,b,c);
		System.out.println("max cuts: "+ max);
		
	}
	
	
	/*
	 * dp: tabulation
	 * tc:O(n)
	 */
	private static int maxCuts1(int n, int a, int b, int c) {
		int[] dp = new int[n+1];
		dp[0]=0;
		
		for(int i=1;i<=n;i++) {
			dp[i]=-1;
			if(i-a>=0)
				dp[i] = Math.max(dp[i], dp[i-a]);
			if(i-b>=0)
				dp[i]= Math.max(dp[i], dp[i-b]);
			if(i-c>=0)
				dp[i]= Math.max(dp[i], dp[i-c]);
			if(dp[i]!=-1)
				dp[i]++;	
		}
		
		return dp[n];
	}

	/*
	 * recursive
	 */
	private static int maxCuts(int n, int a, int b, int c) {
		
		if(n<0)
			return -1;
		if(n==0)
			return 0;
		int res = Math.max(maxCuts(n-a, a, b, c), 
				Math.max(maxCuts(n-b, a, b, c), 
						maxCuts(n-c, a, b, c)));
		if(res==-1)
			return res;
		else {
			return res+1;
		}
				
	}
}
