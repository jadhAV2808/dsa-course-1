package dp;

import java.util.Arrays;

public class LongestCommonSubSeq {
	
	public static void main(String[] args) {
		
		String s1= "ABCDGH";
		String s2= "AEDFHR";
		int m=s1.length();
		int n=s2.length();
		int len = lengthOfLongestCommonSubSeq(s1,s2,m,n);
		System.out.println("length Of Longest Common SubSeq : "+ len);
		
		len = lcsLength(s1,s2,m,n);
		System.out.println("length Of Longest Common SubSeq : "+ len);
		
		len = lcsLength1(s1,s2,m,n);
		System.out.println("length Of Longest Common SubSeq : "+ len);
	}
	
	
	
	/*
	 * dp:tabulation approach
	 * 
	 * tc:O(m*n)
	 * 
	 */
	private static int lcsLength1(String s1, String s2, int m, int n) {
		int[][] dp=new int[m+1][n+1];
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1))
					dp[i][j]=1+ dp[i-1][j-1];
				else
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		
		return dp[m][n];
	}
	
	
	
	
	
	
	
	//***************************************************************************
	
	/*
	 * dp:memoization approach
	 * 
	 * tc:O(m*n)
	 * 
	 */
	private static int lcsLength(String s1, String s2, int m, int n) {
		int[][] memo = new int[m+1][n+1];
		
		// Initialize the memo table with -1
        for (int i = 0; i <= m; i++) {
            Arrays.fill(memo[i], -1);
        }
		
		return findLcs(s1,s2,m,n,memo);
		
	}
		
	private static int findLcs(String s1, String s2, int m, int n, int[][] memo) {
		
		if(memo[m][n]!=-1)
			return memo[m][n];
		 
		if (m == 0 || n == 0)
	            memo[m][n]=0;
		 else {
			 if(s1.charAt(m-1)==s2.charAt(n-1))
				 memo[m][n]= 1+ findLcs(s1, s2, m-1, n-1, memo);
			 else
				 memo[m][n]= Math.max( findLcs(s1, s2, m-1, n, memo),
						 			   findLcs(s1, s2, m, n-1, memo));
		}
		return memo[m][n];
	}

	
	
	

	//***************************************************************************
	

	/*
	 * recursive approach
	 */
	private static int lengthOfLongestCommonSubSeq(String s1, String s2, int m, int n) {
		
		// Base case: If either string is empty, the length of LCS is 0
        if (m == 0 || n == 0)
            return 0;
        
		if(s1.charAt(m-1)==s2.charAt(n-1))
			return 1+ lengthOfLongestCommonSubSeq(s1, s2, m-1, n-1);
		
		else
			return Math.max(lengthOfLongestCommonSubSeq(s1, s2, m, n-1), 
					lengthOfLongestCommonSubSeq(s1, s2, m-1, n));
	}
	
	
	

}
