package dp;

/*
 * Given two strings s1 and s2 and below operations that can be performed on s1. The task is to find the minimum number of edits (operations) to convert 's1' into 's2'. 
 * 
 *  Insert: Insert any character before or after any index of s1
	Remove: Remove a character of s1
	Replace: Replace a character at any index of s1 with some other character.
 */


public class EditDistanceProblem {

	public static void main(String[] args) {
		String s1 = "SATURDAY";
		String s2 = "SUNDAY";
		
		int noOfOperations = editDist(s1,s2,s1.length(),s2.length());
		System.out.println("noOfOperations: "+ noOfOperations);
		
		noOfOperations = editDist1(s1,s2,s1.length(),s2.length());
		System.out.println("noOfOperations dp : "+ noOfOperations);
		
		noOfOperations = editDist("CAT","CUT",3,3);
		System.out.println("noOfOperations: "+ noOfOperations);
		
		noOfOperations = editDist1("CAT","CUT",3,3);
		System.out.println("noOfOperations dp : "+ noOfOperations);
		
	}

	/*
	 * dp:tabulation
	 */
	private static int editDist1(String s1, String s2, int m, int n) {
		int[][] dp = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++) {
			dp[i][0]=i;
		}
		
		for(int j=0;j<=n;j++) {
			dp[0][j]=j;
		}
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				
				if(s1.charAt(i-1)==s2.charAt(j-1))
					dp[i][j]=dp[i-1][j-1];
				else
					dp[i][j]= 1 + Math.min(dp[i-1][j], 
							Math.min(dp[i][j-1], 
									dp[i-1][j-1]));
			}
		}
		return dp[m][n];
	}
	
	
	
	
	
	
	
	
	
	
	//*******************************************************8
	/*
	 * recursive
	 */
	private static int editDist(String s1, String s2, int m, int n) {
		if(m==0)
			return n;
		if(n==0)
			return m;
		if(s1.charAt(m-1)==s2.charAt(n-1))
			return editDist(s1, s2, m-1, n-1);
		else 
			return 1+ Math.min(editDist(s1, s2, m, n-1),  //insert
					 Math.min(editDist(s1, s2, m-1, n),   //remove
							 editDist(s1, s2, m-1, n-1)));    //replace
	}
}
